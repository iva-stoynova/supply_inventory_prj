/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m23354;

/**
 *
 * @author grade
 */
public class Manager {

    private String name;
    private InventoryRecordListener listener;

    public Manager(String name) {
        this.setName(name);
    }

    public Manager(Manager m) {
        this.setName(m.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInventoryRecordListener(InventoryRecordListener listener){
        this.listener=listener;

    }
    public void onProductSupply(Product [] newSupply){
        listener.addInventory(new SupplyEventArgs(newSupply));

    }
    @Override
    public String toString() {
        String returnString = "Manager name: "+this.name;
        return returnString;
    }
}
