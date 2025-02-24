package devdojo.curso.javacore.Aintroducaoclasses.test;

import devdojo.curso.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagen";
        carro1.ano = 2018;
        carro1.modelo = "Jetta";

        // carro1 = carro2; (Pode fazer isso desde que seja mesma classe;
        // nao poderia fazer por exemplo: carro1 = professor;

        carro2.marca = "Fiat";
        carro2.ano = 2022;
        carro2.modelo = "Argo";
    }
}
