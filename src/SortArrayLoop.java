public class SortArrayLoop {
    public static void main(String[] args) {
        int [] a={2,1,4,3,5,6,9,8,7};
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        for(int num : a){
            System.out.print(num+" ");
        }
    }
}
