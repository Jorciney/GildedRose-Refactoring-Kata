package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.GeneralItem;

import java.util.stream.IntStream;

import static com.gildedrose.constants.ProductNames.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItemQuality() {
        IntStream.range(0, items.length)
                .forEach(this::updateItemQuality);
    }

    private void updateItemQuality(int i) {
        Item item = items[i];
        switch (item.name) {
            case AGED_BRIE:
                AgedBrie.updateItem(item);
                break;
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                BackStagePass.updateItem(item);
                break;
            case SULFURAS_HAND_OF_RAGNAROS:
                return;
            default:
                GeneralItem.updateItem(item);
                break;
        }
    }
}
