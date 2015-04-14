package Controladores;

import Negocio.Criptografia;
import Negocio.Usuario;
import RepositorioInterface.RepositorioInterfaceUsuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "ControladorUser")
@SessionScoped
public class ControladorUsuario implements Serializable {

    private RepositorioInterfaceUsuario us = null;
    private boolean loggedIn = false;
    private String email = null;

    public String login(Usuario user) {
        user.setSenha(Criptografia.criptografar(user.getSenha()));
        RequestContext context = RequestContext.getCurrentInstance();
        if (user.getEmail().equals("") || user.getEmail() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o EMAIL!", ""));
        }
        if (user.getSenha().equals("") || user.getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a senha!", ""));
        }
        if (user.getEmail().equals("") || user.getEmail() == null || user.getSenha().equals("") || user.getSenha() == null) {
            return null;
        }
        Usuario u = null;
        List<Usuario> usu = this.us.RecuperarTodos();

        for (int i = 0; i < usu.size(); i++) {
            if (user.getEmail().equals(usu.get(i).getEmail())) {
                u = usu.get(i);
            }
        }

        if (u == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email não cadastrado!", ""));
            return "";
        }
        if (user.getEmail().equals(u.getEmail())) {
            if (user.getSenha().equals(u.getSenha())) {
                loggedIn = true;
                this.email = u.getEmail();

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha invalida!", ""));
                return "";
            }
        }

        loggedIn = true;
        context.addCallbackParam("loggedIn", loggedIn);
        return "/MenuPrincipal.xhtml";
    }

    private boolean validarEmail(String email) {
        String padrao = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return padrao.matches(email);
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }

    public void sair() {
        this.loggedIn = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
