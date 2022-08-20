package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoNacional extends Produto{

    private double impostoNacional;

    public ProdutoNacional(String novaMarca, Tamanho novoTamanho){
        super(novaMarca,novoTamanho);
    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }
}
