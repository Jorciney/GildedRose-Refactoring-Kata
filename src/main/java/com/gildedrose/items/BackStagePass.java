package com.gildedrose.items;

import com.gildedrose.Item;

public class BackStagePass extends ItemCategory {
    private static BackStagePass backStagePass = null;

    public static void updateItem(Item item) {
        if (backStagePass == null) {
            backStagePass = new BackStagePass();
        }
        backStagePass.update(item);
    }

    private void update(Item item) {

        incrementQuality(item);

        if (item.sellIn < 11) {
            incrementQualityIfQualitySmallerThan50(item);
        }

        if (item.sellIn < 6) {
            incrementQualityIfQualitySmallerThan50(item);
        }

        decrementSellIn(item);

        updateQualityToWhenExpired(item, 0);
    }

}
