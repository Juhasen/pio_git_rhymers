package edu.kis.vh.nursery;
/**
 * The HanoiRhymer class extends DefaultCountingOutRhymer and adds functionality
 * to count and report rejected values based on specific criteria.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * The total number of rejected values.
     */
    private int totalRejected = 0;

    /**
     * Reports the total number of rejected values.
     *
     * @return the total number of rejected values
     */
    protected int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds a value to the rhymer. If the value is greater than the current top value
     * and the rhymer is not empty, the value is rejected and the total rejected count is incremented.
     * Otherwise, the value is added to the rhymer.
     *
     * @param in the value to be added to the rhymer
     */
    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Returns the total number of rejected values.
     *
     * @return the total number of rejected values
     */
    public int getTotalRejected() {
        return totalRejected;
    }

}
