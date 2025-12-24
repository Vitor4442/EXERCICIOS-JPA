package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteConexao {
    public static void main(String[] args) {
        try {
            // O nome "meuPU" deve ser igual ao nome no seu persistence.xml
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
            EntityManager em = emf.createEntityManager();

            System.out.println("------------------------------------------");
            System.out.println("Conexão com PostgreSQL efetuada com sucesso!");
            System.out.println("------------------------------------------");
            em.close();
            emf.close();
        } catch (Exception e) {
            System.err.println("------ ERRO NA CONEXÃO ------");
            e.printStackTrace();
        }
    }
}