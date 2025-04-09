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

public class PessoaFisica extends Pessoa implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String cpf; // Campo para armazenar o CPF
    private int idade;  // Campo para armazenar a idade

    // Construtor padrao (sem parametros)
    public PessoaFisica() {
        super(); // Chama o construtor da classe Pessoa
        this.cpf = "";
        this.idade = 0;
    }

    // Construtor completo (com parametros)
    public PessoaFisica(int id, String nome, String cpf, int idade) {
        super(id, nome); // Chama o construtor da classe Pessoa
        this.cpf = cpf;
        this.idade = idade;
    }

    // Getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Setter para o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Metodo exibir (polimorfismo)
    @Override
    public void exibir() {
        // Chama o método exibir da classe Pessoa para exibir id e nome
        super.exibir();
        // Exibe CPF e idade específicos para PessoaFisica
        System.out.println("CPF:   " + cpf + "\nIdade: " + idade);
    }

}
