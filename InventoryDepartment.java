/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m23354;

/**
 *
 * @author grade
 */
public class InventoryDepartment {

    private static int INVENTORY_SIZE = 1000;
    private Manager manager;
    private InventoryItem[] inventoryItem = new InventoryItem[INVENTORY_SIZE]; //max broi INVENTORY_SIZE
    private static int index = 0; //teku6t broi razlichni produkti v sklada
    private static int count = 0;

    public InventoryDepartment(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager=manager;
        this.manager.addInventoryRecordListener(new InventoryWork());
    }

    public InventoryItem[] getInventoryItem() {
        return this.inventoryItem;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        for (int i = 0; i < inventoryItem.length; i++) {
            this.inventoryItem[i] = inventoryItem[i];
        }
    }

    private class InventoryWork implements InventoryRecordListener {

        public InventoryWork() {
        }


        public void addInventory(SupplyEventArgs args) {
            Product[] p = args.getProducts();

            for (int i = 0; i < p.length; i++) {

                boolean inFlag = false;
                int indexItem=0;
                for (int j = 0; j < inventoryItem.length; j++) {
                    if (p[i].getDescription() == inventoryItem[i].getDescription()) {
                        inFlag = true;
                        indexItem=j;
                        break;
                    }
                }
                if (inFlag == false) {
                    InventoryItem item = new InventoryItem(p[i], String.format("%06s", count), p[i].getReorderQty());
                    inventoryItem[index]=item;
                    index++;
                } else {
                    inventoryItem[indexItem].setQtyOnHand(inventoryItem[indexItem].getQtyOnHand()+p[i].getReorderQty());
                }

            }

        }
    }

    @Override
    public String toString() {
        String returnInfo = "Manager -  " + this.manager.toString() + "\n";
        for (int i = 0; i < inventoryItem.length; i++) {
            returnInfo = returnInfo + inventoryItem[i].toString() + "\n";
        }

        return returnInfo;
    }
}
