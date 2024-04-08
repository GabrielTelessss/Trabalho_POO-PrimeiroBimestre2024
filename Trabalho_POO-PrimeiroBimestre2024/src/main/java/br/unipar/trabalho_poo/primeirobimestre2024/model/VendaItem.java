/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalho_poo.primeirobimestre2024.model;

/**
 *
 * @author gabri
 */
public class VendaItem {
    private Livro livro;
    private int quantidade;
    private double valorDesconto;
    public double calcularValorTotal;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public double calcularValorTotal(){
        return(livro.getPrecoVenda() - valorDesconto) * quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VendaItem{");
        sb.append("livro=").append(livro);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", valorDesconto=").append(valorDesconto);
        sb.append('}');
        return sb.toString();
    }

    
}
