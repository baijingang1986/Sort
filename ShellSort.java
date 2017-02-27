public class ShellSort {
    public static void shellSort(int[] a) {
        int d = a.length;
        int temp = 0;
        while (d != 0) {
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    temp = a[i];
                    int j = 0;
                    for (j = i - d; j >= 0 && temp <= a[j]; j -= d)
                        a[j + d] = a[j];
                    a[j + d] = temp;
                }
            }
        }
    }
    public static void shellSort1(int[] data) {
        // 计算出最大的h值
        int h = 1;
        while (h <= data.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i - h]) {
                    int tmp = data[i];
                    int j = i - h;
                    while (j >= 0 && data[j] > tmp) {
                        data[j + h] = data[j];
                        j -= h;
                    }
                    data[j + h] = tmp;
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }
    }
    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        shellSort1(a);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
