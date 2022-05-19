package com.java.repeticao;

public class Comparacao {

    public static void main(String[] args) {

        String nome = new String("ma��");
        String nome2 = new String("Ma��");
        String nome3 = new String("ma��");

        System.out.println(nome.equals(nome2)); // false

        System.out.println(nome.equalsIgnoreCase(nome2)); // true

        System.out.println(nome.equals(nome3)); // true

        boolean teste = (nome == nome3); //Operador == n�o compara o conte�do da String
        System.out.println(teste); //false

        String nome4 = "ma��";
        String nome5 = "ma��";

        teste = (nome4 == nome5); //Nessa situa��o, n�o foi instanciado o nome4 e o nome5, portanto o java utiliza um pull de mem�ria para armazenar os dois valores
        System.out.println(teste); //true

    }
}
