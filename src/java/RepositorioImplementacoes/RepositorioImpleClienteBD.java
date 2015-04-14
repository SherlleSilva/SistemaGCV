/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioImplementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Cliente;
import java.util.List;

/**
 *
 * @author Rackell
 */
public class RepositorioImpleClienteBD implements RepositorioInterface.RepositorioInterfaceCliente {

    @Override
    public void Cadastrar(Cliente cliente) {
        DaoManagerHiber.persist(cliente);
    }

    @Override
    public void Atualizar(Cliente cliente) {
        DaoManagerHiber.update(cliente);
    }

    @Override
    public Cliente Recuperar(long id) {
        return (Cliente) DaoManagerHiber.recover("from Cliente where id =" + id).get(0);

    }

    @Override
    public void Deletar(Cliente cliente) {
        DaoManagerHiber.delete(cliente);
    }

    @Override
    public List<Cliente> RecuperarTodos() {
        return (List<Cliente>) DaoManagerHiber.recover("from Cliente");

    }

}
