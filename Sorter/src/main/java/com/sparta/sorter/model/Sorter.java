package com.sparta.sorter.model;

import java.util.ArrayList;
import java.util.List;

public interface Sorter<T> {
    T[] sort(T[] array);
    List<T> sort(List<T> arrayList);
}
