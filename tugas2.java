
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("\tTUGAS NO 2\n");

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.println("Halo, " + nama + "! Tahun depan umurmu " + (umur + 1) + " tahun.");

        input.close();
    }
}
