package com.cisco.ims.objects;

public interface InventoryObject {
    void setId(long id);
    long getId();
    String getDescription();
    void setDescription(String desc);
    int getQuantity();
    void setQuantity(int qty);

}
