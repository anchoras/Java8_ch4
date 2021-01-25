/*
    demo program demonstrates finilize and constractor basics
*/

class FDemo {
    long x;

    FDemo(long i) {
        x = i;
    }

    protected void finilize() {
        System.out.println("Finilisation " + x);
    }

    void generator(long i) {
        FDemo o = new FDemo(i);
    }
}

class FinilizeDemo {
    public static void main(String args[]) {
        long count1, count2, count3;

        FDemo ob = new FDemo(0);

        for(count1=1; count1<1000000000; count1++) {
            ob.generator(count1);
        }
    }
}