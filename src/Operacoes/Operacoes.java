package Operacoes;

public class Operacoes {
    private double a;
    private double b;

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println();
        }
        return a / b;
    }

    public static double potencia(double a, double b) {
        double resultado = 1;

        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double raizQuadrada(double a, double b) {
        if (b < 0) {
            throw new ArithmeticException("Não existe raiz de número negativo.");
        }
        return Math.sqrt(a);
    }
}
