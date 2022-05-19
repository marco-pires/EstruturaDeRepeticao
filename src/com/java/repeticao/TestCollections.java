package com.java.repeticao;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

//        ArrayList carrinho = new ArrayList();
//        double valor = 100.55;
//        int valor2 = 1;
//        int valor3;

//        carrinho.add(valor);
//        carrinho.add("Uva");
//        carrinho.add(valor2);

//        System.out.println(carrinho.get(1));

        //Interface Liest e uso de Generics
        //Generics n�o permite tipos primitivos

//        List<String> carrinho = new ArrayList<String>();
//
//        System.out.println(carrinho.isEmpty());
//
//        carrinho.add("Ma��");
//        carrinho.add("Morango");
//        carrinho.add("Ma��");
//        carrinho.set(1, "Pera");
//        //set altera um conteudo em um determinado indice no arraylist
//
//        System.out.println(carrinho.isEmpty());
//        //retorna verdadeiro ou falso se o arraylist est� vazio ou n�o
//
//        System.out.println(carrinho.size());
//        //retorna o tamanho do arraylist

//        List<String> carrinho = new ArrayList<String>();
//        carrinho.add("Ma��");
//        carrinho.add("Morango");
//        carrinho.add("Ma��");
//
//        System.out.println(carrinho.contains("Ma��"));
//        //Retorna se a palavra ma�� est� contida em algum dos itens no arraylist
//
//        System.out.println(carrinho.indexOf("Ma��"));
//        //Retorna qual a posi��o que a palavra ma�� est� no arraylist carrinho
//
//        System.out.println(carrinho.get(carrinho.indexOf("Ma��")));
//        //Busca a palavra ma�� a partir da posi��o retornada do indexof
//
//        System.out.println(carrinho.lastIndexOf("Ma��"));
//        //retorna a ultima ocorrencia da palavra ma�� dentro do arraylist carrinho

//        carrinho.remove(carrinho.indexOf("Ma��"));
//        System.out.println(carrinho.get(0));
//
//        carrinho.clear();
//        System.out.println(carrinho.isEmpty());

//        Set<String> cesta = new HashSet<String>();
//
//        System.out.println(cesta.isEmpty());
//        //nessa linha de c�digo "cesta" estava vazia
//
//        cesta.add("Ma��");
//        cesta.add("Ma��");
//        cesta.add("ma��");
//        System.out.println(cesta.isEmpty());
//        //nessa linha de c�digo "cesta" j� havia recebido 3 adi��es
//        //o tamanho do hashset � 2, pq a classe hashset n�o permite elementos duplicados
//
//
//        System.out.println(cesta.size());
//        System.out.println(cesta);

        Map<String, String> caixa = new HashMap<String, String>();
        //declaramos a vari�vel 'caixa' da interface 'map' implementada pela classe HashMap

        caixa.put("M2225", "Fernando");
        caixa.put("M2226", "Maria");
        caixa.put("M2227", "Soraya");

        System.out.println(caixa.isEmpty());
        //verificamos se o hashmap est� vazio

        System.out.println(caixa.size());
        //retornamos o tamanho do hashmap

        System.out.println(caixa.containsKey("M2225"));
        //verificamos se no hashmap de nome "caixa" cont�m a chave m2225

        System.out.println(caixa.containsValue("Fernando"));
        //verificamos se no hashmap cont�m o valor "Fernando"

        System.out.println(caixa);
        //imprimimos todos os itens do hashmap

    }
}
