public class AddingTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9,10};
        int[] r = new int[5];
        if (a.length!=b.length){
            System.out.println("array size should be same");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            r[i] = a[i] + b[i];
        }
        for (int num : r) {
            System.out.println(num);
        }
    }
}
