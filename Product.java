/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m23354;

/**
 *
 * @author grade
 */
public class Product {

    private String description;
    private int reorderQty;

    public Product() {
        this.setDescription(null);
        this.setReorderQty(0);

    }

    public Product(String description, int reorderQty) {
        this.setDescription(description);
        this.setReorderQty(reorderQty);
    }

    public Product(Product p) {
        this.setDescription(p.getDescription());
        this.setReorderQty(p.getReorderQty());
    }

    public String getDescription() {
        return description;
    }

    public int getReorderQty() {
        return reorderQty;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReorderQty(int reorderQty) {
        if (reorderQty<0)
            this.reorderQty = 0;
        else
            this.reorderQty=reorderQty;

    }

    @Override
    public String toString() {
        String productDescription = "Product "+this.description + " - "+this.reorderQty+" qty";
        return productDescription;
    }
}
