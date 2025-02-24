package devdojo.curso.javacore.Bintroducaometodos.test;

import devdojo.curso.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 5); // aqui estou passando argumentos
    }
}
