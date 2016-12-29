package com.stumi.safesparsearray;

import android.util.SparseIntArray;

/**
 * @author stumpfb on 29/12/2016.
 */

public class SafeSparseIntArray extends SparseIntArray {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SparseIntArray) {
            SparseIntArray other = (SparseIntArray) obj;

            // compare count
            int count = size();
            if (count != other.size()) {
                return false;
            }

            // for each pair
            for (int index = 0; index < count; ++index) {

                if (keyAt(index) != other.keyAt(index)) {
                    return false;
                }

                if (valueAt(index) != other.valueAt(index)) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < size(); i++) {
            hashCode = 31 * hashCode + keyAt(i);
            hashCode = 31 * hashCode + valueAt(i);
        }
        return hashCode;
    }
}
