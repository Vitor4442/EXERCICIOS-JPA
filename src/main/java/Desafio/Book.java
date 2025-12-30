package Desafio;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends Publication {
    private int pages;
}
