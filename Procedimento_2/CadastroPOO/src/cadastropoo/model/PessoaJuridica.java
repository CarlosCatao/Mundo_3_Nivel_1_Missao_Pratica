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

// Classe PessoaJuridica herdando de Pessoa
public class PessoaJuridica extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cnpj;

    // Construtor padrao (sem parametros)
    public PessoaJuridica() {
        super(); // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }

    // Construtor completo (com parametros)
    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome); // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }
    
    // Getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Setter para o CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Metodo exibir (polimorfismo)
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CNPJ:  " + cnpj);
    }
}
