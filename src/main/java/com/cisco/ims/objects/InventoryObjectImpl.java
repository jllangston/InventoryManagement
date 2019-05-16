package com.cisco.ims.objects;

public class InventoryObjectImpl implements InventoryObject {

    private long id;
    private String description;
    private int qty;

    public InventoryObjectImpl(long id, String desc, int qty) {
        this.id = id;
        this.description = desc;
        this.qty = qty;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public int getQuantity() {
        return qty;
    }

    @Override
    public void setQuantity(int qty) {
        this.qty = qty;
    }
}
