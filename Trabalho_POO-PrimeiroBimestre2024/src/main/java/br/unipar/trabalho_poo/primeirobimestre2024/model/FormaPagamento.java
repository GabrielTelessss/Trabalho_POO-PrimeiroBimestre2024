/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalho_poo.primeirobimestre2024.model;

/**
 *
 * @author gabri
 */
public class FormaPagamento {
    private String tipo;
    public double valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FormaPagamento{");
        sb.append("tipo=").append(tipo);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
