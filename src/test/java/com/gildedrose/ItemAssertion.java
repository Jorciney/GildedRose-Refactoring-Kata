package com.gildedrose;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class ItemAssertion extends AbstractAssert<ItemAssertion, Item> {

    protected ItemAssertion(Item actual) {
        super(actual, ItemAssertion.class);
    }

    public static ItemAssertion assertThat(Item actual) {
        return new ItemAssertion(actual);
    }

    public ItemAssertion hasItemName(String name) {
        Assertions.assertThat(actual.name).isEqualTo(name);
        return this;
    }

    public ItemAssertion hasQuality(int quality) {
        Assertions.assertThat(actual.quality).isEqualTo(quality);
        return this;
    }

    public ItemAssertion hasSellIn(int sellIn) {
        Assertions.assertThat(actual.sellIn).isEqualTo(sellIn);
        return this;
    }

    public ItemAssertion hasToString(String toString) {
        Assertions.assertThat(actual.toString()).isEqualTo(toString);
        return this;
    }

}
