package com.stumi.safesparsearray;

import android.util.SparseBooleanArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author stumpfb on 29/12/2016.
 */
public class SafeSparseBooleanArrayTest {

    @Test
    public void testEquals() throws Exception {
        SafeSparseBooleanArray safeSparseBooleanArray = new SafeSparseBooleanArray();
        SafeSparseBooleanArray safeSparseBooleanArray2 = new SafeSparseBooleanArray();

        Assert.assertThat(safeSparseBooleanArray.equals(safeSparseBooleanArray2), is(true));
    }

    @Test
    public void testEqualsOld() throws Exception {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();

        Assert.assertThat(sparseBooleanArray.equals(sparseBooleanArray2), is(false));
    }
}