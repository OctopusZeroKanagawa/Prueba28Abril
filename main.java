import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num1,num2,resultado;

        prueba test = new prueba();

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite primer número: ");
        num1 = scan.nextInt();

        System.out.println("Digite segundo número: ");
        num2 = scan.nextInt();

        resultado = test.sumar(num1,num2);
        System.out.println("El resultado es: "+resultado);

        scan.close();
    }
}
