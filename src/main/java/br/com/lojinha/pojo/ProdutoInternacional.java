package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{
    private double impostoInternacional;

    public ProdutoInternacional(String novaMarca, Tamanho novoTamanho, double impostoInternacional) {
        super(novaMarca, novoTamanho);
        this.impostoInternacional = impostoInternacional;
    }

    public double getImpostoInternacional() {
        return this.impostoInternacional;
    }

    public void setImpostoInternacional(double novoImpostoInternacional) {
        this.impostoInternacional = novoImpostoInternacional;
    }
}
