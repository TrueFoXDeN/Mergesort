public class Mergesort {

    public void mergesort(int E[], int left, int right) {
        if (left < right) {



            int mid = (left + right) / 2;
            mergesort(E, left, mid);
            mergesort(E, mid + 1, right);
            merge(E, left, mid, right);

        }
    }

    void merge(int E[], int left, int mid, int right) {
        int a = left, b = mid + 1;
        int Eold[] = E;

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
    }

}
