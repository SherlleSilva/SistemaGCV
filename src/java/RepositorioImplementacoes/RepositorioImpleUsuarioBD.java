/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositorioImplementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Usuario;
import java.util.List;

/**
 *
 * @author Rackell
 */
public class RepositorioImpleUsuarioBD implements RepositorioInterface.RepositorioInterfaceUsuario {

    @Override
    public void Cadastrar(Usuario usuario) {
        DaoManagerHiber.persist(usuario);
    }

    @Override
    public void Atualizar(Usuario usuario) {
        DaoManagerHiber.update(usuario);
    }

    @Override
    public Usuario Recuperar(long id) {
        return (Usuario) DaoManagerHiber.recover("from Usuario where id =" + id).get(0);

    }

    @Override
    public void Deletar(Usuario usuario) {
        DaoManagerHiber.delete(usuario);
    }

    @Override
    public List<Usuario> RecuperarTodos() {
        return (List<Usuario>) DaoManagerHiber.recover("from Usuario");
    }

}
