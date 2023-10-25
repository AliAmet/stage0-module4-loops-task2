package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive){
            int count = 2;
            int sum =0;
            while (count <= number){
                if (number % count == 0){
                    sum++;
                }
                count++;
            }
            if (sum == 1)
                System.out.println(number);
            number++;
        }
    }

}
