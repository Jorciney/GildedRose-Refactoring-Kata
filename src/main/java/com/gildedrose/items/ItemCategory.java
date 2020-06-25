package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemCategory {

    protected void decrementSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void incrementQuality(Item item) {
        item.quality = item.quality + 1;
    }

    protected void incrementQualityIfQualitySmallerThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decrementQuality(Item item) {
        item.quality = item.quality - 1;
    }

    protected void decrementQualityIfQualityGreaterThan0(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

    protected void updateQualityToWhenExpired(Item item, int newQualityValue) {
        if (isExpired(item)) {
            item.quality = newQualityValue;
        }
    }
}
