public class numberOfEven {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14 ,15,16,17,18};
        int count =0;
        for (int i = 0; i <a.length; i++) {
            if (a[i] % 2==0){
                count++;
            }

        }
        System.out.println("The even number are:"+ count);
    }
}
