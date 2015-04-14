
package RepositorioInterface;

import Negocio.Cliente;
import java.util.List;

/**
 *
 * @author Rackell
 */
public interface RepositorioInterfaceCliente {

    public void Cadastrar(Cliente cliente);

    public void Atualizar(Cliente cliente);

    public Cliente Recuperar(long id);

    public void Deletar(Cliente cliente);

    public List<Cliente> RecuperarTodos();

}
