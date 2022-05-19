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
        //Generics não permite tipos primitivos

//        List<String> carrinho = new ArrayList<String>();
//
//        System.out.println(carrinho.isEmpty());
//
//        carrinho.add("Maçã");
//        carrinho.add("Morango");
//        carrinho.add("Maçã");
//        carrinho.set(1, "Pera");
//        //set altera um conteudo em um determinado indice no arraylist
//
//        System.out.println(carrinho.isEmpty());
//        //retorna verdadeiro ou falso se o arraylist está vazio ou não
//
//        System.out.println(carrinho.size());
//        //retorna o tamanho do arraylist

//        List<String> carrinho = new ArrayList<String>();
//        carrinho.add("Maçã");
//        carrinho.add("Morango");
//        carrinho.add("Maçã");
//
//        System.out.println(carrinho.contains("Maçã"));
//        //Retorna se a palavra maçã está contida em algum dos itens no arraylist
//
//        System.out.println(carrinho.indexOf("Maçã"));
//        //Retorna qual a posição que a palavra maçã está no arraylist carrinho
//
//        System.out.println(carrinho.get(carrinho.indexOf("Maçã")));
//        //Busca a palavra maçã a partir da posição retornada do indexof
//
//        System.out.println(carrinho.lastIndexOf("Maçã"));
//        //retorna a ultima ocorrencia da palavra maçã dentro do arraylist carrinho

//        carrinho.remove(carrinho.indexOf("Maçã"));
//        System.out.println(carrinho.get(0));
//
//        carrinho.clear();
//        System.out.println(carrinho.isEmpty());

//        Set<String> cesta = new HashSet<String>();
//
//        System.out.println(cesta.isEmpty());
//        //nessa linha de código "cesta" estava vazia
//
//        cesta.add("Maçã");
//        cesta.add("Maçã");
//        cesta.add("maçã");
//        System.out.println(cesta.isEmpty());
//        //nessa linha de código "cesta" já havia recebido 3 adições
//        //o tamanho do hashset é 2, pq a classe hashset não permite elementos duplicados
//
//
//        System.out.println(cesta.size());
//        System.out.println(cesta);

        Map<String, String> caixa = new HashMap<String, String>();
        //declaramos a variável 'caixa' da interface 'map' implementada pela classe HashMap

        caixa.put("M2225", "Fernando");
        caixa.put("M2226", "Maria");
        caixa.put("M2227", "Soraya");

        System.out.println(caixa.isEmpty());
        //verificamos se o hashmap está vazio

        System.out.println(caixa.size());
        //retornamos o tamanho do hashmap

        System.out.println(caixa.containsKey("M2225"));
        //verificamos se no hashmap de nome "caixa" contém a chave m2225

        System.out.println(caixa.containsValue("Fernando"));
        //verificamos se no hashmap contém o valor "Fernando"

        System.out.println(caixa);
        //imprimimos todos os itens do hashmap

    }
}
