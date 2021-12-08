package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    //Definindo os Atributos
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    //private List<String> itensIclusos;
    private List<ItensAdicionais> itensAdicionais;

    //Definindo os Construtores: Comandos que serão iniciados durante a instanciação do objeto
    public Produto(String marcaInicial, Tamanho tamanhoInicial ) {
        this.marca = marcaInicial; // Com esse parametro, será necessário passar a marca inicial,
                                  // no momento da instanciação
        this.tamanho = tamanhoInicial;
    }

    //Definindo os Métodos
    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    //retornar valor de acordo com o tipo definido (double)
    //get - pegar
    public double getValor() {
        //devolver neste (this) objeto o atributo valor
        return this.valor;
    }
    //void = não tem retorno
    //set - imputar/colocar
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            //lançar uma nova exceção do tipo Illegal (argumento invalido)
            throw new IllegalArgumentException("VALORES DEVEM SER MAIORES QUE 0 !!!");
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }
    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

//    public List<String> getItensIclusos() {
//        return this.itensIclusos;
//    }
//    public void setItensIclusos(List<String> novosItensIncluso) {
//        this.itensIclusos = novosItensIncluso;
//    }

    public List<ItensAdicionais> getItensAdicionais(){
        return this.itensAdicionais;
    }

    public void setItensAdicionais(List<ItensAdicionais> novosItensAdicionais) {
        this.itensAdicionais = novosItensAdicionais;
    }

}
