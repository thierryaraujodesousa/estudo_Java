/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author thier
 */
public class Product {
    
    public String name; 
    public double price;
    public int quantity; 
    
    
    public double totalvalueinstock(){
    
    return price*quantity; 
    
    } 
    public void addproducts(int quantity) {
    
    /*this.quantity = (quantity + 1); *\ 
        
        */
        this.quantity += quantity; 
       
    
    
    }
    
    public void removeproducts(int quantity){
    
    this.quantity -= quantity; 
    
    
    
       

}
    
    public String toString ( ) {
    
        return name
          + " , $ "
          + price
          + " ,  "
          + quantity 
                 + " units, total : $ "
                  + totalvalueinstock();
                  
        
       }
   
    
    
        
     
     }

    
    
    
    
    

    
    
    
    
    
    
    
    
    

