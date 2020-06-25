package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends ItemCategory {
    private static Conjured conjured = null;

    public static void updateItem(Item item) {
        if (conjured == null) {
            conjured = new Conjured();
        }
        conjured.update(item);
    }

    private void update(Item item) {
        decreaseItemQualityInValueIfQualityGreaterThanZero(item, 2);

        decrementSellIn(item);

        if (isExpired(item) && item.quality > 0) {
            decreaseItemQualityInValueIfQualityGreaterThanZero(item, 2);
        }
    }

}
