package com.stumi.safesparsearray.v4;

import android.support.v4.util.LongSparseArray;

/**
 * @author stumpfb on 29/12/2016.
 */

public class SafeLongSparseArray<E> extends LongSparseArray<E> {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LongSparseArray) {
            LongSparseArray other = (LongSparseArray) obj;

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

                E o1 = valueAt(index);
                Object o2 = other.valueAt(index);
                if (!(o1 == null ? o2 == null : o1.equals(o2))) {
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
            long keyAt = keyAt(i);
            hashCode = 31 * hashCode + (int) (keyAt ^ (keyAt >>> 32));
            E e = valueAt(i);
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }
}
