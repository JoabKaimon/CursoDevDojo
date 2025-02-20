package devdojo.curso.intro;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 5;
        int number02 = 6;
        int sum = number01 + number02;
        int subtraction = number01 - number02;
        int multiplication = number01 * number02;
        double division = number01 / (double)number02;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        // %
        int rest = number01 % 2;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isNumber01LessThanTwenty = 5 < 20;
        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isNumber01LessThanTwenty);

        // && (and) || (or) ! (negação)
        int age = 22;
        float salary = 7200f;
        boolean isWhitinLawAndGreaterThan20 = age >= 20 && salary >= 6000;
        boolean isWhitinLawAndLessThan20 = age < 20 && salary >= 4500;
        System.out.println(isWhitinLawAndGreaterThan20);
        System.out.println(isWhitinLawAndLessThan20);

        double checkingCurrentBalance = 300;
        double checkingSavingsBalance = 9000;
        float computerPrice = 7500f;
        boolean isComputerAffordable = checkingCurrentBalance >= computerPrice || checkingSavingsBalance >= computerPrice;
        System.out.println("isComputerAffordable " +isComputerAffordable);

        // = += -= *= /= %=
        double bonus = 10;
        bonus += 10; //20
        bonus -= 10; //10
        bonus *= 2; //20
        bonus /= 2; //10
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int counter = 0;
        counter++; // executa depois incrementa
        ++counter; // incrimenta depois executa
    }
}
