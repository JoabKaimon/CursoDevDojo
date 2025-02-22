package devdojo.curso.orientacaoaobjetos.test;

import devdojo.curso.orientacaoaobjetos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.name = "Gohan";
        estudante.name = estudante2.name;
        System.out.println(estudante.name);

    }
}
