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

import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<PessoaJuridica> lista = new ArrayList<>();

    public void inserir(PessoaJuridica pj) {
        lista.add(pj);
    }

    public void alterar(PessoaJuridica pj) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == pj.getId()) {
                lista.set(i, pj);
                return;
            }
        }
    }

    public void excluir(int id) {
        lista.removeIf(pj -> pj.getId() == id);
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pj : lista) {
            if (pj.getId() == id) return pj;
        }
        return null;
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return lista;
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            out.writeObject(lista);
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            lista = (ArrayList<PessoaJuridica>) in.readObject();
        }
    }
}
