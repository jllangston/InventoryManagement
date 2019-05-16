package com.cisco.ims.service;

import com.cisco.ims.objects.InventoryObject;

import java.util.Set;

public interface InventoryService {
    Set<InventoryObject> getInventory();
    InventoryObject getById(long id);
    InventoryObject addInventoryObj(InventoryObject invObj);
    InventoryObject replaceInventoryObj(InventoryObject invObj);
    void deleteInventoryObjById(long id);
}
