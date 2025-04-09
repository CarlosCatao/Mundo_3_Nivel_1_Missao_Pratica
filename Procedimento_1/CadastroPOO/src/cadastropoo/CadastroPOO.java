/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

/**
 *
 * Carlos Altomare Catao
 * Estacio - Desenvolvedor Full Stack
 * Periodo 3   -   2025/04
 *
 */

import cadastropoo.model.PessoaFisica;
import cadastropoo.model.PessoaJuridica;
import cadastropoo.model.PessoaFisicaRepo;
import cadastropoo.model.PessoaJuridicaRepo;

public class CadastroPOO {

    public static void main(String[] args) {
        // Instanciando um repositorio de pessoas fisicas (repo1).
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();

        // Adicionando pessoas fisicas, utilizando o construtor completo.
        PessoaFisica pf1 = new PessoaFisica(1, "Ana", "111.111.111-11", 25);
        PessoaFisica pf2 = new PessoaFisica(2, "Carlos", "222.222.222-22", 52);
        PessoaFisica pf3 = new PessoaFisica(3, "Carlos Silva", "111.222.333-44", 30);
        PessoaFisica pf4 = new PessoaFisica(4, "Ana Souza", "555.666.777-88", 18);

        repo1.inserir(pf1);
        repo1.inserir(pf2);
        repo1.inserir(pf3);
        repo1.inserir(pf4);

        // Invoca o metodo de persistencia em repo1, fornecendo o nome de arquivo fixo.
        String arquivoPF = "pessoas_fisicas.dat";
        try {
            repo1.persistir(arquivoPF);
            System.out.println("==> Pessoas fisicas salvas com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao salvar pessoas físicas: " + e.getMessage());
        }

        // Instanciando outro repositorio de pessoas fisicas (repo2).
        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();

        // Invoca o metodo de recuperacao em repo2.
        try {
            repo2.recuperar(arquivoPF);

            // Exibe as informacoes de todas as pessoas fisicas recuperadas.
            System.out.println("\n==> Pessoas Fisicas recuperadas:");
            for (PessoaFisica pf : repo2.obterTodos()) {
                pf.exibir();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar Pessoas Fisicas: " + e.getMessage());
        }

        // Instanciando um repositorio de pessoas juridicas (repo3).
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();

        // Adicionando pessoas juridicas, utilizando o construtor completo.
        PessoaJuridica pj1 = new PessoaJuridica(1, "Tech Ltda", "12.345.678/0001-90");
        PessoaJuridica pj2 = new PessoaJuridica(2, "Comercio XYZ", "98.765.432/0001-10");
        PessoaJuridica pj3 = new PessoaJuridica(3, "XPTO Sales", "333.333.333/0001-33");
        PessoaJuridica pj4 = new PessoaJuridica(4, "XPTO Solutions", "444.444.444/0001-44");

        repo3.inserir(pj1);
        repo3.inserir(pj2);
        repo3.inserir(pj3);
        repo3.inserir(pj4);

        // Invoca o metodo de persistencia em repo3.
        String arquivoPJ = "pessoas_juridicas.dat";
        try {
            repo3.persistir(arquivoPJ);
            System.out.println("==> Pessoas Juridicas salvas com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao salvar Pessoas Juridicas: " + e.getMessage());
        }

        // Instanciando outro repositorio de pessoas juridicas (repo4).
        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();

        // Invoca o método de recuperacao em repo4.
        try {
            repo4.recuperar(arquivoPJ);

            // Exibe as informacoes das pessoas juridicas recuperadas.
            System.out.println("\n==> Pessoas Juridicas recuperadas:");
            for (PessoaJuridica pj : repo4.obterTodos()) {
                pj.exibir();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar Pessoas Juridicas: " + e.getMessage());
        }
    }
}
