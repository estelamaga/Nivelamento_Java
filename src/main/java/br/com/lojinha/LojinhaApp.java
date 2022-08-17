package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.setNome("Play4");
        meuProduto.setValor(20.50);
        meuProduto.setMarca("Sony");
        meuProduto.setItensInclusos("controle e 3 jogos");
        meuProduto.setTamanho("Médio");

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());
    }
}
