package generics;

import java.util.Arrays;

public class MaximumValue <T extends Comparable<T>> {

    private T first;
    private T second;
    private T third;

    public MaximumValue() {
    }

    public MaximumValue(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T maximum(T first, T second, T third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }

    public <T extends Comparable<T>> T testMaximum() {
        return (T) maximum(first, second, third);
    }

    public T maximum(T... param) {
        Arrays.sort(param);
        return param[param.length - 1];
    }
}


    /*public Integer maximum(Integer first, Integer second, Integer third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }
    public Float maximum(Float first, Float second, Float third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }
    public String maximum(String first, String second, String third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }*/


