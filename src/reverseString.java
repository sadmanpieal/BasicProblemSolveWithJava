public class reverseString {
    public static void main(String[] args) {
        String s = "Automation";
        String p = " ";
        for (int a =0;a<s.length();a++){

            p = s.charAt(a)+p;
        }
        System.out.println(p);
        StringBuilder b = new StringBuilder(s).reverse();
        System.out.println(b);
    }
}