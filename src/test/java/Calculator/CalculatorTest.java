package Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
    @org.junit.Test
    public void run() throws Exception {
        Calculator calculator=new Calculator();
        assertEquals(0, calculator.run("C"));
        assertEquals(25534, calculator.run("C25534"));
        assertEquals(5, calculator.run("C2+3="));
        assertEquals(255, calculator.run("C222+33="));
        assertEquals(30, calculator.run("C35-5="));
        assertEquals(8, calculator.run("C2+2*2="));
        assertEquals(777, calculator.run("C123+654="));
        assertEquals(4, calculator.run("C2+="));
        assertEquals(25, calculator.run("C125-100="));
        assertEquals(5, calculator.run("C100/20="));
        assertEquals(42, calculator.run("C6*7="));
        assertEquals(49, calculator.run("C7*="));
        assertEquals(2025, calculator.run("C45*45="));
        assertEquals(737, calculator.run("C11*67="));
        assertEquals(57, calculator.run("C45-7*3/2="));
        assertEquals(1, calculator.run("C9/5="));
        assertEquals(0, calculator.run("C0*23452="));
        assertEquals(0, calculator.run("C23453*0="));
        assertEquals(50, calculator.run("C45+-*/*-+5="));
        assertEquals(0, calculator.run("C345342*000="));
        assertEquals(235, calculator.run("C235="));
        assertEquals(2, calculator.run("C-1+3="));
        assertEquals(-2, calculator.run("C1-3="));
        assertEquals(-5, calculator.run("C-2-3="));
        assertEquals(30, calculator.run("C5+15=C30="));
        assertEquals(45, calculator.run("C5+15=30="));
    }

}