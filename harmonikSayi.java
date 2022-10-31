package Giris;
import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");
        int n=inp.nextInt();
        double toplam=0;

        double i=1;
        while (i<=n){
            toplam+=(1/i);
            i++;


        }
        System.out.println(toplam);



    }
}
