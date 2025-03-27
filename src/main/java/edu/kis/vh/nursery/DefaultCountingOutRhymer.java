package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = 12;
    private static final int INT1 = -1;

    private static final int RET_PEEK = -1;
    private static final int RET_COUNT = -1;
    private static final int STACKEND = 11;

    private int[] numbers = new int[INT];

    private int total = INT1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == STACKEND;
    }

    protected int peekaboo() {
        if (callCheck())
            return RET_PEEK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RET_COUNT;
        return numbers[total--];
    }

}
