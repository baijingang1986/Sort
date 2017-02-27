public class xuanzesort {
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
            minIndex = i;//����������С���������±�
            for(int j = i+1; j < a.length; j++)
            {
                //�����������ҵ���С���ݲ������������±�
                if(a[j] < a[minIndex])
                {
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                //�����������������Сֵλ�ò���Ĭ�ϵĵ�һ�����ݣ��򽻻�֮��
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
