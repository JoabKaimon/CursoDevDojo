package devdojo.curso.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println("10 + 10 = "+(10+10));
    }
    public void subtraiDoisNumeros(){
        System.out.println("21 - 2 = "+(21-2));
    }
    public void multiplicaDoisNumeros(int num1, int num2){ // Aqui estou passando parâmetros
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void alteraDoisNum(int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNum:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
