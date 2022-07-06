import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestLifeCycle {
	private List<String> cart;
	
	@BeforeAll
	public static void setup() {
		System.out.println("setup Before all test cases");
	}
	
	
	@AfterAll
	public static void teardown() {
		System.out.println("After all test cases");
	}
		
	@BeforeEach
	public void setupEach() {
		cart=new ArrayList<String>();
		System.out.println("Before Each test case");
	}
	
	@AfterEach
	public void teardownEach() {
		cart = null;
		System.out.println("After each test case");
		
	}
	@Test
	public void testingEmptyCart() {
		System.out.println("testing empty cart... ");
		assertTrue(cart.isEmpty());
	}
	@Test
	public void testOneItem() {
		cart.add("Apple");
		System.out.println("testing one-item cart");
		assertEquals(1, cart.size());
	}
}
