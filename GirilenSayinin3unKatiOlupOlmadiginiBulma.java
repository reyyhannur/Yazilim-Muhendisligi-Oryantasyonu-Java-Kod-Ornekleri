import java.util.*;
public class GirilenSayinin3unKatiOlupOlmadiginiBulma{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        
        if(sayi % 3 == 0) {
            System.out.println("Girilen sayı 3 ün katıdır");
        }
        else {
            System.out.println("Girilen sayi 3 un katı degildir.");
        }
    }
}

 