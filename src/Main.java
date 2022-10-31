import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner nannaSanner = new Scanner ( System.in );
        System.out.println ("Enter the number Of Rows : ");
        int rows = nannaSanner.nextInt ();
        for ( int i = 1 ; i <rows  ; i++ ) {
            for ( int j = 1 ; j <rows+2  ; j++ ) {
                System.out.print ("*");

            }
            rows--;


            System.out.println ("0");
        }
    }
}