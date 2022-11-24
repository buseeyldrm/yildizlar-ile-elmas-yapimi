import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   Scanner klavye=new Scanner(System.in);
        System.out.print("Basamak değerini girin: ");
        int n= klavye.nextInt();

        //KAÇ SIRA OLACAGINI BELİRLER
        for (int i = 1; i <=n ; i++) {

            //BOŞLUK YAPMA
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            //YILDIZ YAPMA
            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }

      */


        Scanner klavye=new Scanner(System.in);
        System.out.print("n degeri: ");
        int n= klavye.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = n-1; i >=1 ; i--) {
            for (int l = n; l >i ; l--) {
                System.out.print(" ");

            }
            for (int m = 1; m <=(2*i-1) ; m++) {
                System.out.print("*");

            }
            System.out.println();

        }





            }

            }



