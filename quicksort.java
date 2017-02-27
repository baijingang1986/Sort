public class quicksort {
    public static void quicksort(int a[], int l, int r) {
        if (l < r) {
            int i = l, j = r, x = a[l];
            while (i < j) {
                // ���������ҵ�һ��С��x����
                while (i < j && a[j] >= x)
                    j--;

                if (i < j)
                    a[i++] = a[j];

                // ���������ҵ�һ�����ڵ���x����
                while (i < j && a[i] < x)
                    i++;

                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            quicksort(a, l, i - 1); // �ݹ����
            quicksort(a, i + 1, r);
        }
    }

    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        quicksort(a, 0, a.length - 1);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
