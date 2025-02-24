package devdojo.curso.javacore.Aintroducaoclasses.test;

import devdojo.curso.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Girafalles";
        professor.age = 31;
        professor.sex = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.sex);

    }
}
