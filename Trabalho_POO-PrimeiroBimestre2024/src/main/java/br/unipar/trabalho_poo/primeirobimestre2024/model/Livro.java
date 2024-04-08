/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalho_poo.primeirobimestre2024.model;

import java.util.List;

/**
 *
 * @author gabri
 */
public class Livro {

    private String tituloLivro;
    private String editora;
    private List<String> autores;
    private int anoLancamento;
    private String generos;
    private int numPag;
    private int quantEstoque;
    private double precoVenda;

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("tituloLivro=").append(tituloLivro);
        sb.append(", editora=").append(editora);
        sb.append(", autores=").append(autores);
        sb.append(", anoLancamento=").append(anoLancamento);
        sb.append(", generos=").append(generos);
        sb.append(", numPag=").append(numPag);
        sb.append(", quantEstoque=").append(quantEstoque);
        sb.append(", precoVenda=").append(precoVenda);
        sb.append('}');
        return sb.toString();
    }

   
    
    }
