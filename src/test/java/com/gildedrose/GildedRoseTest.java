package com.gildedrose;

import org.junit.jupiter.api.Test;

import static com.gildedrose.constants.ProductNames.*;

class GildedRoseTest {

    @Test
    public void testUpdateQuality_givenUnknownItemName() {
        GildedRose actual = createAndUpdateGildedRose(UNKNOWN, 0, 0);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(UNKNOWN)
                .hasQuality(0);
    }

    @Test
    public void testUpdateQuality_givenSellIn10AndQuality49ForBackstagePasses_thenReturnQuality50() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 10, 49);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasQuality(50);
    }

    @Test
    public void testUpdateQuality_givenSellIn10AndQuality49ForSulfuras_thenReturnQuality49() {
        GildedRose actual = createAndUpdateGildedRose(SULFURAS_HAND_OF_RAGNAROS, 10, 49);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(SULFURAS_HAND_OF_RAGNAROS)
                .hasQuality(49);
    }

    @Test
    public void testUpdateQuality_givenNegativeSellInAndQuality2ForUnknownName_thenReturnQuality0() {
        GildedRose actual = createAndUpdateGildedRose(UNKNOWN, -1, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(UNKNOWN)
                .hasSellIn(-2)
                .hasQuality(0);
    }

    @Test
    public void testUpdateQuality_givenSellIn7AndQuality2ForUnknownName_thenReturnQuality1() {
        GildedRose actual = createAndUpdateGildedRose(UNKNOWN, 7, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(UNKNOWN)
                .hasSellIn(6)
                .hasQuality(1);
    }

    @Test
    public void testUpdateQuality_givenNegativeSellInAndQuality2ForBackstagePasses_thenReturnQuality0() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, -1, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasSellIn(-2)
                .hasQuality(0);
    }

    @Test
    public void testUpdateQuality_givenNegativeSellInAndQuality2ForSulfuras_thenReturnQuality2() {
        GildedRose actual = createAndUpdateGildedRose(SULFURAS_HAND_OF_RAGNAROS, -1, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(SULFURAS_HAND_OF_RAGNAROS)
                .hasSellIn(-1)
                .hasQuality(2);
    }

    @Test
    public void testUpdateQuality_givenSellIn4AndQuality2ForBackstagePasses_thenReturnQuality5() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 4, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasSellIn(3)
                .hasQuality(5);
    }

    @Test
    public void testUpdateQuality_givenSellIn8AndQuality2ForBackstagePasses_thenReturnQuality4() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 8, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasSellIn(7)
                .hasQuality(4);
    }

    @Test
    public void testUpdateQuality_givenSellIn11AndQuality2ForBackstagePasses_thenReturnQuality3() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 11, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasSellIn(10)
                .hasQuality(3);
    }

    @Test
    public void testUpdateQuality_givenSellIn4AndQuality49ForBackstagePasses_thenReturnQuality50() {
        GildedRose actual = createAndUpdateGildedRose(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 4, 49);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)
                .hasSellIn(3)
                .hasQuality(50);
    }

    @Test
    public void testUpdateQuality_givenSellIn4AndQuality2ForSulfuras_thenReturnQuality2() {
        GildedRose actual = createAndUpdateGildedRose(SULFURAS_HAND_OF_RAGNAROS, 4, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(SULFURAS_HAND_OF_RAGNAROS)
                .hasSellIn(4)
                .hasQuality(2);
    }

    @Test
    public void testUpdateQuality_givenNegativeSellInAndQuality2ForAgedBrie_thenReturnQuality4() {
        GildedRose actual = createAndUpdateGildedRose(AGED_BRIE, -1, 2);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(AGED_BRIE)
                .hasQuality(4);
    }

    @Test
    public void testUpdateQuality_givenSellIn8AndQuality52ForAgedBrie_thenReturnQuality52() {
        GildedRose actual = createAndUpdateGildedRose(AGED_BRIE, 8, 52);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(AGED_BRIE)
                .hasQuality(52);
    }

    @Test
    public void testUpdateQuality_givenNegativeSellInAndQuality49ForAgedBrie_thenReturnQuality50() {
        GildedRose actual = createAndUpdateGildedRose(AGED_BRIE, -1, 49);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(AGED_BRIE)
                .hasSellIn(-2)
                .hasQuality(50);
    }

    @Test
    public void testUpdateQuality_givenSellIn8AndQuality52ForSulfuras_thenReturnQuality52() {
        GildedRose actual = createAndUpdateGildedRose(SULFURAS_HAND_OF_RAGNAROS, 8, 52);

        GildedRoseAssertion.assertThat(actual)
                .hasItem(0)
                .hasItemName(SULFURAS_HAND_OF_RAGNAROS)
                .hasSellIn(8)
                .hasToString("Sulfuras, Hand of Ragnaros, 8, 52")
                .hasQuality(52);
    }


    private GildedRose createAndUpdateGildedRose(String itemName, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(itemName, sellIn, quality)};
        GildedRose actual = new GildedRose(items);
        actual.updateQuality();
        return actual;
    }

}
