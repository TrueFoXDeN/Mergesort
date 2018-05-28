public class Main {

    public static void main(String[] args) {

        int[] E = {9, 0, 6, 2, 5, 1, 4, 8};

        Mergesort m = new Mergesort();
        // m.mergesort(E,0,E.length-1);

        Mergesort2 m2 = new Mergesort2();
        m2.MergeSort_Recursive(E, 0, E.length - 1);
        System.out.println("Finished");
    }
}
