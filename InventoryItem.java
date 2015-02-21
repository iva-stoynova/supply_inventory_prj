/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m23354;

/**
 *
 * @author grade
 */
public class InventoryItem extends Product {

    private String inventoryCode; //Unikalen tekstov kod - registraciq v sklada
    private int qtyOnHand; //nali4en broi v sklada
    //public static int currentNext=0; //za generirane na unikalni nomera

    public InventoryItem(Product p,String iCode, int qtyOnHand) {
        super(p);
        setInventoryCode(iCode);
        this.setQtyOnHand(qtyOnHand);
        
    }

    public InventoryItem(InventoryItem i) {
        super(i);
       setInventoryCode(i.getInventoryCode());
       this.setQtyOnHand(i.getQtyOnHand());
       
    }
   

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
        
    }

    public String getInventoryCode() {
        return this.inventoryCode;
    }
    

    @Override
    public String toString() {
        //String itemDescription=this.inventoryCode
        return String.format("Item code - %06d\nDescription - %s\nQty - %d", this.inventoryCode, this.getDescription(), this.qtyOnHand);
    }


}
