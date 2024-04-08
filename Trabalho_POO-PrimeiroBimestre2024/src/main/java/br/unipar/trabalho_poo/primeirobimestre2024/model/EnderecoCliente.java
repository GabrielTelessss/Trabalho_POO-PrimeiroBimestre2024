/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalho_poo.primeirobimestre2024.model;

/**
 *
 * @author gabri
 */
public class EnderecoCliente {
    private String rua;
    private int numCasa;
    private String bairro;
    private String estado;
    private String pais;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnderecoCliente{");
        sb.append("rua=").append(rua);
        sb.append(", numCasa=").append(numCasa);
        sb.append(", bairro=").append(bairro);
        sb.append(", estado=").append(estado);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }
}
