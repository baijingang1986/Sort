public class QuickSort {
    public static void quicksort(int a[], int l, int r) {
        if (l < r) {
            int i = l, j = r, x = a[l];
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && a[j] >= x)
                    j--;

                if (i < j)
                    a[i++] = a[j];

                // 从左向右找第一个大于等于x的数
                while (i < j && a[i] < x)
                    i++;

                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            quicksort(a, l, i - 1); // 递归调用
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
