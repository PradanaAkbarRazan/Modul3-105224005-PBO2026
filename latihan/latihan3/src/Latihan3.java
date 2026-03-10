public class Latihan3 {
    public static void main(String[] args) throws Exception {

        System.out.println("Deret angka 1-50 (Tanpa kelipatan 3 atau 5):");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue; // kalau kelipatan 3 atau 5 maka dilewatkan
            }
            
            System.out.print(i + " ");
        }
    }
}