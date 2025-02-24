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
}
