public class SelectSort {
    public static void selectSort(int[] a) {
        int index, temp;
        for (int i = a.length - 1; i >= 0; i--) {
            index = 0;
            for (int j = 1; j <= i; j++) {
                if (a[j] > a[index]) {
                    index = j;
                }
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
    public static void selectSort1(int[]a)
    {
        int minIndex=0;
        int temp=0;
        if((a==null) || (a.length==0))
            return;
        for(int i = 0; i < a.length-1; i++)
        {
            minIndex = i;//无序区的最小数据数组下标
            for(int j = i+1; j < a.length; j++)
            {
                //在无序区中找到最小数据并保存其数组下标
                if(a[j] < a[minIndex])
                {
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
    public static void xuan(int[] a){
        int index = 0;
        for(int i =0;i<a.length;i++){
            index = i;
            for(int j = i;j<a.length;j++){
                if(a[j] < a[index]){
                    index = j;
                }
            }
            if(index != i){
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int[] a = { 100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        xuan(a);

        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
