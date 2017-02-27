public class maopaosort {
    public static void bubbleSort(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void mao(int[] a){
        for(int i = a.length-1; i>=0; i--){
            for(int j = a.length-2; j >= a.length-i-1; j--){
                if(a[j+1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        mao(a);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
