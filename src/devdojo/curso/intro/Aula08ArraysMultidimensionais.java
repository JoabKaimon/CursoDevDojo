package devdojo.curso.intro;

public class Aula08ArraysMultidimensionais {
    // Array dentro de Array
    public static void main(String[] args) {
        int[][] days = new int[3][4];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;
        days[0][3] = 30;
        days[1][0] = 31;
        days[1][1] = 30;
        days[1][2] = 31;
        days[1][3] = 31;
        days[2][0] = 30;
        days[2][1] = 31;
        days[2][2] = 30;
        days[2][3] = 31;

      /*  for(int i = 0; i < days.length; i++){
            for(int j =0; j < days[i].length; j++){
                System.out.println(days[0][j]);
            }
        }*/

        //foreach em Array Multidimensional
        for (int[] num : days) {
            for (int num2 : num) {
                System.out.println(num2);
            }
        }

        //Formas de inicialização dos ArraysMultidimensionais
        int[] arr = {2, 3, 4};
        int array[][] = new int[3][];
        array[0] = new int[4];
        array[1] = arr;
        array[2] = new int[]{2, 6, 0, 5, 3, 6};

        int[][] array2 = {{1, 2, 3, 4},{2, 3, 4},{2, 6, 0, 5, 3, 6}};
    }
}
