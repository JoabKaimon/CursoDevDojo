package devdojo.curso.javacore.Bintroducaometodos.test;

import devdojo.curso.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 50;
        int num2 = 50;
        calculadora.alteraDoisNum(num1, num2);
        // não importa o que seja passado no metodo, se na função principal
        // ja foram definidos valores

        System.out.println("Fora do alteraDoisNum:");
        System.out.println(num1);
        System.out.println(num2);
    }
}
