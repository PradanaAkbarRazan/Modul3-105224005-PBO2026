import java.util.Scanner;

public class Pretest_105224005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Seleksi Donor Darah");
        
        // Meminta Pengguna Memberi Input
        System.out.print("Usiamu (tahun): ");
        int usia = input.nextInt();

        System.out.print("Berat Badanmu (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Kadar Hemoglobinmu (g/dL): ");
        double kadarHemoglobin = input.nextDouble();

        System.out.println("\nHasil:");

        // Struktur Percabangan Bersarang Nested If
        if (usia >= 17 && usia <= 60) { // Tahap 1
            if (beratBadan >= 50) { // Tahap 2
                if (kadarHemoglobin >= 13.0 && kadarHemoglobin <= 17.0) { // Tahap 3
                    // Semua Tahap Berhasil
                    System.out.println("Anda diperbolehkan menjadi pendonor darah.");
                } else {
                    // Gagal di Tahap 3
                    System.out.println("Anda ditolak: Kadar Hemoglobin tidak sesuai");
                }
            } else {
                // Gagal di Tahap 2
                System.out.println("Anda ditolak: Berat badan minimal 50 kg.");
            }
        } else {
            // Gagal di Tahap 1
            System.out.println("Anda ditolak: Usia harus di rentang 17 - 60 tahun.");
        }

        input.close();
    }
}