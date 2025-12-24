package modelo.basico;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;
    private String emaiil;

    public Usuario(String nome, String emaiil) {
        this.nome = nome;
        this.emaiil = emaiil;
    }

    public Usuario() {

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

    public String getEmaiil() {
        return emaiil;
    }

    public void setEmaiil(String emaiil) {
        this.emaiil = emaiil;
    }
}
