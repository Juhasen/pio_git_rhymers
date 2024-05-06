package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int totalCount = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    protected boolean callCheck() {
        return totalCount == -1;
    }

    protected boolean isFull() {
        return totalCount == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[totalCount];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[totalCount--];
    }

}
