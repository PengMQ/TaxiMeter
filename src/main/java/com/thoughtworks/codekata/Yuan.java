package com.thoughtworks.codekata;


public class Yuan {
    private float value;

    public Yuan(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Yuan)) {
            return false;
        }

        Yuan thatYuan = (Yuan) o;
        return value == thatYuan.value;
    }

    public Yuan plus(Yuan y) {
        return new Yuan(value + y.value);
    }

    public float getValue() {
        return value;
    }
}
