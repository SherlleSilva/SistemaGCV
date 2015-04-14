/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.Compra;
import RepositorioImplementacoes.RepositorioImpleCompraBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rackell
 */
@ManagedBean(name = "ControladorCo")
@SessionScoped
public class ControladorCompra {

    private RepositorioInterface.RepositorioInterfaceCompra compra;
    private Compra SelectedCo;

    public ControladorCompra() {
        this.compra = new RepositorioImpleCompraBD();
    }

    public String Cadastrar(Compra compra) {

        this.compra.Cadastrar(compra);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Compra " + compra.getData() + " foi cadastrada com Sucesso!", "Mensagem"));
        return "";
    }

    public String Atualizar(Compra compra) {
        this.compra.Atualizar(compra);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Compra " + compra.getData() + " foi atualizada com Sucesso!", "Mensagem"));
        return "";

    }

    public Compra Recuperar(Long id) {
        return (Compra) this.compra.Recuperar(id);
    }

    public String Deletar(Compra compra) {
        this.compra.Deletar(compra);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Compra " + compra.getData() + " foi deletada com Sucesso!", "Mensagem"));
        return "";

    }

    public List<Compra> RecuperarTodos() {
        return this.compra.RecuperarTodos();
    }

    public Compra getSelectedCo() {
        return SelectedCo;
    }

    public void setSelectedCo(Compra selectedCo) {
        this.SelectedCo = SelectedCo;
    }

}
