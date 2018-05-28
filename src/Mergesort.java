public class Mergesort {

    public int[] mergesort(int E[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            E = mergesort(E, left, mid);
            E = mergesort(E, mid + 1, right);
            E = merge(E, left, mid, right);

            for (int t:E) {
                System.out.print(t + " ");
            }
            System.out.println();
        }

        return E;
    }



    int [] merge(int E[], int left, int mid, int right) {
        int a = left, b = mid + 1;

        int[] Eold = new int[E.length];
        for (int i = 0; i < E.length; i++)
        {
            Eold[i] = E[i];
        }

        for (; left <= right; left++) {
            if (a > mid) {
                E[left] = Eold[b];
                b++;
            } else if (b > right || Eold[a] <= Eold[b]) {
                E[left] = Eold[a];
                a++;
            } else {
                E[left] = Eold[b];
                b++;
            }
        }
        return E;
    }

}
