package im.ligas.valika.examples;

import java.util.Random;

/**
 * Hello world!
 */
public class Example31 {

    private static int MAX_RANDOM_N = 1000000;

    public static void main(String[] args) {
        Random random = new Random();
        long randomNumber = random.nextInt(MAX_RANDOM_N);

        System.out.println("Sucet prvych " + randomNumber + " prvkov: " + naturalCount(randomNumber));
        System.out.println("Factorial z " + randomNumber + ": " + factorial(randomNumber));
        System.out.println("Cela cast odmocniny z cisla " + randomNumber + ": " + wholePartOfPower(randomNumber));
        System.out.println("Ciferny sucet cisla " + randomNumber + ": " + digitCount(randomNumber));
        System.out.println("Pocet 1 v cisle " + randomNumber + ": " + countOfOnes(randomNumber));
        System.out.println("Cislo " + randomNumber + " zapisane naopak: " + reverseNumber(randomNumber));
        long rc = 8409257607L;
        System.out.println("Je " + rc + "platne rodne cislo : " + rcCheck(rc));
    }

    private static long naturalCount(long n) {
        //if(n>0 && )
        return 0;
    }

    private static long factorial(long n) {

        return 0;
    }

    private static long wholePartOfPower(long randomNumber) {
        return 0;
    }

    private static long digitCount(long randomNumber) {
        long result = 0;
        return result;
    }


    private static int countOfOnes(long randomNumber) {
        return 0;
    }

    private static long reverseNumber(long randomNumber) {
        long result = 0;
        return result;
    }


    private static String rcCheck(long rc) {
        String result = null;
        return result;
    }
}
