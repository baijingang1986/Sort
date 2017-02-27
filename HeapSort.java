public class HeapSort {
//    public static void heapify(int[] a, int i, int j) {
//        int k = 2 * i + 1; // k 是i的左孩子
//        int x = a[i]; // 用x来保存a[i] 便于空出根位置 让大儿子上升
//        while (k <= j) { // 循环判断 条件 也就是i不是叶子
//            if (k < j) { // 如果有右孩子 所以k<j
//                if (a[k] < a[k + 1])
//                    k = k + 1;// if判断左右孩子谁更大 如果右边大 让k指向右边 因此k一直指向最大的那个孩子 也就是大儿子
//            }
//            if (x >= a[k]) // 如果根元素已经大于等于大儿子了 这时候堆调整结束 循环终止
//                break;
//            else {
//                a[i] = a[k];// 否则的话 让大儿子占据根元素 位置上升
//                i = k;// 这时候 原来的根元素指向之前大儿子的位置
//                k = 2 * i + 1;// 再次让k成为i的左孩子 进行下一次 堆调整
//            }
//        }
//        a[i] = x;// 最后将最原始的根元素放入底部
//    }
    public static void heapify(int[] a, int i, int j){
        int k = 2 * i+1;
        int x = a[i];
        while(k <= j){
            if(k < j){
                if(a[k] < a[k+1]){
                    k = k+1;
                }
            }
            if (x >= a[k]) // 如果根元素已经大于等于大儿子了 这时候堆调整结束 循环终止
                break;
            else {
                a[i] = a[k];
                i = k;
                k = 2*i+1;
            }
        }
        a[i] = x;
    }
    public static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {// 考虑到左右孩子的值，i不能超过一半 也不能为0 循环调整堆 // 即初始化堆
            System.out.println(i + " " + n);
            heapify(a, i, n);
        }
        for (int i = n; i > 0; i--) {// 循环将根元素和最后一片叶子交换
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, 0, i - 1);// 重新初始化堆 从0到i-1
        }
    }

    public static void heap(int[] a,int n){
        for(int i =(n-1)/2;i>=0;i--){
            heapify(a, i, n);
        }
        for(int i = n;i>0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, 0, i-1);
        }
    }
    public static void main(String args[]) {
        int[] a = {100, 56, 48, 5, 67, 8, 10, 40, 90, 30, 1};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        heap(a, a.length - 1);
        
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
