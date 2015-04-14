/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioInterface;

import Negocio.Venda;
import java.util.List;

/**
 *
 * @author Rackell
 */
public interface RepositorioInterfaceVenda {

    public void Cadastrar(Venda venda);

    public void Atualizar(Venda venda);

    public Venda Recuperar(long id);

    public void Deletar(Venda venda);

    public List<Venda> RecuperarTodos();

}
