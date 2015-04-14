package Negocio;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean(name = "cliente")
@RequestScoped
@Entity
public class Cliente implements Serializable {

  
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "Nome", length = 50)
    private String nome;
    
    @Column(name = "Celular", length = 15) 
    private String celular;
    
    @Embedded
    private Endereco endereco = null;

    public Cliente() {
    }

    public Cliente(long id, String nome, String celular, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}