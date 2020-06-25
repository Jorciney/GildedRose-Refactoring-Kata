package com.gildedrose.items;

import com.gildedrose.Item;

public class GeneralItem extends ItemCategory {
    private static GeneralItem generalItem = null;

    public static void updateItem(Item item) {
        if (generalItem == null) {
            generalItem = new GeneralItem();
        }
        generalItem.update(item);
    }

    private void update(Item item) {
       decreaseItemQualityInValueIfQualityGreaterThanZero(item, 1);

        decrementSellIn(item);

        if (item.sellIn < 0 && item.quality > 0) {
            decrementQuality(item);
        }
    }

}
