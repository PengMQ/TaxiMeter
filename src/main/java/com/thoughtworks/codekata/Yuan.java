package com.thoughtworks.codekata;


public class Yuan {
    private int value;

    public Yuan(int value) {
        //To change body of created methods use File | Settings | File Templates.
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
}
