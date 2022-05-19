package com.java.repeticao;

public class Comparacao {

    public static void main(String[] args) {

        String nome = new String("maçã");
        String nome2 = new String("Maçã");
        String nome3 = new String("maçã");

        System.out.println(nome.equals(nome2)); // false

        System.out.println(nome.equalsIgnoreCase(nome2)); // true

        System.out.println(nome.equals(nome3)); // true

        boolean teste = (nome == nome3); //Operador == não compara o conteúdo da String
        System.out.println(teste); //false

        String nome4 = "maçã";
        String nome5 = "maçã";

        teste = (nome4 == nome5); //Nessa situação, não foi instanciado o nome4 e o nome5, portanto o java utiliza um pull de memória para armazenar os dois valores
        System.out.println(teste); //true

    }
}
