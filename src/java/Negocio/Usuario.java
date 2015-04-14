/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@ManagedBean(name = "user")
@RequestScoped
@Embeddable
public class Usuario implements Serializable {

    private long id;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Senha",length = 12)
    private String senha;

    @Deprecated
    public Usuario() {
    }

    public Usuario(long id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
