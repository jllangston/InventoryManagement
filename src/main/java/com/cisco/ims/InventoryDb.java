package com.cisco.ims;

import com.cisco.ims.objects.InventoryObject;
import com.cisco.ims.service.InventoryService;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class InventoryDb implements InventoryService {

    TreeMap<Long, InventoryObject> idToInventory = new TreeMap<>();


    @Override
    public Set<InventoryObject> getInventory() {
        return new HashSet<>(idToInventory.values());
    }

    @Override
    public InventoryObject getById(long id) {
        return idToInventory.get(id);
    }

    @Override
    public InventoryObject addInventoryObj(InventoryObject invObj) {
        long lastId = 0;
        if (!idToInventory.isEmpty()) {
            lastId = idToInventory.lastKey();;
        }
        long id = ++lastId;
        invObj.setId(id);
        idToInventory.put(id, invObj);
        return invObj;
    }

    @Override
    public InventoryObject replaceInventoryObj(InventoryObject invObj) {
        idToInventory.replace(invObj.getId(), invObj);
        return invObj;
    }

    @Override
    public void deleteInventoryObjById(long id) {
        InventoryObject invObj = idToInventory.get(id);
        if (invObj != null) {
            idToInventory.remove(invObj);
        }
    }
}
