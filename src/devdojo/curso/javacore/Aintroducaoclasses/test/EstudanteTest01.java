package devdojo.curso.javacore.Aintroducaoclasses.test;

import devdojo.curso.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "luffy";
        estudante.age = 22;
        estudante.sex = 'M';

        System.out.println(estudante.name + " " + estudante.age + " " + estudante.sex);
    }
}
