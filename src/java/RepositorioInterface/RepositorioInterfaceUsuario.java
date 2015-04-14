/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioInterface;

import Negocio.Usuario;
import java.util.List;

/**
 *
 * @author Rackell
 */
public interface RepositorioInterfaceUsuario {

    public void Cadastrar(Usuario usuario);

    public void Atualizar(Usuario usuario);

    public Usuario Recuperar(long id);

    public void Deletar(Usuario usuario);

    public List<Usuario> RecuperarTodos();

}
