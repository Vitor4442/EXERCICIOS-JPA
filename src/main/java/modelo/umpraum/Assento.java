package modelo.umpraum;

import jakarta.persistence.*;

@Entity
    @Table (name = "assentos")
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    public Assento(String name) {
        this.name = name;
    }

    public Assento (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
