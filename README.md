[![](https://jitpack.io/v/stumi01/safe-sparse-array.svg)](https://jitpack.io/#stumi01/safe-sparse-array)
### Description

**safe-sparse-array** for android projects because the original [SparseArray](https://developer.android.com/reference/android/util/SparseArray.html) classes are failing for equals checks.
[See tests](https://github.com/stumi01/safe-sparse-array/tree/master/app/src/test/java/com/stumi/safesparsearray) for proof :)

### User guide
Just replace the usage of `*SparseArray` with `Safe*SparseArray`.
All the classes are extending from the original ones, just mplementing the equals and hashcode methods.

### Integration

The lib is available on https://jitpack.io.

```
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.stumi01:safe-sparse-array:1.0'
}
```

### License

```
    The MIT License (MIT)

    Copyright 2016 Bence András Stumpf

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
```