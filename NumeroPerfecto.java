import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        

        if (Sub1(numero)) {
            System.out.println(numero + " es un numero perfecto.");
        } else {
            System.out.println(numero + " no es un numero perfecto.");
        }
    }

    public static boolean Sub1(int numero) {
        int sum = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sum += i;
            }
        }
        return sum == numero;
    }
}

    

