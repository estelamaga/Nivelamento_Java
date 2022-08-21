package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

/*
   Polimorfismo você extende uma classe de uma determinada classe Pai
   você pega qualquer método da classe Pai e reescreve o método igual está na classe Pai.
   vai aparecer um Overridden.
 */
public class ProdutoInternacional extends Produto implements Favorito {
    private double impostoInternacional;

    public ProdutoInternacional(String novaMarca, Tamanho novoTamanho) {
        super(novaMarca, novoTamanho);
    }

    public void  setValor(double novoValor){
        // Regra novo valor maior que -100
        if (novoValor > -100){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100.00");
        }
    }

    public double getImpostoInternacional() {
        return this.impostoInternacional;
    }

    public void setImpostoInternacional(double novoImpostoInternacional) {
        this.impostoInternacional = novoImpostoInternacional;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }
}
