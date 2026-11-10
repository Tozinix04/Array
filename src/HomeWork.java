import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introdu cate numere doresti sa fie in lisa : ");
        int n = scanner.nextInt();
        System.out.println("----------------");

            int[] array = new int[n];
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                System.out.print("Introduceti un numarul : ");
                array[i] = scanner.nextInt();

                if (i % 2 == 0) {
                    suma = suma + array[i];
                }
            }

            System.out.println("----------------");
            System.out.println("Suma elementelor pare este: " + suma);

    }
}
