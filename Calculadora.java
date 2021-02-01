package ListaDeExercicio01_Exercicio10;
import java.lang.Math;

public class Calculadora {

    public static double somar (double a, double b) {
        return a + b;
    }
    public static double subtrair (double a, double b) {
        return a - b;
    }
    public static double multiplicar (double a, double b) {
        return a * b;
    }
    public static double divir (double a, double b) {
    	if (b == 0) {
    		System.out.println("Não é possivel fazer essa operação");
    	}else
    		return a / b;
		return a/b;
		
    }
    public static double potencia (double a, double b) {
        return Math.pow(a, b);
    }


}
