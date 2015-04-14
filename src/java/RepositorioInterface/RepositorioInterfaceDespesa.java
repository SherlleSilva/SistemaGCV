/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioInterface;

import Negocio.Despesas;
import java.util.List;

/**
 *
 * @author Rackell
 */
public interface RepositorioInterfaceDespesa {

    public void Cadastrar(Despesas despesas);

    public void Atualizar(Despesas despesas);

    public Despesas Recuperar(long id);

    public void Deletar(Despesas despesas);

    public List<Despesas> RecuperarTodos();

}
