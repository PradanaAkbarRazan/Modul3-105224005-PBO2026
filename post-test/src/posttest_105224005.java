import java.util.Scanner;

public class posttest_105224005 {
public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double saldo = 500000;
        int menu;
    
        do {
            System.out.println("\nSIMULASI MENU ATM");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            menu = input.nextInt();

            // operasi masing masing pilihan menu
            switch (menu) {
                case 1:
                    System.out.println("Saldo Anda saat ini: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("jumlah setor tunai: Rp ");
                    double setor = input.nextDouble();
                    saldo += setor;
                    System.out.println("Setor tunai berhasil! Total Saldo: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Jumlah tarik tunai: Rp ");
                    double tarik = input.nextDouble();
                    
                    // Logika if-else untuk cek saldo min Rp 50.000
                    if (saldo - tarik < 50000) {
                        System.out.println("peringatan! Penarikan batal!");
                        System.out.println("Batas saldo minimal setelah penarikan adalah Rp 50.000.");
                    } else {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil! Sisa saldo: Rp " + saldo);
                    }
                    break;
                default:
                    System.out.println("Terimakasih");
            }

        } while (menu != 4); // jika pilih opsi 4 maka loop berhenti

        input.close();
    }
}