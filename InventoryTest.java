/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package m23354;

/**
 *
 * @author grade
 */
public class InventoryTest {
    public static void main (String [] args){
    Manager m = new Manager("Radi");

    InventoryDepartment dept = new InventoryDepartment(m);
    Product product1  = new Product("prod1", 1);
    Product product2  = new Product("prod1", 2);
    Product product3  = new Product("prod1", 3);

    Product [] products = {product1, product2, product3};
    dept.getManager().onProductSupply(products);


    }
}
