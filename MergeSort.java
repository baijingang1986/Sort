import javax.swing.JInternalFrame;
import javax.xml.transform.Templates;

public class MergeSort {
    public static void mergeArray(int[] a, int first, int mid, int last) {
        int[] c = new int[a.length];
        int j = mid + 1;
        int k = first;
        int tmp = first;
        while (first <= mid && j <= last) {
            if (a[first] <= a[j])
                c[k++] = a[first++];
            else
                c[k++] = a[j++];
        }
        while (first <= mid)
            c[k++] = a[first++];
        
        while (j <= last)
            c[k++] = a[j++];

        while (tmp <= last) {  
            a[tmp] = c[tmp++];  
        } 
    }
    public static void merge(int[] a,int first, int mid, int last){
        int[] c = new int[a.length];
        int j = mid + 1;
        int k = first;
        int temp = first;
        while(first <= mid && j <= last){
            if(a[first]<= a[j]){
                c[k++] = a[first++];
            }else{
                c[k++] = a[j++];
            }
        }
        while(first <= mid){
            c[k++] = a[first++];
        }
        while(j <= last){
            c[k++] = a[j++];
        }
        while(temp <= last){
            a[temp] = c[temp++];
        }
    }
    public static void mergeSortFunction(int[] a, int first, int last) {
        int mid = (last + first) / 2;
        if (first < last) {
            mergeSortFunction(a, first, mid);
            mergeSortFunction(a, mid + 1, last);
            merge(a, first, mid, last);
        }
    }

    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        mergeSortFunction(a, 0, a.length - 1);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
