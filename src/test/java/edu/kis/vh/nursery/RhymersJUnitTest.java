package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        assertEquals(testValue, result);
        result = rhymer.peekaboo();
        assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        assertEquals(testValue, result);
        result = rhymer.countOut();
        assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testCountInAndReportRejected() {
        //TEST HANOI RHYMER
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        hanoiRhymer.countIn(1);
        hanoiRhymer.countIn(2);
        hanoiRhymer.countIn(3);

        assertEquals(2, hanoiRhymer.reportRejected());
        assertEquals(2, hanoiRhymer.getTotalRejected());

        hanoiRhymer.countIn(2);

        assertEquals(3, hanoiRhymer.reportRejected());
        assertEquals(3, hanoiRhymer.getTotalRejected());

        hanoiRhymer.countIn(4);

        assertEquals(4, hanoiRhymer.reportRejected());
        assertEquals(4, hanoiRhymer.getTotalRejected());

        hanoiRhymer.countIn(1);

        assertEquals(4, hanoiRhymer.reportRejected());
        assertEquals(4, hanoiRhymer.getTotalRejected());
    }

}
