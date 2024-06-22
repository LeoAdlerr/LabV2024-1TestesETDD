package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InterfaceTest {
	
    @Test
    public void testAdd() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);
        int result = ui.add(2, 3);
        assertEquals(5, result);
        assertEquals(1, data.getResults().size());
        assertEquals(5, data.getResults().get(0));
    }

    @Test
    public void testSubtract() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);
        int result = ui.subtract(5, 3);
        assertEquals(2, result);
        assertEquals(1, data.getResults().size());
        assertEquals(2, data.getResults().get(0));
    }

    @Test
    public void testMultiply() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);
        int result = ui.multiply(2, 3);
        assertEquals(6, result);
        assertEquals(1, data.getResults().size());
        assertEquals(6, data.getResults().get(0));
    }

    @Test
    public void testDivide() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);
        int result = ui.divide(6, 3);
        assertEquals(2, result);
        assertEquals(1, data.getResults().size());
        assertEquals(2, data.getResults().get(0));
    }

    @Test
    public void testDivideByZero() {
        Data data = new Data();
        Logic logic = new Logic(data);
        Interface ui = new Interface(logic);
        assertThrows(ArithmeticException.class, () -> ui.divide(6, 0));
    }
}
