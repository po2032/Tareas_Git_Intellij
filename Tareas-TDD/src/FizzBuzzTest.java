import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void TesteoNum1(){
        FizzBuzz numCalcular = new FizzBuzz();
        String numACalcular = numCalcular.pedirNum(1);
        assertEquals("1",numACalcular);
    }
    @Test
    void TesteoNum2(){
        FizzBuzz numCalcular = new FizzBuzz();
        String numACalcular = numCalcular.pedirNum(2);
        assertEquals("2",numACalcular);
    }
    @Test
    void TesteoNum3(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(3);
        assertEquals("Fizz",numACalcular);
    }
}