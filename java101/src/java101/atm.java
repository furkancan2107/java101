/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmornegi;

import java.util.Scanner;


public class Atmornegi {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in );
        int bakiye = 1000;
        System.out.println("1: bakiye goruntule");
        System.out.println("2: para yatir");
        System.out.println("1: para cek");
        System.out.println("4: Sistemden cik");
        
        int islem=scan.nextInt();
        
        switch (islem) {
            case 1: System.out.println("bakiyeniz: " + bakiye);
            break;
            case 2: 
                System.out.println("tl yukle: ");
            int miktar = scan.nextInt();
           bakiye=bakiye+miktar;
                System.out.println(miktar +"tl para yuklediniz" +"toplam paranız: " + bakiye);
            break;
            case 3: System.out.println("para çek: ");
            miktar=scan.nextInt();
            bakiye=bakiye - miktar;
            System.out.println(miktar +"tl para cektiniz" +"kalan paraniz: " + bakiye);
            
            break;
            case 4 : System.out.println("Sistemden cikiliyor");
            break;
            default:System.out.println("Gecersiz islem");
           
            
        }
    }
    
}
