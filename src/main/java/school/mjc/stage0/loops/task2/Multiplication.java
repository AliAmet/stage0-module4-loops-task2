package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        int sum = 1;
        if (multiplyByAndToInclusive > 0) {
            while (number <= multiplyByAndToInclusive) {
                sum = sum * number;
                System.out.println(sum);
                number++;
            }
        } else {
            while (number >= multiplyByAndToInclusive) {
                sum = sum * number;
                System.out.println(sum);
                number--;
            }
        }
    }
}
