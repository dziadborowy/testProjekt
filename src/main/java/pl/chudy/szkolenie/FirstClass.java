package pl.chudy.szkolenie;

import java.util.Random;

/**
 * Created by adam.chudeusz on 19.10.2016.
 */
public class FirstClass {

    private int size = 47;
    private boolean[] usedArray = new boolean[size];

    public void drawSixNumbers() {
        for (int i = 0; i < 6; i++) {
            int random;

            do {
                random = returnInt();
            } while (numberAlreadyGenerated(random));

            setNumberAsUsed(random);
            System.out.println(random);

        }
    }

    private int returnInt() {

        Random generator = new Random();
        return generator.nextInt(size) + 1;
    }

    private boolean numberAlreadyGenerated(int number) {
        boolean temp = usedArray[number - 1];
        return temp;
    }

    private void setNumberAsUsed(int number) {
        usedArray[number - 1] = true;
        System.out.println("Number " + number + " already used");
    }

    
    public static void main(String[] args) {
        FirstClass lotto = new FirstClass();
        lotto.drawSixNumbers();

    }

}
