public class duisort {
//    public static void heapify(int[] a, int i, int j) {
//        int k = 2 * i + 1; // k ��i������
//        int x = a[i]; // ��x������a[i] ���ڿճ���λ�� �ô��������
//        while (k <= j) { // ѭ���ж� ���� Ҳ����i����Ҷ��
//            if (k < j) { // ������Һ��� ����k<j
//                if (a[k] < a[k + 1])
//                    k = k + 1;// if�ж����Һ���˭���� ����ұߴ� ��kָ���ұ� ���kһֱָ�������Ǹ����� Ҳ���Ǵ����
//            }
//            if (x >= a[k]) // �����Ԫ���Ѿ����ڵ��ڴ������ ��ʱ��ѵ������� ѭ����ֹ
//                break;
//            else {
//                a[i] = a[k];// ����Ļ� �ô����ռ�ݸ�Ԫ�� λ������
//                i = k;// ��ʱ�� ԭ���ĸ�Ԫ��ָ��֮ǰ����ӵ�λ��
//                k = 2 * i + 1;// �ٴ���k��Ϊi������ ������һ�� �ѵ���
//            }
//        }
//        a[i] = x;// �����ԭʼ�ĸ�Ԫ�ط���ײ�
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
            if (x >= a[k]) // �����Ԫ���Ѿ����ڵ��ڴ������ ��ʱ��ѵ������� ѭ����ֹ
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
        for (int i = (n - 1) / 2; i >= 0; i--) {// ���ǵ����Һ��ӵ�ֵ��i���ܳ���һ�� Ҳ����Ϊ0 ѭ�������� // ����ʼ����
            System.out.println(i + " " + n);
            heapify(a, i, n);
        }
        for (int i = n; i > 0; i--) {// ѭ������Ԫ�غ����һƬҶ�ӽ���
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, 0, i - 1);// ���³�ʼ���� ��0��i-1
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