import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // sistem meminta input dari pengguna
        System.out.print("Masukkan bilangan desimal pertama: ");
        double angkaPertama = input.nextDouble();
        System.out.print("Masukkan operator Matematika (+, -, *, /): ");
        char operasi = input.next().charAt(0);
        System.out.print("Masukkan bilangan desimal kedua: ");
        double angkaKedua = input.nextDouble();

        // pilihan operasi matematika dan logikanya
        switch (operasi) {
            case '+':
                System.out.println("Hasil: " + (angkaPertama + angkaKedua));
                break;
            case '-':
                System.out.println("Hasil: " + (angkaPertama - angkaKedua));
                break;
            case '*':
                System.out.println("Hasil: " + (angkaPertama * angkaKedua));
                break;
            case '/':
                if (angkaKedua == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak boleh");
                } else {
                    System.out.println("Hasil: " + (angkaPertama / angkaKedua));
                }
                break;
            default:
                System.out.println("Operator tidak ada");
        }
        input.close();
    }

}