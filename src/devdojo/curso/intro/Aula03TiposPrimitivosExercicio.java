package devdojo.curso.intro;

/*Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String name = "Joab";
        String adress = "Vitoria da Conquista";
        double salary = 10000.00;
        String date = "19/02/2025";
        String relatorio = ("Eu "+name+", morando no endereço de "+adress+", confirmo que "+
                "recebi o salário de "+salary+", na data: "+date);

        System.out.println(relatorio);
    }
}
