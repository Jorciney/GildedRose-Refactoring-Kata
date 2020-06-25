package com.gildedrose;

import java.util.stream.IntStream;

import static com.gildedrose.constants.ProductNames.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        IntStream.range(0, items.length)
                .forEach(this::updateQuality);
    }

    private void updateQuality(int i) {
        Item item = items[i];
        switch (item.name) {
            case AGED_BRIE:
                udpateAgedBrie(item);
                break;
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                updateBackstagePasses(item);
                break;
            case SULFURAS_HAND_OF_RAGNAROS:
                return;
            default:
                updateOtherItems(item);
                break;
        }
    }

    private void updateOtherItems(Item item) {
        if (item.quality > 0) {
            decreaseItemQualityByOne(item);
        }

        decreaseSellInByOne(item);

        if (item.sellIn < 0 && item.quality > 0) {
            decreaseItemQualityByOne(item);
        }
    }

    private void decreaseItemQualityByOne(Item item) {
        item.quality = item.quality - 1;
    }

    private void updateBackstagePasses(Item item) {
        increaseItemQualityByOne(item);

        if (item.sellIn < 11 && item.quality < 50) {
            increaseItemQualityByOne(item);
        }

        if (item.sellIn < 6 && item.quality < 50) {
            increaseItemQualityByOne(item);
        }

        decreaseSellInByOne(item);

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void udpateAgedBrie(Item item) {
        if (item.quality < 50) {
            increaseItemQualityByOne(item);
        }

        decreaseSellInByOne(item);

        if (item.sellIn < 0 && item.quality < 50) {
            increaseItemQualityByOne(item);
        }
    }

    private void decreaseSellInByOne(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseItemQualityByOne(Item item) {
        item.quality = item.quality + 1;
    }


}
