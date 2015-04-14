/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioImplementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Compra;
import java.util.List;

/**
 *
 * @author Rackell
 */
public class RepositorioImpleCompraBD implements RepositorioInterface.RepositorioInterfaceCompra {

    @Override
    public void Cadastrar(Compra compra) {
        DaoManagerHiber.persist(compra);
    }

    @Override
    public void Atualizar(Compra compra) {
        DaoManagerHiber.update(compra);
    }

    @Override
    public Compra Recuperar(long id) {
        return (Compra) DaoManagerHiber.recover("from Compra where id =" + id).get(0);

    }

    @Override
    public void Deletar(Compra compra) {
        DaoManagerHiber.delete(compra);
    }

    @Override
    public List<Compra> RecuperarTodos() {
        return (List<Compra>) DaoManagerHiber.recover("from Compra");
    }

}
