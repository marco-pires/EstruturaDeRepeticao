package com.java.repeticao;

import java.util.Arrays;

public class ReplaceSplit {

    public static void main(String[] args) {

        String descricao = new String("Ma�� Gala, a ma�� mais doce do mercado!");

        System.out.println(descricao.replace("G", "g"));
        //M�todo replace substituir� toda letra "G" para "g"

        System.out.println(descricao.replace("Gala", "Fuji"));
        //Substitui toda palavra "Gala" por "Fuji"

        System.out.println(descricao.replace("a","A"));
        //Substitui toda letra "a" por "A"

        System.out.println(descricao.split(" ").length);
        //M�todo split quebra a string com o demilitador "espa�o", e o atributo length retorna quantas strings foram resultantes dessa quebra apartir do caractere "espa�o"

        System.out.println(Arrays.toString(descricao.split(" ")));
        //m�todo split transformado em string por arrays, far� a impress�o do resultado dessa quebra
    }
}
