import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("Choose one:" +
                    "\n1. Sumar" +
                    "\n2. Restar" +
                    "\n0. Exit");
            option = scanner.nextInt();

        }while (option != 0);

    }
}