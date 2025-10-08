import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran matriks n: ");
        int n = input.nextInt();
        
        int[][] matriks1 = new int[n][n];
        int[][] matriks2 = new int[n][n];
        int[][] hasil = new int[n][n];
        
        System.out.println("Masukkan elemen matriks 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Masukkan elemen matriks 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }
        
        // Perkalian matriks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        
        // Cetak hasil
        System.out.println("Hasil Perkalian: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
