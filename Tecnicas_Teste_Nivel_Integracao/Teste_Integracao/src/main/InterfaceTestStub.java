package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class InterfaceTestStub {
    @Test
    public void testAdd() {
        Logic logicStub = mock(Logic.class);
        when(logicStub.add(2, 3)).thenReturn(5);

        Interface ui = new Interface(logicStub);
        int result = ui.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Logic logicStub = mock(Logic.class);
        when(logicStub.subtract(5, 3)).thenReturn(2);

        Interface ui = new Interface(logicStub);
        int result = ui.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        Logic logicStub = mock(Logic.class);
        when(logicStub.multiply(2, 3)).thenReturn(6);

        Interface ui = new Interface(logicStub);
        int result = ui.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        Logic logicStub = mock(Logic.class);
        when(logicStub.divide(6, 3)).thenReturn(2);

        Interface ui = new Interface(logicStub);
        int result = ui.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        Logic logicStub = mock(Logic.class);
        doThrow(new ArithmeticException("Cannot divide by zero")).when(logicStub).divide(6, 0);

        Interface ui = new Interface(logicStub);
        assertThrows(ArithmeticException.class, () -> ui.divide(6, 0));
    }
}
