import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void devuelve1enCadena(){
        FizzBuzz numCalcular = new FizzBuzz();
        numCalcular.pedirNum(1);
        assertEquals(1,numCalcular);
    }
    @Test
    void devuelve2enCadena(){
        FizzBuzz numCalcular = new FizzBuzz();
        numCalcular.pedirNum(2);
        assertEquals(2,numCalcular);
    }

}