package com.stumi.safesparsearray;

import android.util.SparseArray;

/**
 * @author stumpfb on 29/12/2016.
 */

public class SafeSparseArray<E> extends SparseArray<E> {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SparseArray) {
            SparseArray other = (SparseArray) obj;

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
            hashCode = 31 * hashCode + keyAt(i);
            E e = valueAt(i);
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }
}
