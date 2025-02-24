package devdojo.curso.intro;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 21;
        boolean isAuthorizedToBuyDrink = age >= 18;
        if(isAuthorizedToBuyDrink){
            System.out.println("Autorizado comprar bebida!");
        }else{
            System.out.println("Não Autorizado comprar bebida!");
        }

           /* int age = 17;
            String category;

            if(age < 15){
                category = "childish";
            }
            else if(age >=15 && age < 18){
                category = "youthful";
            }
            else{
                category = "adult";
            }
            System.out.println("Category is "+category);*/

       /* double salary = 100;
        String donate = "Eu vou doar";
        String doNotDonate = "Não vou doar";
        String result = "";
        // String result = (condição) ? true : false;
        result = (salary >= 90) ? donate : doNotDonate;
        System.out.println(result);
        */

        /*double salary = 50000;
        double tax01 = 9.70/100;
        double tax02 = 37.35/100;
        double tax03 = 49.50/100;
        double totalTax;
        String tax;
        if(salary < 34713){
            totalTax = salary * tax01;
            tax = "9.70%";
        }
        else if(salary > 34712 && salary < 68508){
            totalTax = salary * tax02;
            tax = "37.35%";
        }
        else{
            totalTax = salary * tax03;
            tax = "49.50%";
        }
        System.out.println("A taxa de imposto é: "+tax+". O valor ficou em: "+totalTax);*/

        //Imprima o dia da semana, considerando 1 como domingo
        byte day = 5;
        // Variaveis para switch: char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Erro");
        }
    }
}
