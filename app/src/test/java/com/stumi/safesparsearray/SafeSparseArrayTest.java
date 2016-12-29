package com.stumi.safesparsearray;

import android.util.SparseArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author stumpfb on 29/12/2016.
 */
public class SafeSparseArrayTest {

    @Test
    public void testEquals() throws Exception {
        SafeSparseArray<Object> safeSparseArray = new SafeSparseArray<>();
        SafeSparseArray<Object> safeSparseArray2 = new SafeSparseArray<>();

        Assert.assertThat(safeSparseArray.equals(safeSparseArray2), is(true));
    }

    @Test
    public void testEqualsOld() throws Exception {
        SparseArray<Object> sparseArray = new SparseArray<>();
        SparseArray<Object> sparseArray2 = new SparseArray<>();

        Assert.assertThat(sparseArray.equals(sparseArray2), is(false));
    }
}