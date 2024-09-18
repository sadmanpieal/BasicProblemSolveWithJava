public class MissingNumInArray {
    public static void main(String[] args) {
        int a[]= {2,3,4,5,6,7,8,9,10};
        int len= a.length+1;
        int arraysum=0;
        int totalsum = len* (len+1)/2;
        for (int i = 0; i <a.length; i++) {
            arraysum +=a[i];

        }
        int missingNum= totalsum-arraysum;
        System.out.println("the missing num is:"+ missingNum);
    }
}
