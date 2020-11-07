package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.model.LiquorType;

public class LiquorService {
    public List getAvailableBrands(LiquorType type) {
        List brands = new ArrayList();
        if(type.equals(LiquorType.BOURBON)) {
            brands.add("1792");
            brands.add("Woodford Reserve");
            brands.add("Ranger Creek");
        }else if(type.equals(LiquorType.VODKA)) {
            brands.add("Ciroc");
            brands.add("Kettle One");
        }else {
            brands.add("No brand available");
        }
            return brands;
    }

    public int getBrandStock(LiquorType type) {
        int stockCount = 0;
        if(type.equals(LiquorType.BOURBON)) {
            stockCount = 40;
        }else if(type.equals(LiquorType.VODKA)) {
            stockCount = 50;
        }else {
            stockCount = 0;
        }
        return stockCount;
    }

}
