public class RandomPractise {
    public static void main(String[] args) {
        int []a ={9,8,7,5,3,1,3};
        int largest =Integer.MIN_VALUE;
        int secondlargest =Integer.MIN_VALUE;
        int thirdlargest =Integer.MIN_VALUE;
        for (int num :a){
            if(num>largest){
                thirdlargest= secondlargest;
                secondlargest=largest;
                largest=num;
            } else if (num > secondlargest && num !=largest) {
                thirdlargest = secondlargest;
                secondlargest= num;
            } else if (num>thirdlargest&& num !=secondlargest && num!=largest) {
                thirdlargest=num;
                
            }
        }
        System.out.println("second largest"+ secondlargest);
        System.out.println("third largest"+thirdlargest);
    }
}
