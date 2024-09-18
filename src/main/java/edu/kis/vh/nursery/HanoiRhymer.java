package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

   private int totalRejected = 0;
/**
     * Zwraca łączną liczbę odrzuconych liczb.
     *
     * @return łączna liczba odrzuconych liczb.
     */
    public int reportRejected() {
        return totalRejected;
    }
/**
     * Dodaje podaną liczbę. Jeśli liczba jest większa niż liczba obecnie na szczycie stosu
     * i stos nie jest pusty, liczba zostaje odrzucona, a licznik odrzuceń jest zwiększany.
     * W przeciwnym razie liczba jest dodawana do stosu.
     *
     * @param in liczba do dodania.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
      }
}
