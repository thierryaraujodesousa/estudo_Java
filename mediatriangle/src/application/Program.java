 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Locale;
import java.util.Scanner; 
import entities.Triangle; 
/**
 *
 * @author thier
 */
public class Program {
     public static void main(String[]args){
         
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         
         
        Triangle x,y; 
        x = new Triangle();
        y = new Triangle(); 
         
         System.out.println("digite as medias do triangulo X : ");
         
         x.a= sc.nextDouble();
         x.b= sc.nextDouble();
         x.c= sc.nextDouble(); 
         
         System.out.println("as medidas escolhidas foram : "  +x.a +x.b +x.c  ); 
         
         
           System.out.println("digite as medidas do triangulo Y : ");
         
         y.a= sc.nextDouble();
         y.b= sc.nextDouble();
         y.c= sc.nextDouble(); 
         
         System.out.println("as medidas escolhidas foram : " +y.a +y.b +y.c ); 
         
         
         
         
         
         double areaX = x.area(); 
           
          
         
         double areaY = y.area(); 
         
         
        System.out.printf("area do triangulo x : %.4f%n",areaX);
         System.out.printf("area do triangulo y : %.4f%n",areaY);
         
         if (areaX>areaY){
             System.out.println(" a maior area: X ");
         }
             else{
                     System.out.println( "a maior aréa : Y ");
                     }
                     
         }
                 
     }
    