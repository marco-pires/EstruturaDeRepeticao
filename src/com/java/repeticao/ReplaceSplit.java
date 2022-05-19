package com.java.repeticao;

import java.util.Arrays;

public class ReplaceSplit {

    public static void main(String[] args) {

        String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");

        System.out.println(descricao.replace("G", "g"));
        //Método replace substituirá toda letra "G" para "g"

        System.out.println(descricao.replace("Gala", "Fuji"));
        //Substitui toda palavra "Gala" por "Fuji"

        System.out.println(descricao.replace("a","A"));
        //Substitui toda letra "a" por "A"

        System.out.println(descricao.split(" ").length);
        //Método split quebra a string com o demilitador "espaço", e o atributo length retorna quantas strings foram resultantes dessa quebra apartir do caractere "espaço"

        System.out.println(Arrays.toString(descricao.split(" ")));
        //método split transformado em string por arrays, fará a impressão do resultado dessa quebra
    }
}
