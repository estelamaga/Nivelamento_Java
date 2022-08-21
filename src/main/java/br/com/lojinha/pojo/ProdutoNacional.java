package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

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
    @Override
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }
}
