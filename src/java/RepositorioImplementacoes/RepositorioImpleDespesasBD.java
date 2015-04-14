/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioImplementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Despesas;
import java.util.List;

/**
 *
 * @author Rackell
 */
public class RepositorioImpleDespesasBD implements RepositorioInterface.RepositorioInterfaceDespesa {

    @Override
    public void Cadastrar(Despesas despesas) {
        DaoManagerHiber.persist(despesas);
    }

    @Override
    public void Atualizar(Despesas despesas) {
        DaoManagerHiber.update(despesas);
    }

    @Override
    public Despesas Recuperar(long id) {
        return (Despesas) DaoManagerHiber.recover("from Despesas where id =" + id).get(0);
    }

    @Override
    public void Deletar(Despesas despesas) {
        DaoManagerHiber.delete(despesas);
    }

    @Override
    public List<Despesas> RecuperarTodos() {
        return (List<Despesas>) DaoManagerHiber.recover("from Despesas");
    }

}
