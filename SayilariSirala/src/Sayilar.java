import java.util.Scanner;
public class Sayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C;
         System.out.print("Birinci Sayıyı Giriniz: ");
        A = input.nextInt();
         System.out.print("İkinci Sayıyı Giriniz: ");
        B = input.nextInt();
         System.out.print("Üçüncü Sayıyı Giriniz: ");
        C = input.nextInt();

        if ((A < B) && (A < C))
        if (B < C)
            {
                System.out.print("A<B<C");
            }
            else
            {
                System.out.print("A<C<B");
            }
            else if ((B < A) && (B < C))

        if (A < C) {
                System.out.print("B<A<C");
            }
            else
            {
                System.out.print("B<C<A");
            }
            else
            {
        if (B < A) {
                System.out.print("C<B<A");
            }
            else
            {
                System.out.print("C<A<B");
            }
        }
    }
}

