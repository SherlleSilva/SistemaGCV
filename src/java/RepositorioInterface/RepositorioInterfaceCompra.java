/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RepositorioInterface;

import Negocio.Compra;
import java.util.List;

/**
 *
 * @author Rackell
 */
public interface RepositorioInterfaceCompra {
    
    public void Cadastrar( Compra compra);

    public void Atualizar(Compra compra);

    public Compra Recuperar(long id);

    public void Deletar(Compra compra);

    public List<Compra> RecuperarTodos();
    
    
}
