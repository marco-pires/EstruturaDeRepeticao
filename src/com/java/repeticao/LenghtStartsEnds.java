package com.java.repeticao;

public class LenghtStartsEnds {

    public static void main(String[] args) {

        String descricao = new String ("Ma�� Gala, a ma�� mais doce do mercado!");
        System.out.println(descricao.length());

        System.out.println(descricao.startsWith("Ma��"));
        System.out.println(descricao.endsWith("!"));
    }
}
