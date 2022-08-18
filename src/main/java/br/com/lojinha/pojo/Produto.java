package br.com.lojinha.pojo;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private List<String> itensInclusos;

    // Método
    public double getValor(){
        return this.valor;
    }
    public void  setValor(double novoValor){
        if (novoValor > 0){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novoItensInclusos) {
        this.itensInclusos = novoItensInclusos;
    }
}
