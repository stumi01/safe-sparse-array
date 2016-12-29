package com.stumi.safesparsearray.v4;

import android.support.v4.util.LongSparseArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author stumpfb on 29/12/2016.
 */
public class SafeLongSparseArrayTest {

    @Test
    public void testEquals() throws Exception {
        SafeLongSparseArray<Object> safeLongSparseArray = new SafeLongSparseArray<>();
        SafeLongSparseArray<Object> safeLongSparseArray2 = new SafeLongSparseArray<>();

        Assert.assertThat(safeLongSparseArray.equals(safeLongSparseArray2), is(true));
    }

    @Test
    public void testEqualsOld() throws Exception {
        LongSparseArray<Object> longSparseArray = new LongSparseArray<>();
        LongSparseArray<Object> longSparseArray2 = new LongSparseArray<>();

        Assert.assertThat(longSparseArray.equals(longSparseArray2), is(false));
    }
}