/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java101;

import java.util.Scanner;

/**
 *
 * @author Furkan Can
 */
public class Hipotenus {
    public static void main(String[] args){
    
    int birinci,ikinci;
    double hipotenus;
    
    Scanner scan= new Scanner(System.in);
    System.out.println("birinci kenari gir: ");
    birinci=scan.nextInt();
    
    System.out.println("birinci kenari gir: ");
    ikinci=scan.nextInt();
    
    hipotenus=Math.sqrt((birinci*birinci)+(ikinci*ikinci));
    System.out.println("Hipotenus: " + hipotenus);
    
    
    }
}
