import java.util.*;
public class NotOrtalamasi50denKucukseKaldiBuyukseGectiYazdiranProgram{
    
    
    public static void main(String[] args) 
    {
        
    int not1;
    int not2;
    int not3;
    int ort;
    System.out.println("Lutfen sinav notlarinizi giriniz:");
    Scanner scanner = new Scanner(System.in);
    
    not1 = scanner.nextInt();
    not2 = scanner.nextInt();
    not3 = scanner.nextInt();
    ort = (not1+not2+not3)/3;
    System.out.println(ort);
    
    if (ort<50)
    {
        System.out.println("KALDI");
    }
    else
    {
        System.out.println("GEÇTİ");
        
    }
    }
}