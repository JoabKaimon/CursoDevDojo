package devdojo.curso.intro;

import sun.nio.cs.KOI8_U;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, long, short, boolean
        int fatherAge = 55;
        long grandFatherAge = 90;
        short sonAge = 8;
        double doubleSalary = 1.7308; //8 bytes e vai ate 1.7 e+308
        float floatSalary = 3.400f;
        char caracter = 'W'; //pode utilizar tambem ASCII ou unicode table
        byte byteSalary = 127; // max do byte eh 127
        boolean verdadeiro = true;
        boolean falso = false;
        String largeText = "Goku";
        //var nome2 = "Vegeta"; (utilizado a partir do jdk10)

        System.out.println("A idade do pai e: "+fatherAge+" anos.");
        System.out.println("Vou viver mais que vovo: " +verdadeiro);
        System.out.println("Oi, eu sou o "+largeText);

        /* para fazer um casting (forçar um tipo se encaixar em outro)
         */
        float bigNumber = (float) 100.5;
        byte laggerThanByte = (byte) 128;
        System.out.println(laggerThanByte);
    }
}




