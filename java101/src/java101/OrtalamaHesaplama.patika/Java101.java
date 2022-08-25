/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java101;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author Furkan Can
 */
public class Java101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        
        while(true){
        System.out.println("turkce ortalamanizi girin: ");
        double tr=scan.nextDouble();
        
        if(tr>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
         System.out.println("matematik ortalamanizi girin : ");
        double mat=scan.nextDouble();
        
          if(mat>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
        
        System.out.println("fizik ortalamanizi girin: ");
        double fiz=scan.nextDouble();
        
          if(fiz>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
        
        System.out.println("kimya ortalamanizi girin: ");
        double kimya=scan.nextDouble();
        
          if(kimya>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
        
        System.out.println("tarih ortalamanizi girin: ");
        double tarih=scan.nextDouble();
        
          if(tarih>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
        
        System.out.println("muzik ortalamanizi girin: ");
        double muzik=scan.nextDouble();
        
          if(muzik>100){
        System.out.println("Lütfen 1-100 arasinda bir sayi girin"); 
          break;
        }
        
        double toplam=(tr+mat+fiz+kimya+muzik+tarih);
        double ort=toplam/6;
        
        
        System.out.println("Ortalamanız: " + ort);
        
        System.out.println(ort>60 ? "Sinifi Gecti" : "Sinifta Kaldi");
        break;
        }
        
        
       
        
        
     
        
        
        
        
    }
    
}
