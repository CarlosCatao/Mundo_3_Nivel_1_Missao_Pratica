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

import java.util.Scanner;

public class CadastroPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaFisicaRepo repoFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoJuridica = new PessoaJuridicaRepo();

        String opcao_input;
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Exibir pelo ID");
            System.out.println("5 - Exibir todos");
            System.out.println("6 - Salvar dados");
            System.out.println("7 - Recuperar dados");
            System.out.println("0 - Sair");
            
            while (true) {
                
                System.out.print("Escolha uma Opcao: ");
                opcao_input = sc.nextLine();

                // Verifica se esta vazio ou so tem espacos
                if (opcao_input == null || opcao_input.trim().isEmpty()) {
                    System.out.println("Informe uma Opcao valida.");
                    continue;
                }
                
                // Verifica se numerico
                if (!opcao_input.matches("\\d+")) {
                    System.out.println("Informe apenas numeros.");
                    continue;
                }
                
                // Se passou nos testes anteriores a opcao e valida
                break;
            }            
            
            opcao = Integer.parseInt(opcao_input);

            switch (opcao) {
                case 1: { // Incluir
                    System.out.print("Tipo (F - Fisica, J - Juridica): ");
                    String tipo = sc.nextLine();
                    
                    String id_input;
                    String idade_input;
                    String nome;
                    String cpf;
                    String cnpj;
                    
                    if (tipo.equalsIgnoreCase("F")) {
                        
                        while (true) {
                
                            System.out.print("ID: ");
                            id_input = sc.nextLine();

                            // Verifica se esta vazio ou so tem espacos
                            if (id_input == null || id_input.trim().isEmpty()) {
                                System.out.println("ID tem que ser informado.");
                                continue;
                            }
                
                            // Verifica se numerico
                            if (!id_input.matches("\\d+")) {
                                System.out.println("ID tem que ser numerico.");
                                continue;
                                }
                
                            // Se passou nos testes anteriores o Id e valido
                            break;
                        }            

                        int id = Integer.parseInt(id_input);
                                                                                       
                        while (true) {
                
                            System.out.print("Nome: ");
                            nome = sc.nextLine();

                            // Verifica se esta vazio ou so tem espacos
                            if (nome == null || nome.trim().isEmpty()) {
                                System.out.println("Nome tem que ser informado.");
                                continue;
                            }
                
                            // Se passou nos testes anteriores o Id e valido
                            break;
                        }            
                            
                        while (true) {
                
                            System.out.print("CPF: ");
                            cpf = sc.nextLine();

                            // Verifica se esta vazio ou so tem espacos
                            if (cpf == null || cpf.trim().isEmpty()) {
                                System.out.println("CPF tem que ser informado.");
                                continue;
                            }
                
                            // Se passou nos testes anteriores o Id e valido
                            break;
                        }            

                        while (true) {
                
                            System.out.print("Idade: ");
                            idade_input = sc.nextLine();

                            // Verifica se esta vazio ou so tem espacos
                            if (idade_input == null || idade_input.trim().isEmpty()) {
                                System.out.println("Idade tem que ser informada.");
                                continue;
                            }
                
                            // Verifica se numerico
                            if (!idade_input.matches("\\d+")) {
                                System.out.println("Idade tem que ser numerica.");
                                continue;
                                }
                
                            // Se passou nos testes anteriores o Id e valido
                            break;
                        }            
                        int idade = Integer.parseInt(idade_input);
                        
                        repoFisica.inserir(new PessoaFisica(id, nome, cpf, idade));
                        System.out.println("Pessoa Fisica incluida com sucesso.");
                        
                    } else {
                        if (tipo.equalsIgnoreCase("J")) {
                                    
                            while (true) {
                
                                System.out.print("ID: ");
                                id_input = sc.nextLine();

                                // Verifica se esta vazio ou so tem espacos
                                if (id_input == null || id_input.trim().isEmpty()) {
                                    System.out.println("ID tem que ser informado.");
                                    continue;
                                }
                
                                // Verifica se numerico
                                if (!id_input.matches("\\d+")) {
                                    System.out.println("ID tem que ser numerico.");
                                    continue;
                                    }
                
                                // Se passou nos testes anteriores o Id e valido
                                break;
                            }            

                            int id = Integer.parseInt(id_input);
                                                               
                            while (true) {
                
                                System.out.print("Nome: ");
                                nome = sc.nextLine();

                                // Verifica se esta vazio ou so tem espacos
                                if (nome == null || nome.trim().isEmpty()) {
                                    System.out.println("Nome tem que ser informado.");
                                    continue;
                                }
                
                                // Se passou nos testes anteriores o Id e valido
                                break;
                            }            
                            
                            while (true) {
                
                                System.out.print("CNPJ: ");
                                cnpj = sc.nextLine();

                                // Verifica se esta vazio ou so tem espacos
                                if (cnpj == null || cnpj.trim().isEmpty()) {
                                    System.out.println("CNPJ tem que ser informado.");
                                    continue;
                                }
                
                                // Se passou nos testes anteriores o Id e valido
                                break;
                            }            

                            repoJuridica.inserir(new PessoaJuridica(id, nome, cnpj));
                            System.out.println("Pessoa Juridica incluida com sucesso.");

                        } else {
                            System.out.println("Nao foi informado o tipo de pessoa valido.");
                            break;
                        }
                    }
                    break;
                }
                
                case 2: { // Alterar
                    
                    String tipo;
                    String id_input;
                                
                    while (true) {
                
                        System.out.print("Tipo (F - Fisica, J - Juridica): ");;
                        tipo = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (tipo == null || tipo.trim().isEmpty()) {
                            System.out.println("Tipo de pessoa nao foi informado.");
                            continue;
                        }
                
                        // Verifica tipo valido
                        if (tipo.equalsIgnoreCase("F") || tipo.equalsIgnoreCase("J")) {
                            break;
                        }
                
                        System.out.println("Tipo informado e invalido.");
                    }
                    
                    while (true) {
                
                        System.out.print("ID: ");
                        id_input = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (id_input == null || id_input.trim().isEmpty()) {
                            System.out.println("ID tem que ser informado.");
                            continue;
                        }
                
                        // Verifica se numerico
                        if (!id_input.matches("\\d+")) {
                           System.out.println("ID tem que ser numerico.");
                           continue;
                        }
                
                        // Se passou nos testes anteriores o Id e valido
                        break;
                    }            

                    int id = Integer.parseInt(id_input);

                    if (tipo.equalsIgnoreCase("F")) {
                        
                        PessoaFisica pf = repoFisica.obter(id);
                        
                        if (pf != null) {
                            pf.exibir();
                            
                            System.out.print("Novo nome: ");
                            String novo_nome = sc.nextLine();
                            if (novo_nome != null && !novo_nome.trim().isEmpty()) {
                               pf.setNome(novo_nome);
                            }
                            
                            System.out.print("Novo CPF: ");
                            String novo_cpf = sc.nextLine();
                            if (novo_cpf != null && !novo_cpf.trim().isEmpty()) {
                               pf.setCpf(novo_cpf);
                            }
                        
                        while (true) {
                            System.out.print("Nova idade: ");
                            String nova_idade = sc.nextLine();
                            if (nova_idade != null && !nova_idade.trim().isEmpty()) {
                                try {
                                    pf.setIdade(Integer.parseInt(nova_idade));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Idade deve ser numerica.");
                                    continue;
                                }
                            }
                        }
                            
                        repoFisica.alterar(pf);
                        System.out.println("Pessoa Fisica alterada com sucesso.");
                            
                        } else {
                            System.out.println("Pessoa Fisica nao encontrada.");
                        }
                        
                    } else {
                        
                        PessoaJuridica pj = repoJuridica.obter(id);
                        
                        if (pj != null) {
                            pj.exibir();
                            
                            System.out.print("Novo nome: ");
                            String novo_nome_pj = sc.nextLine();
                            if (novo_nome_pj != null && !novo_nome_pj.trim().isEmpty()) {
                                pj.setNome(novo_nome_pj);
                            }
                            
                            System.out.print("Novo CNPJ: ");
                            String novo_cnpj = sc.nextLine();
                            if (novo_cnpj != null && !novo_cnpj.trim().isEmpty()) {
                                pj.setCnpj(novo_cnpj);
                            }
                            
                            repoJuridica.alterar(pj);
                            System.out.println("Pessoa Juridica alterada com sucesso.");
                            
                        } else {
                            System.out.println("Pessoa Juridica nao encontrada.");
                        }                        
                    }
                    break;
                }
                
                case 3: { // Excluir
                                        
                    String tipo;
                    String id_input;
                    String confirma;
                                
                    while (true) {
                
                        System.out.print("Tipo (F - Fisica, J - Juridica): ");;
                        tipo = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (tipo == null || tipo.trim().isEmpty()) {
                            System.out.println("Tipo de pessoa nao foi informado.");
                            continue;
                        }
                
                        // Verifica tipo valido
                        if (tipo.equalsIgnoreCase("F") || tipo.equalsIgnoreCase("J")) {
                            break;
                        }
                
                        System.out.println("Tipo informado e invalido.");
                    }
                    
                    while (true) {
                
                        System.out.print("ID: ");
                        id_input = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (id_input == null || id_input.trim().isEmpty()) {
                            System.out.println("ID tem que ser informado.");
                            continue;
                        }
                
                        // Verifica se numerico
                        if (!id_input.matches("\\d+")) {
                           System.out.println("ID tem que ser numerico.");
                           continue;
                        }
                
                        // Se passou nos testes anteriores o Id e valido
                        break;
                    }            

                    int id = Integer.parseInt(id_input);

                    if (tipo.equalsIgnoreCase("F")) {
                        
                        PessoaFisica pf = repoFisica.obter(id);
                        
                        if (pf != null) {
                        
                            pf.exibir();
                        
                            while (true) {
                                System.out.print("Confirma (S/N): ");
                                confirma = sc.nextLine();
                                if (confirma.equalsIgnoreCase("S") || confirma.equalsIgnoreCase("N")) {
                                    break;
                                }
                            }

                            if (confirma.equalsIgnoreCase("S")) {
                                repoFisica.excluir(id);
                                System.out.println("Pessoa Fisica excluida com sucesso.");
                            } else {
                                break;
                                }
                        } else {
                            System.out.println("Pessoa Fisica nao encontrada.");
                            break;
                        }

                    } else {
                            
                        PessoaJuridica pj = repoJuridica.obter(id);
                                                
                        if (pj != null) {

                            pj.exibir();
                                                
                            while (true) {
                                System.out.print("Confirma (S/N): ");
                                confirma = sc.nextLine();
                                if (confirma.equalsIgnoreCase("S") || confirma.equalsIgnoreCase("N")) {
                                    break;
                                }
                            }

                            if (confirma.equalsIgnoreCase("S")) {
                                repoJuridica.excluir(id);
                                System.out.println("Pessoa Juridica excluida com sucesso.");
                            } else {
                                break;
                                }
                        } else {
                            System.out.println("Pessoa Juridica nao encontrada.");
                            break;
                        }
                    }
                    break;
                }
                
                case 4: { // Exibir pelo ID
                                                            
                    String tipo;
                    String id_input;
                                
                    while (true) {
                
                        System.out.print("Tipo (F - Fisica, J - Juridica): ");;
                        tipo = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (tipo == null || tipo.trim().isEmpty()) {
                            System.out.println("Tipo de pessoa nao foi informado.");
                            continue;
                        }
                
                        // Verifica tipo valido
                        if (tipo.equalsIgnoreCase("F") || tipo.equalsIgnoreCase("J")) {
                            break;
                        }
                
                        System.out.println("Tipo informado e invalido.");
                    }
                    
                    while (true) {
                
                        System.out.print("ID: ");
                        id_input = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (id_input == null || id_input.trim().isEmpty()) {
                            System.out.println("ID tem que ser informado.");
                            continue;
                        }
                
                        // Verifica se numerico
                        if (!id_input.matches("\\d+")) {
                           System.out.println("ID tem que ser numerico.");
                           continue;
                        }
                
                        // Se passou nos testes anteriores o Id e valido
                        break;
                    }            

                    int id = Integer.parseInt(id_input);
                    
                    if (tipo.equalsIgnoreCase("F")) {
                        PessoaFisica pf = repoFisica.obter(id);
                        if (pf != null) pf.exibir();
                        else System.out.println("Pessoa Fisica nao encontrada.");
                    } else {
                        PessoaJuridica pj = repoJuridica.obter(id);
                        if (pj != null) pj.exibir();
                        else System.out.println("Pessoa Juridica nao encontrada.");
                    }
                    break;
                }
                
                case 5: { // Exibir todos
                                                                                
                    String tipo;
                                
                    while (true) {
                
                        System.out.print("Tipo (F - Fisica, J - Juridica): ");;
                        tipo = sc.nextLine();

                        // Verifica se esta vazio ou so tem espacos
                        if (tipo == null || tipo.trim().isEmpty()) {
                            System.out.println("Tipo de pessoa nao foi informado.");
                            continue;
                        }
                
                        // Verifica tipo valido
                        if (tipo.equalsIgnoreCase("F") || tipo.equalsIgnoreCase("J")) {
                            break;
                        }
                
                        System.out.println("Tipo informado e invalido.");
                    }

                    if (tipo.equalsIgnoreCase("F")) {
                        for (PessoaFisica pf : repoFisica.obterTodos()) {
                            pf.exibir();
                            System.out.println();
                        }
                        System.out.println("<<< Final das Pessoas Fisicas. >>>");
                    } else {
                        for (PessoaJuridica pj : repoJuridica.obterTodos()) {
                            pj.exibir();
                            System.out.println();
                        }
                        System.out.println("<<< Final das Pessoas Juridicas. >>>");
                    }
                    break;
                }
                
                case 6: { // Salvar
                    System.out.print("Prefixo dos arquivos: [pessoas] ");
                    String prefixo = sc.nextLine();
                    if (prefixo == null || prefixo.trim().isEmpty()) {
                        prefixo = "pessoas";
                    }
                    try {
                        repoFisica.persistir(prefixo + "_fisicas.dat");
                        repoJuridica.persistir(prefixo + "_juridicas.dat");
                        System.out.println("<<< Dados salvos com sucesso. >>>");
                    } catch (Exception e) {
                        System.out.println("Erro ao salvar: " + e.getMessage());
                    }
                    break;
                }
                
                case 7: { // Recuperar
                    System.out.print("Prefixo dos arquivos: [pessoas] ");
                    String prefixo = sc.nextLine();
                    if (prefixo == null || prefixo.trim().isEmpty()) {
                        prefixo = "pessoas";
                    }
                    try {
                        repoFisica.recuperar(prefixo + "_fisicas.dat");
                        repoJuridica.recuperar(prefixo + "_juridicas.dat");
                        System.out.println("<<< Dados recuperados com sucesso. >>>");
                    } catch (Exception e) {
                        System.out.println("Erro ao recuperar: " + e.getMessage());
                    }
                    break;
                }
                case 0: {
                    System.out.println("Encerrando o programa...");
                    break;
                }
                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}