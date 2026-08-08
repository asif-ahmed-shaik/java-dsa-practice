/*public class practiceArrays {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for(int i = 0;i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
    
}*/

/*public class practiceArrays {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        int sum = 0;
        for(int i = 0;i < numbers.length;i++) {
            sum += numbers[i];
        }
        System.out.println("sum: "+ sum);
    }
}*/

/*public class practiceArrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,777,6,77};

        int largest = numbers[0];
        for(int i = 0;i < numbers.length;i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
    }

}*/

public class practiceArrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int max = 0;

        for(int i = 0;i < numbers.length;i++) {

            if (numbers[i] % 2 == 0){
                System.out.println("Even: " + max * numbers.length);

            }
        }
    }
}







