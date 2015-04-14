/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioImplementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Venda;
import java.util.List;

/**
 *
 * @author Rackell
 */
public class RepositrioImpleVendaBD implements RepositorioInterface.RepositorioInterfaceVenda {

    @Override
    public void Cadastrar(Venda venda) {
        DaoManagerHiber.persist(venda);
    }

    @Override
    public void Atualizar(Venda venda) {
        DaoManagerHiber.update(venda);
    }

    @Override
    public Venda Recuperar(long id) {
        return (Venda) DaoManagerHiber.recover("from Venda where id =" + id).get(0);

    }

    @Override
    public void Deletar(Venda venda) {
        DaoManagerHiber.delete(venda);
    }

    @Override
    public List<Venda> RecuperarTodos() {
        return (List<Venda>) DaoManagerHiber.recover("from Venda");
    }

}
