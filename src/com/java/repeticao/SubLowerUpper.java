package com.java.repeticao;

public class SubLowerUpper {
    public static void main(String[] args) {

        String descricao = new String ("Ma�� gala, a ma�� mais doce do mercado!");

        System.out.println(descricao.toLowerCase());
        //transforma todos os caracteres em minusculo

        System.out.println(descricao.toUpperCase());
        //transforma todos os caracteres em maiusculo

        System.out.println(descricao.substring(0,4));
        //far� uma busca e pega um trecho de caractere da string descricao, come�ando no indice 0 e indo at� o 4

        System.out.println(descricao.substring(4));
        //pegar� do indice 4 at� o final da string descricao

        System.out.println(descricao.substring(descricao.indexOf("Ma��"),descricao.indexOf(" ")));
        //substring procurou com o indexof a palavra "ma��", encontrou a primeira posi��o, e terminou o recorte quando encontrou "espa�o"

        System.out.println(descricao);

    }
}
