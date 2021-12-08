package br.com.lojinha.pojo;

import java.util.List;

public class ItensAdicionais {
    private String nomeItem;
    private int quantidadeItem;

    public ItensAdicionais(int quantidadeItemInicial, String nomeItemInicial) {
        this.quantidadeItem = quantidadeItemInicial;
        this.nomeItem = nomeItemInicial;
    }

    public int getQuantidadeItem() {
        return this.quantidadeItem;
    }

    public void setQuantidadeItem(int NovaQuantidadeItem) {
        this.quantidadeItem = NovaQuantidadeItem;
    }

    public String getNomeItem() {
        return this.nomeItem;
    }

    public void setNomeItem(String novoNomeItem) {
        this.nomeItem = novoNomeItem;
    }

}
