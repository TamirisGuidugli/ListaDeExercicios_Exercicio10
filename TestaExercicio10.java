package ListaDeExercicio01_Exercicio10;

import java.util.Scanner;

public class TestaExercicio10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       // scanner.useDelimiter("\n");
        System.out.print("Digite o tipo de Operação que deseja |SOMA(1) - SUBTRACAO(2) - MULT(3) - DIVISAO(4) - POTENCIA(5)|: ");
        int index = in.nextInt();

        Scanner scanner1 = new Scanner(System.in);
       // scanner1.useDelimiter("\n");
        System.out.print("Digite o primeiro número: ");
        double indexA = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
       // scanne2.useDelimiter("\n");
        System.out.print("Digite o segundo número: ");
        double indexB = scanner2.nextDouble();

        if (index==1) {
            Double resultado = Calculadora.somar(indexA, indexB);
            System.out.println("Resultado  : " + resultado);
        }else if (index==2) {
            Double resultado = Calculadora.subtrair(indexA, indexB);
            System.out.println("Resultado  : " + resultado);
        }else if (index==3) {
            Double resultado = Calculadora.multiplicar(indexA, indexB);
            System.out.println("Resultado  : " + resultado);
        }else if(index==4) {       
        	Double resultado = Calculadora.divir(indexA, indexB);
        	System.out.println("Resultado  : " + resultado);  		
        }else if(index==5) {
            Double resultado = Calculadora.potencia(indexA, indexB);
            System.out.println("Resultado  : " + resultado);
        }else {
            System.out.println("Selecione uma Operação válida");
        }
        
        in.close();
        scanner1.close();
        scanner2.close();
    }
}

