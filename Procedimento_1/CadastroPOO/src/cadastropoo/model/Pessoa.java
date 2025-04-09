/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * Carlos Altomare Catao
 * Estacio - Desenvolvedor Full Stack
 * Periodo 3   -   2025/04
 *
 */

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;      // Campo para armazenar o id
    private String nome; // Campo para armazenar o nome

    // Construtor padrao (sem parametros)
    public Pessoa() {
        this.id = 0;    // Valor padrao para id
        this.nome = ""; // Valor padrao para nome
    }

    // Construtor completo (com parametros)
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getter para o id
    public int getId() {
        return id;
    }

    // Setter para o id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo para exibir os dados da pessoa
    public void exibir() {
        System.out.println("ID:    " + id + "\nNome:  " + nome);
    }

}
