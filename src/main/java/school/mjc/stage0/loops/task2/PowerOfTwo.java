package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        int sum = 1;
        if (power < 0)
            System.out.println("too much power");
        else if (power == 0)
            System.out.println(1);
        else {
            while (count < power){
                sum *= 2;
                count++;
            }
            System.out.println(sum);
        }
    }

}
