package com.stumi.safesparsearray;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.SparseLongArray;

/**
 * @author stumpfb on 29/12/2016.
 */

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public class SafeSparseLongArray extends SparseLongArray {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SparseLongArray) {
            SparseLongArray other = (SparseLongArray) obj;

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
            long valueAt = valueAt(i);
            hashCode = 31 * hashCode + (int) (valueAt ^ (valueAt >>> 32));
        }
        return hashCode;
    }
}
