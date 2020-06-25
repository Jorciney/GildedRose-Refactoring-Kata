package com.gildedrose;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class GildedRoseAssertion extends AbstractAssert<GildedRoseAssertion, GildedRose> {

    public GildedRoseAssertion(GildedRose actual) {
        super(actual, GildedRoseAssertion.class);
    }

    public static GildedRoseAssertion assertThat(GildedRose actual) {
        return new GildedRoseAssertion(actual);
    }

    public ItemAssertion hasItem(int index) {
        Assertions.assertThat(actual.items.length).isGreaterThan(index);
        return ItemAssertion.assertThat(actual.items[index]);
    }
}
