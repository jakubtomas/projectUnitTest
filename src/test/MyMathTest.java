package test;

import com.company.Information;
import com.company.MyMath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath myMath;
    private Information Information;

    @BeforeEach
    void setUp() {
        myMath = new MyMath();
       // Information = new Information();
    }
//  testovat connection test
    // čo ked sme zabudli disconection   vygenerovat nahodny string

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPrimeNumber() {
        assertTrue(myMath.isPrimeNumber(47));
        assertTrue(myMath.isPrimeNumber(61));
        assertTrue(myMath.isPrimeNumber(67));
        assertFalse(myMath.isPrimeNumber(48));
        assertFalse(myMath.isPrimeNumber(50));
        assertFalse(myMath.isPrimeNumber(55));
        assertFalse(myMath.isPrimeNumber(8));
        assertFalse(myMath.isPrimeNumber(99));
        assertFalse(myMath.isPrimeNumber(4));
        assertFalse(myMath.isPrimeNumber(9));
        assertFalse(myMath.isPrimeNumber(1));
    }

    @Test
    void min() {


        int[] array;
        assertEquals(4, myMath.min(  array = new int[]{4, 5, 6, 7, 8, 9, 10, 444,}));
        assertEquals(-444, myMath.min(  array = new int[]{4, 5, 6, 7, 8, 9, 10, -444,}));
        assertEquals(1, myMath.min(  array = new int[]{4, 5, 6, 1, 8, 9, 10, 444,}));

    }

    @Test
    void existTriangle() {
        assertTrue(myMath.existTriangle(2,3,2));
        assertTrue(myMath.existTriangle(6,6,6));
        assertTrue(myMath.existTriangle(7,8,5));
       // assertTrue(myMath.existTriangle(-8,-4,-3));
        assertFalse(myMath.existTriangle(1,2,1));
        assertFalse(myMath.existTriangle(2,2,5));
        assertFalse(myMath.existTriangle(0,0,0));
        assertFalse(myMath.existTriangle(0,4,8));
        assertFalse(myMath.existTriangle(-6,2,8));


    }
}