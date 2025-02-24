package devdojo.curso.javacore.Bintroducaometodos.test;

import devdojo.curso.javacore.Bintroducaometodos.domain.Estudante;
import devdojo.curso.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimir = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        imprimir.imprimirEstudante(estudante01);
        imprimir.imprimirEstudante(estudante02);





    }
}
