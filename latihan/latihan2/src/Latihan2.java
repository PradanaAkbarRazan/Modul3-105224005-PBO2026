import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String pinBenar = "123321";
        int percobaan = 0;

        while (percobaan < 3) { // percobaan maksimal 3 kali
            System.out.print("Masukkan PIN: "); // user input
            String inputPin = input.next();

            if (inputPin.equals (pinBenar)) { 
                System.out.println("Login Berhasil!");
                break; // Keluar dari loop jika benar
            }

            percobaan++;
            if (percobaan < 3) {
                System.out.println("PIN salah. Sisa percobaan: "+ (3 - percobaan));
            }
        }

        if (percobaan == 3) { // 3 kali coba dan salah maka akun diblokir
            System.out.println("Akun diblokir");
        }
        input.close();
    }
}