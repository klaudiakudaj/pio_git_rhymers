package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int minusOne = -1;
    public static final int eleven = 11;
    public static final int numLength = 12;
    private int[] NUMBERS = new int[numLength];

    public int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
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
            
                    public int countOut() {
                        if (callCheck())
                            return minusOne;
                        return NUMBERS[total--];
                    }

}
