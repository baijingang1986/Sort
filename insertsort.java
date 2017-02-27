public class insertsort {
    public static void insertSort(int[] a) {
        int temp = 0, j = 0;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            for (j = i - 1; j >= 0 && temp < a[j]; j--)
                a[j + 1] = a[j];
            a[j + 1] = temp;
        }
    }
    public static void a(int[] a){
        int temp = 0,j=0;
        
        for(int i =0; i < a.length; i++){
            temp = a[i];
            for(j = i-1;j>=0 && temp<a[j];j--){
                a[j + 1] = a[j];
            }
            a[j+1] = temp;
        }
    }
    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertSort(a);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
