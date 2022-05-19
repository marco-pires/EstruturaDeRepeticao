package com.java.repeticao;

public class CarAtIndexLastIndexOf {

    public static void main(String[] args) {

        String descricao = new String("Maçã gala, a maçã mais doce do mercado!");

        System.out.println(descricao.charAt(1)); //Retorna o caractere na posição 1, como o indice inicia em 0, teremos o retorno da letra A

        System.out.println(descricao.indexOf("G")); //Retorna o indice da posição do caractere G
        System.out.println(descricao.indexOf("Gala"));

        System.out.println(descricao.indexOf("a"));
        System.out.println(descricao.lastIndexOf("a")); //retorna indice da posição da ultima ocorrencia do caractere a dentro da string descricao
    }
}
