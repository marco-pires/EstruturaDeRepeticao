package com.java.repeticao;

import br.com.java.entity.Produto;

public class Caixa {
    public static void main(String[] args) {

        int qtdProdutos = 5;
        int registro = 0;

//        while (registro < qtdProdutos) {
//          registro++;
//          System.out.println("O produto número " + registro + " foi registrado");
//                }


//        do {
//          registro++;
//        System.out.println("O caixa registrou o produto " + registro);
//  } while (registro < qtdProdutos);

//        for (int i = 1; i <= qtdProdutos; i++){
//            System.out.println("O caixa registrou o produto " + i);
//        }

//        float[] valores = new float[5];
//
//        valores[0] = 10;
//        valores[1] = 20;
//        valores[2] = 30;
//        valores[3] = 40;
//        valores[4] = 50;
//        System.out.println(valores[1]);

//        float[] valores = {10,20,30,40,50};
//        float[] valores2 = new float[] {10,20,30,40,50};
//
//        System.out.println(valores[4]);
//        System.out.println(valores2[4]);

        Produto[] produtos = new Produto[2];

        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescricao("Galego");
        prod1.setValor(4);

        Produto prod2 = new Produto();
        prod2.setNome("Maçã");
        prod2.setDescricao("Gala");
        prod2.setValor(5);

        produtos[0] = prod1;
        produtos[1] = prod2;

//        for(int i = 0; i < produtos.length; i++){
//            System.out.println(produtos[i].toString());
//        }

//        for(Produto prod: produtos){
//            System.out.println(prod.toString());
//        }

        // 10 corredores com três prateleiras cada
//        Produto[][] localizacaoProduto = new Produto[10][3];

//        localizacaoProduto[0][1] = prod1; //Imprime o nome do primeiro produto que está em indice 0 na posição 1
//        localizacaoProduto[1][1] = prod2; //Imprime o nome do primeiro produto que está em indice 1 na posição 1

//        System.out.println(localizacaoProduto[0][1].getNome());

//        String nome; //Declaramos variável tipo string de nome "nome"
//        nome = new String(); //Instanciamos a variável
//        nome = "Maçã"; //inicializamos ela com o conteúdo maçã
//        System.out.println(nome);

//        String nome2 = new String("Maçã");
//        System.out.println(nome2);

//        String nome3= "Maçã"; //Utiliza um Pull de memória para armazenar o conteúdo "Maçã"
//        System.out.println(nome3);

//        String descricao = "Tipo gala \nA maçã mais doce do mercado"; //Faz uma quebra de linha e posiciona o cursos no inicio da segunda linha
//        System.out.println(descricao);

//        descricao = "Tipo Gala \tA maçã mais doce do mercado"; //Cria um espaçamento utilizando um TAB (tabulação)
//        System.out.println(descricao);

//        descricao = "Tipo Gala: \"A maçã mais doce do mercado\""; //Aspas duplas permite aspas duplas sem atrapalhar a atribuição a string descricao
//        System.out.println(descricao);

//        String nome = new String("Maçã");
//        String descricao = new String();
//        descricao = "tipo Gala, a maçã mais doce do mercado";

//        String propaganda = nome + " " + descricao;
//        System.out.println(propaganda);

//        propaganda = nome.concat(" ").concat(descricao);
//        System.out.println(propaganda);

//        propaganda += "!";
//        System.out.println(propaganda);


    }
}
