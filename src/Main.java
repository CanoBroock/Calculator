import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final double PI = 3.1416;
        int option = 0;
        double variable = 0;

        do {
            System.out.println("\nChoose one:" +
                    "\n1. Suma" +
                    "\n2. Resta" +
                    "\n3. Multiplicación" +
                    "\n4. División" +
                    "\n5. Módulo" +
                    "\n6. Raiz cuadrada" +
                    "\n7. Exponenciales" +
                    "\n8. Guardar variable." +
                    "\n9. Mostrar variable guardada" +
                    "\n10. Borrar variable guardada." +
                    "\n11. Valor constante pi.." +
                    "\n0. Exit");
            System.out.print("\nEscojo la opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    modulo();
                    break;
                case 6:
                    raiz();
                    break;
                case 7:
                    exponencial();
                    break;
                case 8:
                    System.out.print("Introduzca un número que quiera guardar en la variable: ");
                    variable = scanner.nextDouble();
                    break;
                case 9:
                    System.out.print("La variable que está guardada es: " + variable);
                    break;
                case 10:
                    System.out.print("Se ha eliminado la variable");
                    variable = 0;
                    break;
                case 11:
                    System.out.print("La constante PI es " + PI);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la calculadora");
                    break;
            }

        } while (option != 0);

    }

    public static void sumar() {
        int num1;
        int num2;
        int resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }

    public static void restar() {
        int num1;
        int num2;
        int resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es " + resultado);
    }

    public static void multiplicar() {
        int num1;
        int num2;
        int resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es " + resultado);
    }

    public static void dividir() {
        double num1;
        double num2;
        double resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = num1 / num2;
        System.out.println("El resultado de la división es " + resultado);
    }

    public static void modulo() {
        int num1;
        int num2;
        int resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = num1 % num2;
        System.out.println("El módulo es " + resultado);
    }

    public static void raiz() {
        int num1;
        double resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        resultado = Math.sqrt(num1);
        System.out.println("La raiz cuadrada es " + resultado);
    }

    public static void exponencial() {
        int num1;
        int num2;
        double resultado;

        System.out.print("Introduzca 1 número:");
        num1 = scanner.nextInt();
        System.out.print("Introduzca 1 número:");
        num2 = scanner.nextInt();
        resultado = Math.pow(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + " es " + resultado);
    }
}