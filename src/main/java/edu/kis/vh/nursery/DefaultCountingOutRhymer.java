package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int AMOUNT_OF_NUMBERS = 12;
    public static final int ERROR = -1;
    private int[] numbers = new int[AMOUNT_OF_NUMBERS];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == (AMOUNT_OF_NUMBERS - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
