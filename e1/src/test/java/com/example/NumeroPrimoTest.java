package com.example;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

class NumeroPrimoTest {
    @Test
    void NumeroNegativo(){
        NumeroPrimo p= new NumeroPrimo();

        Exception exception = assertThrows(Exception.class,()->{
            p.esPrimo(-1);
        });
        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
}
@Test
void Cero() throws Exception{
    NumeroPrimo p = new NumeroPrimo();
    assertFalse(p.esPrimo(0));
}
@Test
void Uno() throws Exception{
    NumeroPrimo p = new NumeroPrimo();
    assertFalse(p.esPrimo(1));
}
@Test
void Dos() throws Exception{
    NumeroPrimo p = new NumeroPrimo();
    assertTrue(p.esPrimo(2));
}
    @Test
    void Numeromayorque2() throws Exception{
        NumeroPrimo p = new NumeroPrimo();
        assertTrue(p.esPrimo(17));
        assertFalse(p.esPrimo(8));
    }
    @Test
    void NumeroInteger() throws Exception{
        NumeroPrimo p = new NumeroPrimo();
        Exception exception= assertThrows(Exception.class,()-> {
                    p.esPrimo(Integer.MIN_VALUE);
                });
            assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
            assertTrue(p.esPrimo(Integer.MAX_VALUE));
    }}