package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.setNome("Play4");
        meuProduto.setValor(20.50);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho("Médio");

        List<String> itensInclusos =  new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 jogos");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getItensInclusos().get(1));
    }
}
