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
public class Venda {
    private List<VendaItem> itens;
    private List<FormaPagamento> formaPagamento;
    private double valorTotal;

    public List<VendaItem> getItens() {
        return itens;
    }

    public void setItens(List<VendaItem> itens) {
        this.itens = itens;
    }

    public List<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(List<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        valorTotal = 0;
        for(VendaItem item : itens){
        valorTotal += item.calcularValorTotal();
        }
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda{");
        sb.append("itens=").append(itens);
        sb.append(", formaPagamento=").append(formaPagamento);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append('}');
        return sb.toString();
    }
    
    
}
