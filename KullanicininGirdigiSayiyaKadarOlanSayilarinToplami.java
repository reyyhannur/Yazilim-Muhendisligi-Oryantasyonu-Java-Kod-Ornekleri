import java.util.*;
public class KullanicininGirdigiSayiyaKadarOlanSayilarinToplami{
    
    
    public static void main(String arg[])	
	{
                  int n,sum=0;
                  
                  Scanner sc=new Scanner(System.in);
 
	    System.out.println("Toplanacak Sayı Adediği Girin");
                   n=sc.nextInt();
                   int a[]=new int[n]; 
	    System.out.println("Giridiğiniz sayı "+n);
                   for(int i=0;i<n;i++)
                   {      
	             System.out.println("Sayı:  "+(i+1)+":");
                           a[i]=sc.nextInt();
                   }
                   for(int i=0;i<n;i++)
                   {
                           sum+=a[i];
                   }  	    
                   System.out.println("Toplam Sayı "+n+" Sayıların Toplamı ="+sum);                  
              	}
 
}