package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItensAdicionais;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        //Instanciação da Classe, criando um novo tributo
        Produto meuProduto = new Produto("Sony", Tamanho.PEQUENO);

        //Definindo os Atributos
        meuProduto.setNome("PlayStation 4");
        meuProduto.setValor(79.90);

//        //Trabalhando com listas
//        List<String> itensIclusos = new ArrayList<>();
//        itensIclusos.add("2 Controles"); //0
//        itensIclusos.add("3 Jogos"); //1
//        itensIclusos.add("2 Cabos de Energia"); //2

        List<ItensAdicionais> itensAdicionais = new ArrayList<>();

        ItensAdicionais primeiroItemAdicional = new ItensAdicionais(2, "Controle");
        itensAdicionais.add(primeiroItemAdicional);

        ItensAdicionais segundoItemAdicional = new ItensAdicionais(3, "Jogos");
        itensAdicionais.add(segundoItemAdicional);

        ItensAdicionais terceiroItemAdicional = new ItensAdicionais(2, "Cabo de Energia");
        itensAdicionais.add(terceiroItemAdicional);

        meuProduto.setItensAdicionais(itensAdicionais);

        //Printar a "forma" do Atributo
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

//        System.out.println(meuProduto.getItensAdicionais().get(0).getNomeItem());
//        System.out.println(meuProduto.getItensAdicionais().get(0).getQuantidadeItem());

        //Ira navegar por cada item dentro da lista de itens adicionais
        for (ItensAdicionais itemAdicional : meuProduto.getItensAdicionais()) {
            System.out.println(itemAdicional.getQuantidadeItem());
            System.out.println(itemAdicional.getNomeItem());

        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Nintendo", Tamanho.GRANDE);
        System.out.println(meuProdutoNacional.getMarca());

        meuProdutoNacional.setImpostoNacional(59.99);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("XBOX", Tamanho.PEQUENO);
        System.out.println(meuProdutoInternacional.getMarca());

        meuProdutoInternacional.setTaxaDeImportacao(0.79);
        System.out.println(meuProdutoInternacional.getTaxaDeImportacao());

        meuProdutoInternacional.setValor(-87);
        System.out.println(meuProdutoInternacional.getValor());
    }
}
