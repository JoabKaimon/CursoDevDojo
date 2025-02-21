package devdojo.curso.intro;

public class Aula07Arrays {
    public static void main(String[] args) {
        // Arrays são considerados objetos dentro do JAVA, sendo a parte esquerda int[] name
        // do tipo reference, assim como String, não são tipos primitivos
        int ages[] = new int[3];
        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 40;

        //byte, short, int, long, float e double = 0 (quando nada é passado)
        //char '/u0000'  ' '
        //boolean false
        //String null

       /* String[] names = new String[3];
        names[0] = "Eren";
        names[1] = "Mikasa";
        names[2] = "Armin";
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        names = new String[5];*/

        int[] numbers = new int[3];     //todas são formas de inicializar um array
        int[] numbers2 = {1, 2, 3};
        int[] numbers3 = new int[]{1, 2, 3};

        //foreach
        for (int num : numbers3){
            System.out.println(num);
        }

    }
}
