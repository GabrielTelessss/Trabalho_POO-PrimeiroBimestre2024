/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.trabalho_poo.primeirobimestre2024;

import br.unipar.trabalho_poo.primeirobimestre2024.model.Clientes;
import br.unipar.trabalho_poo.primeirobimestre2024.model.EnderecoCliente;
import br.unipar.trabalho_poo.primeirobimestre2024.model.FormaPagamento;
import br.unipar.trabalho_poo.primeirobimestre2024.model.Livro;
import br.unipar.trabalho_poo.primeirobimestre2024.model.Venda;
import br.unipar.trabalho_poo.primeirobimestre2024.model.VendaItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Trabalho_POOPrimeiroBimestre2024 {

    public static void main(String[] args) {        
        List<String> autoresLivro1 = new ArrayList<>();
        autoresLivro1.add("Deitel");
           
        Livro livro1 = new Livro();
        livro1.setTituloLivro("Java: Como Programar");
        livro1.setEditora("Pearson");
        livro1.setAutores(autoresLivro1);
        livro1.setAnoLancamento(2020);
        livro1.setGeneros("Programação");
        livro1.setNumPag(1200);
        livro1.setQuantEstoque(15);
        livro1.setPrecoVenda(200.00);
        
        
        EnderecoCliente endCliente1 = new EnderecoCliente();
        endCliente1.setRua("R. Antonio Gaffuri");
        endCliente1.setNumCasa(354);
        endCliente1.setBairro("Gisela");
        endCliente1.setEstado("PR");
        endCliente1.setPais("Brasil");
        
        Clientes cliente1 = new Clientes();
        cliente1.setNomeCliente("Gabriel Teles");
        cliente1.setEnderecoCliente(endCliente1);
        
        VendaItem item1 = new VendaItem();
        item1.setLivro(livro1);
        item1.setQuantidade(5);
        item1.setValorDesconto(10.00);
   
        VendaItem item2 = new VendaItem();
        item2.setLivro(livro1);
        item2.setQuantidade(2);
        item2.setValorDesconto(2.00);
        
        List<VendaItem> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        
        FormaPagamento cartaoCredito = new FormaPagamento();
        cartaoCredito.setTipo("Cartão de Crédito");
        cartaoCredito.setValor(510.00);
        
        FormaPagamento dinheiro = new FormaPagamento();
        dinheiro.setTipo("Dinheiro");
        dinheiro.setValor(836.00);
        
        List<FormaPagamento> formaPagamentos = new ArrayList<>();
        formaPagamentos.add(cartaoCredito);
        formaPagamentos.add(dinheiro);
        
        Venda venda = new Venda();
        venda.setItens(itens);
        venda.setFormaPagamento(formaPagamentos);
        double calcularValorTotal = venda.getValorTotal();
        venda.setValorTotal(calcularValorTotal);
        
        System.out.println("Informações da Venda");
        System.out.println(venda);
        System.out.println("Informações do Cliente");
        System.out.println(cliente1);
    }    
    
}
