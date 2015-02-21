/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package m23354;

/**
 *
 * @author grade
 */
public class SupplyEventArgs {
    private Product [] products;

    public SupplyEventArgs(Product[] prod) {
        this.products=new Product[prod.length];

        for (int p=0; p<prod.length;p++)
            this.products[p]=prod[p];
    }


    public Product[] getProducts() {
        return this.products;
    }


}
