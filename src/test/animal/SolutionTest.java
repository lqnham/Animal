package test.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import main.animal.Animal;
import main.animal.Bird;

public class SolutionTest {
	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@Before
	public void init() {
		System.setOut(new PrintStream(out));
	}
	
	@Test
	public void test() {
		new Animal().walk();
		String a = out.toString();
		assertEquals(true, out.toString().contains("I am walking"));
		assertEquals(false, out.toString().contains("I am flying"));
		
		new Bird().walk();
		assertEquals(true, out.toString().contains("I am walking"));
		assertEquals(false, out.toString().contains("I am flying"));
		
		new Bird().fly();
		assertEquals(true, out.toString().contains("I am flying"));
		assertEquals(true, out.toString().contains("I am walking"));
		assertEquals(false, out.toString().contains("singggg"));
		
		new Bird().sing();
		assertEquals(true, out.toString().contains("I am flying"));
		assertEquals(true, out.toString().contains("I am walking"));
		assertEquals(true, out.toString().contains("singggg"));
	}
	
}
