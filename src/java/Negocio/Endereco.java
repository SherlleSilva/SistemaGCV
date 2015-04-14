package Negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable {

    @Column(name = "Rua", length = 40)
    private String rua;
    @Column(name = "Numero", length = 30)
    private String numero;
    @Column(name = "Bairro", length = 30)
    private String bairro;
    @Column(name = "Cidade", length = 30)
    private String cidade;

    
    
    @Deprecated
    public Endereco() {
    }

    public Endereco(String rua, String bairro, String numero, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
    }

   
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
