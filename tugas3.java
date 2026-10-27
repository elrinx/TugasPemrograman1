import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\tTUGAS NO 3\n");

        System.out.print("Bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Bilangan kedua: ");
        int b = input.nextInt();

        System.out.printf("Jumlah: %d%n", a + b);
        System.out.printf("Selisih: %d%n", a - b);
        System.out.printf("Hasil kali: %d%n", a * b);
        System.out.printf("Hasil bagi: %.2f%n", (double) a / b);
        System.out.printf("Sisa bagi: %d%n", a % b);

        input.close();
    }
}