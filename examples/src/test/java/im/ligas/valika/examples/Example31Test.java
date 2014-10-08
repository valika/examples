package im.ligas.valika.examples;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Example31Test {

    private Example31 ex31;

    @Before
    public void setUp() throws Exception {
        ex31 = new Example31();

    }

    @org.junit.Test
    public void testNaturalCount() throws Exception {
            assertThat(ex31.naturalCount(0), is(0l));
            assertThat(ex31.naturalCount(1), is(1l));
            assertThat(ex31.naturalCount(5), is(15l));
    }

    @org.junit.Test
    public void testFactorial() throws Exception {
        assertThat(ex31.factorial(0), is(1l));
        assertThat(ex31.factorial(1), is(1l));
        assertThat(ex31.factorial(2), is(2l));
        assertThat(ex31.factorial(5), is(120l));

    }

    @org.junit.Test
    public void testWholePartOfSqrRoot() throws Exception {
        assertThat(ex31.wholePartOfSqrRoot(0), is(1l));
        assertThat(ex31.wholePartOfSqrRoot(1), is(1l));
        assertThat(ex31.wholePartOfSqrRoot(4), is(2l));
        assertThat(ex31.wholePartOfSqrRoot(5), is(2l));
        assertThat(ex31.wholePartOfSqrRoot(9), is(3l));
    }

    @org.junit.Test
    public void testDigitCount() throws Exception {
        assertThat(ex31.digitCount(0), is(0l));
        assertThat(ex31.digitCount(1), is(1l));
        assertThat(ex31.digitCount(12), is(3l));
        assertThat(ex31.digitCount(123), is(6l));
        assertThat(ex31.digitCount(93), is(12l));
    }

    @org.junit.Test
    public void testCountOfOnes() throws Exception {
        assertThat(ex31.countOfOnes(0l), is(0));
        assertThat(ex31.countOfOnes(101l), is(2));
        assertThat(ex31.countOfOnes(4231042344l), is(1));
        assertThat(ex31.countOfOnes(4235042344l), is(0));
        assertThat(ex31.countOfOnes(1111111111l), is(10));
    }

    @org.junit.Test
    public void testReverseNumber() throws Exception {
        assertThat(ex31.reverseNumber(0l), is(0l));
        assertThat(ex31.reverseNumber(100l), is(1l));
        assertThat(ex31.reverseNumber(111l), is(111l));
        assertThat(ex31.reverseNumber(123l), is(321l));

    }

    @org.junit.Test
    public void testRcCheck() throws Exception {
    }
}