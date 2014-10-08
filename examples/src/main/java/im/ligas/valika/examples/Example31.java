package im.ligas.valika.examples;

import java.util.Random;

/**
 * Hello world!
 */
public class Example31 {

    public long naturalCount(long n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public long factorial(long n) {
        long result = n;
        for (long i = n - 1; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    public long wholePartOfSqrRoot(long randomNumber) {
        return (long) Math.sqrt(randomNumber);
    }

    public long digitCount(long randomNumber) {
        long result = 0;
        for (int j = 1; j > 0; j++) {
            result += (randomNumber % ((long) Math.pow(10, j))) / ((long) Math.pow(10, j - 1));
            if (Math.pow(10, j) > randomNumber) {
                break;
            }
        }
        return result;
    }


    public int countOfOnes(long randomNumber) {
        return 0;
    }

    public long reverseNumber(long randomNumber) {
        long result = 0;
        return result;
    }


    public String rcCheck(long rc) {
        String result = null;
        return result;
    }
}
