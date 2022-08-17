package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.nome = "Play4";
        meuProduto.valor = 4999.99;
        meuProduto.marca = "Sony";
        meuProduto.itensInclusos = "controle e 3 jogos";
        meuProduto.tamanho = "Médio";
        System.out.println(meuProduto.nome);
    }
}
