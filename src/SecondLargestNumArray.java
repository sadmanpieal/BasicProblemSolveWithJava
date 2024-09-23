public class SecondLargestNumArray {
    public static void main(String[] args) {
        int [] a= {1,2,4,5,6,7,8,9,10};
        int largest =Integer.MIN_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        for (int num: a){
            if (num>largest){
                secondlargest =largest;
                largest =num;
            }
            else if (num> secondlargest && num != largest) {
                secondlargest =num;

            }

        }
        System.out.println("Second largest number is" + secondlargest);
    }
}
