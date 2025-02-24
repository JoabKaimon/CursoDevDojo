package devdojo.curso.javacore.Bintroducaometodos.domain;
import devdojo.curso.javacore.Bintroducaometodos.domain.Estudante;
public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {
        System.out.println("-----------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
