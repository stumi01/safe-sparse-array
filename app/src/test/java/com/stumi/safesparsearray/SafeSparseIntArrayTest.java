package com.stumi.safesparsearray;

import android.util.SparseIntArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author stumpfb on 29/12/2016.
 */
public class SafeSparseIntArrayTest {

    @Test
    public void testEquals() throws Exception {
        SafeSparseIntArray safeSparseIntArray = new SafeSparseIntArray();
        SafeSparseIntArray safeSparseIntArray2 = new SafeSparseIntArray();

        Assert.assertThat(safeSparseIntArray.equals(safeSparseIntArray2), is(true));
    }

    @Test
    public void testEqualsOld() throws Exception {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();

        Assert.assertThat(sparseIntArray.equals(sparseIntArray2), is(false));
    }

}