package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int minusOne = -1;
    private static final int eleven = 11;
    private static final int numLength = 12;
    private int[] NUMBERS = new int[numLength];

    public int getTotal() {
        return total;
    }


    public int total = minusOne;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        protected boolean callCheck() {
            return total == minusOne;
        }
        
            public boolean isFull() {
                return total == eleven;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return minusOne;
                    return NUMBERS[total];
                }
            
                    protected int countOut() {
                        if (callCheck())
                            return minusOne;
                        return NUMBERS[total--];
                    }

}
