package br.edu.fatec.sjc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberAscOrderTest {
    @Test
    public void testSortWithNumbersInStack() throws StackEmptyException {
        CustomStack<Number> customStackMock = mock(CustomStack.class);
        when(customStackMock.isEmpty()).thenReturn(false);
        when(customStackMock.pop()).thenReturn(10, 20, 30, 40, 50, 60);

        NumberAscOrder numberAscOrder = new NumberAscOrder(customStackMock);
        List<Integer> sortedNumbers = numberAscOrder.sort();

        assertEquals(6, sortedNumbers.size());
        assertEquals(10, (int) sortedNumbers.get(0));
        assertEquals(20, (int) sortedNumbers.get(1));
        assertEquals(30, (int) sortedNumbers.get(2));
        assertEquals(40, (int) sortedNumbers.get(3));
        assertEquals(50, (int) sortedNumbers.get(4));
        assertEquals(60, (int) sortedNumbers.get(5));
    }

    @Test
    public void testSortWithEmptyStack() throws StackEmptyException {
        CustomStack<Number> customStackMock = mock(CustomStack.class);
        when(customStackMock.isEmpty()).thenReturn(true);

        NumberAscOrder numberAscOrder = new NumberAscOrder(customStackMock);
        List<Integer> sortedNumbers = numberAscOrder.sort();

        assertTrue(sortedNumbers.isEmpty());
    }
}