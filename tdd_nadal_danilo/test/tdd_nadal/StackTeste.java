package tdd_nadal;

import org.junit.Assert;
import org.junit.Test;


public class StackTeste {
	@Test
	public void testInsertOnlyOneElement() {
		Integer value = 23;
		Stack<Integer> cut = new Stack<Integer>(1);
		cut.push(value);
		Assert.asserEquals(1, cut.size());
		Assert.assertFalse(cut.isEmpty());
		Assert.assertEquals(value, cut.top());
		
		}
	
	@Test
	public void testDeleteOnlyOneElement() {
		Integer value = 23;
		Stack<Integer> cut = new Stack<Integer>(1);
		cut.push(value);
		Assert.asserEquals(value, cut.pop());
		Assert.assertFalse(0, cut.size());
		Assert.assertEquals(value, cut.top());
		
		}
	
	@Test
	public void testInsertTwoElements() {
		Double value1 = 23.5;
		Double value2 = 23.54;
		Stack<Double> cut = new Stack<Double>(2);
		cut.push(value1);
		cut.push(value2);
		Assert.asserEquals(2, cut.size());
		Assert.assertFalse(cut.isEmpty());
		Assert.assertEquals(23.54, cut.top(), 0.01);
		
		}

	@Test
	public void testInsertThreeElementsInStackSizeEqualTwo() {
		Double value1 = 23.5;
		Double value2 = 23.54;
		Double value3 = 24.2;
		Stack<Double> cut = new Stack<Double>(2);
		try {
			cut.push(value1);
			cut.push(value2);
		} catch (Exception e) {
			Assert.fail();
		}
		
		Assert.assertThrows(StackFullException.class, () ->);
		Assert.asserEquals(2, cut.size());
		Assert.assertFalse(cut.isEmpty());
		Assert.assertEquals(23.54, cut.top(), 0.01);
		
		}
	
	@Test
	public void testDeleteOnlyOneElement() {
		Integer value = 23;
		Stack<Integer> cut = new Stack<Integer>(1);
		cut.push(value);
		Assert.asserEquals(value, cut.pop());
		Assert.assertFalse(0, cut.size());
		Assert.assertEquals(value, cut.top());
		Assert.assertThrows(StackEmptyException.class, () ->);
		
		}
	

}
