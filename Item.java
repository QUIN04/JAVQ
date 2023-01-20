 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templaTe file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.app;

/**
 *
 * @author DELL LATITUDE
 */
public class Item {
    
    String name;
    int quantity;
    float unit_price;
    
    public Item(String n,int q,float u){
    
    name=n;
    quantity=q;
    unit_price=u;
   
    
    
    }
public void printItem(){
        System.out.println("item name : "+name);
        System.out.println("item quantity : "+quantity);
        System.out.println("item price : "+unit_price);
}

  


}