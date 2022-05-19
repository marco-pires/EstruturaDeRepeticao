package com.java.repeticao;

public class SubLowerUpper {
    public static void main(String[] args) {

        String descricao = new String ("Maçã gala, a maçã mais doce do mercado!");

        System.out.println(descricao.toLowerCase());
        //transforma todos os caracteres em minusculo

        System.out.println(descricao.toUpperCase());
        //transforma todos os caracteres em maiusculo

        System.out.println(descricao.substring(0,4));
        //fará uma busca e pega um trecho de caractere da string descricao, começando no indice 0 e indo até o 4

        System.out.println(descricao.substring(4));
        //pegará do indice 4 até o final da string descricao

        System.out.println(descricao.substring(descricao.indexOf("Maçã"),descricao.indexOf(" ")));
        //substring procurou com o indexof a palavra "maçã", encontrou a primeira posição, e terminou o recorte quando encontrou "espaço"

        System.out.println(descricao);

    }
}
