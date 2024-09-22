import java.util.Arrays;

public class initializingArray {
    public static void main(String[] args) {
        int [] ar ={10,1,2,3,4,5,6,7,8,9};
        System.out.println(ar.length);

        System.out.println( Arrays.toString(ar));
        for (int num :ar){
            System.out.println(num);
        }
        int [] ar2 = ar.clone();
        for (int x : ar2){
            System.out.println(x);
        }
        Arrays.sort(ar);
        System.out.println("sorted arrays are "+ar);
    }
}
