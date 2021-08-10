/*
objeto.toString codigo pra transformar obejto em string ((((pelo que eu entendi 
ne porra
 */
package application;

/**
 *
 * @author thierru
 */

import entities.Product; 
import java.util.Scanner; 
public class Program {
    
    public static void main(String[]args) {
    
    Scanner sc = new Scanner(System.in); 
    
Product product =  new Product();
System.out.println("digite as especificaçoes:");
System.out.print(" name ");

product.name= sc.nextLine();

System.out.print(" price ");

product.price =sc.nextDouble();

System.out.print(" quantity in stock ");

product.quantity =sc.nextInt();


System.out.println();
System.out.println("product data : " +product);   
System.out.println();
System.out.print(" Enter the number of products to be added in stock :"); 
int quantity = sc.nextInt();

product.addproducts(quantity);

System.out.println("updated data : " +product); 
 System.out.println();
 System.out.print("Enter the number of products to be removed from stock: ");
  quantity = sc.nextInt();
 
product.removeproducts(quantity);

System.out.println("updated data : " +product); 
 System.out.println();



    
    }
    
    
}
