/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.Cliente;
import RepositorioImplementacoes.RepositorioImpleClienteBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rackell
 */
@ManagedBean(name = "ControladorC")
@SessionScoped
public class ControladorCliente {

    private RepositorioInterface.RepositorioInterfaceCliente cliente;
    private Cliente SelectedC;

    public ControladorCliente() {
        this.cliente = new RepositorioImpleClienteBD();
    }

    public String Cadastrar(Cliente cliente) {

        this.cliente.Cadastrar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cliente " + cliente.getNome() + " foi cadastrado com Sucesso!", "Mensagem"));
        return "";
    }

    public String Atualizar(Cliente cliente) {
        this.cliente.Atualizar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cliente " + cliente.getNome() + " foi atualizado com Sucesso!", "Mensagem"));
        return "";

    }

    public Cliente Recuperar(Long id) {
        return (Cliente) this.cliente.Recuperar(id);
    }

    public String Deletar(Cliente cliente) {
        this.cliente.Deletar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cliente " + cliente.getNome() + " foi deletado com Sucesso!", "Mensagem"));
        return "";

    }

    public List<Cliente> RecuperarTodos() {
        return this.cliente.RecuperarTodos();
    }

    public Cliente getSelectedC() {
        return SelectedC;
    }

    public void setSelectedC(Cliente selectedC) {
        this.SelectedC = SelectedC;
    }

}
