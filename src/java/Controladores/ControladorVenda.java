/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.Venda;
import RepositorioImplementacoes.RepositrioImpleVendaBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rackell
 */
@ManagedBean(name = "ControladorV")
@SessionScoped
public class ControladorVenda {

    private RepositorioInterface.RepositorioInterfaceVenda venda;
    private Venda SelectedV;

    public ControladorVenda() {
        this.venda = new RepositrioImpleVendaBD();
    }

    public String Cadastrar(Venda venda) {

        this.venda.Cadastrar(venda);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Venda " + venda.getDate() + " foi cadastrada com Sucesso!", "Mensagem"));
        return "";
    }

    public String Atualizar(Venda venda) {
        this.venda.Atualizar(venda);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Venda " + venda.getDate() + " foi atualizada com Sucesso!", "Mensagem"));
        return "";

    }

    public Venda Recuperar(Long id) {
        return (Venda) this.venda.Recuperar(id);
    }

    public String Deletar(Venda venda) {
        this.venda.Deletar(venda);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Venda " + venda.getDate() + " foi deletada com Sucesso!", "Mensagem"));
        return "";

    }

    public List<Venda> RecuperarTodos() {
        return this.venda.RecuperarTodos();
    }

    public Venda getSelecteV() {
        return SelectedV;
    }

    public void setSelectedV(Venda selectedV) {
        this.SelectedV = SelectedV;
    }

}
