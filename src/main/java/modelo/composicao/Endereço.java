package modelo.composicao;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereço {

    private String logradouro;
    private String complemento;



    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
