import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifina ait degiskenimiz projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Gerekli degiskenlerimiz tanimlandi.
        int lNumber = 0, sNumber = 0, tempNumber = 1, n = 0;

        // Kullanicidan verileri alip karsilastirilacak ilk veriyi buyuk ve kucuk sayiyi tutacagimiz degiskenlere atadik.
        System.out.print("Kac adet sayiyi karsilastirmak istemistiniz? : ");
        n = input.nextInt();

        System.out.print("\nKarsilastirmak istediginiz 1. sayiyi giriniz : ");
        tempNumber = input.nextInt();
        sNumber = tempNumber;
        lNumber = tempNumber;

        // Karsilastirmanin yapildigi dongu.
        for (int i = 1; i < n; i++){

            System.out.print("\nKarsilastirmak istediginiz " + i + ". sayiyi giriniz : ");
            tempNumber = input.nextInt();

            if (tempNumber > lNumber){
                lNumber = tempNumber;
            }

            if (tempNumber < sNumber){
                sNumber = tempNumber;
            }
        }
        // Kullaniciya cikti verdigimiz print.
        System.out.println("\nBuyuk sayi: " + lNumber + "\nKucuk sayi : " + sNumber);
    }
}