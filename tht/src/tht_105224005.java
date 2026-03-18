import java.util.Scanner;

public class tht_105224005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stockVIP = 5;
        int stockFest = 25;
        int stockTrib = 35;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== KIOSK TIKET PERTAMINA SOUNDFEST 2026 ===");
            System.out.println("1. VIP      (Rp 1.500.000) - Stok: " + stockVIP);
            System.out.println("2. Festival (Rp 800.000)   - Stok: " + stockFest);
            System.out.println("3. Tribune  (Rp 500.000)   - Stok: " + stockTrib);
            System.out.println("4. Matikan Mesin (Teknisi)");
            System.out.print("Pilih kategori (1-4): ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Mematikan sistem...");
                isRunning = false;
                continue;
            }

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlahBeli = input.nextInt();

            int harga = 0, minUsia = 0, sisaStok = 0;
            String kategori = "";

            if (pilihan == 1) {
                kategori = "VIP"; harga = 1500000; minUsia = 18; sisaStok = stockVIP;
            } else if (pilihan == 2) {
                kategori = "Festival"; harga = 800000; minUsia = 15; sisaStok = stockFest;
            } else {
                kategori = "Tribune"; harga = 500000; minUsia = 0; sisaStok = stockTrib;
            }

            if (jumlahBeli > sisaStok) {
                System.out.println("ERROR: Stok tidak mencukupi.");
                continue; 
            }

            int berhasil = 0;
            boolean batalDarurat = false;

            for (int i = 1; i <= jumlahBeli; i++) {
                int usia;
                while (true) {
                    System.out.print("Input Usia Tiket ke-" + i + " (Ketik -1 untuk Batal): ");
                    usia = input.nextInt();
                    if (usia == -1) { 
                        batalDarurat = true;
                        break;
                    }
                    if (usia > 0 && usia < 120) break;
                    System.out.println("Usia tidak logis.");
                }

                if (batalDarurat) break;

                if (usia >= minUsia) {
                    System.out.println("> Berhasil.");
                    berhasil++;
                } else {
                    System.out.println("> Gagal: Usia minimal " + minUsia);
                }
            }

            if (!batalDarurat) {
                long totalTagihan = (long) berhasil * harga;
                System.out.println("\n--- NOTA ---");
                System.out.println("Tiket Berhasil: " + berhasil);
                System.out.println("TOTAL BAYAR   : Rp " + totalTagihan);
                
                if (pilihan == 1) stockVIP -= berhasil;
                else if (pilihan == 2) stockFest -= berhasil;
                else stockTrib -= berhasil;
            }
        }
        input.close();
    }
}