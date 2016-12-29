package com.stumi.safesparsearray;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.SparseLongArray;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author stumpfb on 29/12/2016.
 */
public class SafeSparseLongArrayTest {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Test
    public void testEquals() throws Exception {
        SafeSparseLongArray safeSparseLongArray = new SafeSparseLongArray();
        SafeSparseLongArray safeSparseLongArray2 = new SafeSparseLongArray();

        Assert.assertThat(safeSparseLongArray.equals(safeSparseLongArray2), is(true));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Test
    public void testEqualsOld() throws Exception {
        SparseLongArray sparseLongArray = new SparseLongArray();
        SparseLongArray sparseLongArray2 = new SparseLongArray();

        Assert.assertThat(sparseLongArray.equals(sparseLongArray2), is(false));
    }
}