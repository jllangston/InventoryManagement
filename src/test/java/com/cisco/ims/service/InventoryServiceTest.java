package com.cisco.ims.service;

import com.cisco.ims.InventoryDb;
import com.cisco.ims.objects.InventoryObject;
import com.cisco.ims.objects.InventoryObjectImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InventoryServiceTest {

    private InventoryService service;

    @Before
    public void setup() {
        service = new InventoryDb();
        Arrays.asList(
                new InventoryObjectImpl(1, "desc1", 5),
                new InventoryObjectImpl(2, "desc2", 9),
                new InventoryObjectImpl(3, "desc3", 77)
        ).forEach(inv -> service.addInventoryObj(inv));
    }

    @Test
    public void addInventoryObj() {
        InventoryObject invObj = new InventoryObjectImpl(55, "desc6", 77);
        InventoryObject added = service.addInventoryObj(invObj);
        assertEquals(4, added.getId());
    }

}