package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaDeImportacao() {
        return this.taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double novaTaxaDeImportacao) {
        this.taxaDeImportacao = novaTaxaDeImportacao;
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("VALORES DEVEM SER MAIORES QUE -100 !!!");
        }
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + getMarca() + " e " + getValor();
    }
}
