import java.util.Scanner; //

class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        int a = 1, b = 1;
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();
        input.close();
    }
}
