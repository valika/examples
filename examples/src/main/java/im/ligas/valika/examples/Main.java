package im.ligas.valika.examples;

import java.util.Random;

/**
 * Created by ligasm on 10/3/14.
 */
public class Main {
    private static int MAX_RANDOM_N = 10000;

    public static void main(String[] args) {
        Random random = new Random();
        long randomNumber = random.nextInt(MAX_RANDOM_N);

        Example31 e31 = new Example31();
        System.out.println("Sucet prvych " + randomNumber + " prirodzenych cisiel: " + e31.naturalCount(randomNumber));
        System.out.println("Factorial z " + 10 + ": " + e31.factorial(10));
        System.out.println("Cela cast odmocniny z cisla " + randomNumber + ": " + e31.wholePartOfSqrRoot(randomNumber));
        System.out.println("Ciferny sucet cisla " + randomNumber + ": " + e31.digitCount(randomNumber));
        System.out.println("Pocet 1 v cisle " + randomNumber + ": " + e31.countOfOnes(randomNumber));
        System.out.println("Cislo " + randomNumber + " zapisane naopak: " + e31.reverseNumber(randomNumber));
        long rc = 8409257607L;
        System.out.println("Je " + rc + " platne rodne cislo : " + e31.rcCheck(rc));
    }
}
