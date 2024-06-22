package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataTest {
	
    @Test
    public void testSave() {
        Data data = new Data();
        data.save(10);
        assertEquals(1, data.getResults().size());
        assertEquals(10, data.getResults().get(0));
    }
}
