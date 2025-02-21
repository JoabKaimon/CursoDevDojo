package devdojo.curso.intro;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args){
        // while, do while, for
     /*   int count = 0;
        while(count < 5){
            System.out.println("Contador do while: "+ ++count);
        }*/

      /*  count = 0;
        do{
            System.out.println("Contador do do-while: "+ ++count);
        }while(count < 5);
        */

       /* for(int i = 0; i < 5; i++){
            System.out.println("Contador do for: "+i);
        }*/

        //imprima todos numeros pares até 100
        /*for(int par = 0; par<=10; par+=2){
            System.out.println("Numeros pares: "+par);
        }*/
       /* for(int par = 0; par <=10; par++){
            if(par % 2 == 0){
                System.out.println("Numeros pares: "+par);
            }
        }*/

        //imprima apenas os 10 primeiros numeros de qualquer numero
       /* int number = 100;
        for(int i = 0; i < number; i++){
            if(i > 10){
                break;
            }
            System.out.println(i);
        }*/

        //Dado o valor do carro, descubra em quantas vezes ele pode ser parcelado
        //condiçao do valorParcela >= 100
      /*  double valorTotal = 10000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " Valor R$ "+valorParcela);
        }*/

        double valorTotal = 10000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+" Valor R$ "+valorParcela);
        }
    }
}
