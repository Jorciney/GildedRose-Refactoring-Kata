package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ItemCategory {
    private static AgedBrie agedBrie = null;

    public static void updateItem(Item item) {
        if (agedBrie == null) {
            agedBrie = new AgedBrie();
        }
        agedBrie.update(item);
    }

    private void update(Item item) {
        incrementQualityIfQualitySmallerThan50(item);

        decrementSellIn(item);

        if (item.sellIn < 0 && item.quality < 50) {
            incrementQualityIfQualitySmallerThan50(item);
        }
    }

}
