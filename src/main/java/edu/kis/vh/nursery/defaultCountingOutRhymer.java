package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int totalCount = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == -1;
    }

    public boolean isFull() {
        return totalCount == 11;
    }

    protected int getTopValue() {
        if (callCheck())
            return -1;
        return numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[totalCount--];
    }

}
