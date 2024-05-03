import java.util.Scanner;
import Operacoes.Operacoes;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char operacao;


        while (true) {

            System.out.println("Informe qual operação deseja realizar." +
                    "\n1.Adição" +
                    "\n2.Subtração" +
                    "\n3.Multiplicação" +
                    "\n4.Divisão" +
                    "\n5.Potência" +
                    "\n6.Raiz Quadrada" +
                    "\nQ.Sair do Programa");
            operacao = in.next().charAt(0);
            if (operacao == 'Q')
                break;
            System.out.println("Digite o primeiro número da operação.");
            double primeiroNumero = in.nextDouble(), segundoNumero = 0;
            if (operacao != 6) {
                System.out.println("Digite o segundo número da operação.");
                segundoNumero = in.nextDouble();
            }
            double resultado = 0;


            switch (operacao) {
                case ('1'):
                    System.out.println(Operacoes.somar(primeiroNumero, segundoNumero));
                    break;
                case ('2'):
                    System.out.println(Operacoes.subtrair(primeiroNumero, segundoNumero));
                    break;
                case ('3'):
                    System.out.println(Operacoes.multiplicar(primeiroNumero, segundoNumero));
                    break;
                case ('4'):
                    if (segundoNumero == 0)
                        System.out.println("Impossível realizar uma divisão por zero.\n");
                    else
                        System.out.println(Operacoes.dividir(primeiroNumero, segundoNumero));
                    break;
                case ('5'):
                    System.out.println(Operacoes.potencia(primeiroNumero, segundoNumero));
                    break;
                case ('6'):
                    try {
                        System.out.println(Operacoes.raizQuadrada(primeiroNumero, segundoNumero));
                    } catch (ArithmeticException e) {
                        e.getMessage();
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

        }

        in.close();
    }
}
