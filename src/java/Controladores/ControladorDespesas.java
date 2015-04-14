/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.Despesas;
import RepositorioImplementacoes.RepositorioImpleDespesasBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rackell
 */
@ManagedBean(name = "ControladorD")
@SessionScoped
public class ControladorDespesas {

    private RepositorioInterface.RepositorioInterfaceDespesa despesa;
    private Despesas SelectedD;

    public ControladorDespesas() {
        this.despesa = new RepositorioImpleDespesasBD();
    }

    public String Cadastrar(Despesas despesa) {

        this.despesa.Cadastrar(despesa);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Despesa " + despesa.getNome() + " foi cadastrada com Sucesso!", "Mensagem"));
        return "";
    }

    public String Atualizar(Despesas despesa) {
        this.despesa.Atualizar(despesa);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Despesa " + despesa.getNome() + " foi atualizada com Sucesso!", "Mensagem"));
        return "";

    }

    public Despesas Recuperar(Long id) {
        return (Despesas) this.despesa.Recuperar(id);
    }

    public String Deletar(Despesas despesa) {
        this.despesa.Deletar(despesa);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Despesa " + despesa.getNome() + " foi deletada com Sucesso!", "Mensagem"));
        return "";

    }

    public List<Despesas> RecuperarTodos() {
        return this.despesa.RecuperarTodos();
    }

    public Despesas getSelecteD() {
        return SelectedD;
    }

    public void setSelectedD(Despesas selectedD) {
        this.SelectedD = SelectedD;
    }
}
