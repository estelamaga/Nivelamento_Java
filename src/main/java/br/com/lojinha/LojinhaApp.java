package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

        Produto meuProduto = new Produto("Nestle", Tamanho.Medio);
        meuProduto.setNome("Play4");
        meuProduto.setValor(20.50);

        List<ItemIncluso> itensInclusos =  new ArrayList<>();
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getTamanho());
//        System.out.println(meuProduto.getItensInclusos());
//        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
//        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        /*
        Com o laço de repetição for é possível navega por uma lista
         */
        for (ItemIncluso itensAtual : meuProduto.getItensInclusos()){
            System.out.println(itensAtual.getNome());
            System.out.println(itensAtual.getQuantidade());
        }
    }
}
