package result;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import problem02.BaseService;
import problem02.MyService;
import problem03.MyStack;

public class TestResult {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testProblem01() {
		problem01.Main.randomNumber = 11;
		
		assertEquals(false, problem01.Main.checkAnswer(20));
		assertEquals(1, problem01.Main.min);
		assertEquals(20, problem01.Main.max);

		assertEquals(false, problem01.Main.checkAnswer(10));
		assertEquals(10, problem01.Main.min);
		assertEquals(20, problem01.Main.max);

		assertEquals(false, problem01.Main.checkAnswer(16));
		assertEquals(10, problem01.Main.min);
		assertEquals(16, problem01.Main.max);

		assertEquals(false, problem01.Main.checkAnswer(13));
		assertEquals(10, problem01.Main.min);
		assertEquals(13, problem01.Main.max);

		assertEquals(true, problem01.Main.checkAnswer(11));
		assertEquals(5, problem01.Main.count);
	}
	
	@Test
	public void testProblem02() {
		problem02.Main.main(null);
		assertEquals("낮서비스시작오후서비스시작밤서비스시작", systemOutRule.getLog().replaceAll("(\\r|\\n|\\r\\n)+", ""));

		BaseService service = new MyService();
		assertEquals("낮서비스시작", service.day());
		assertEquals("밤서비스시작", service.night());
		assertEquals("오후서비스시작", ((MyService)service).afternoon());
	}
	
	@Test
	public void testProblem03() {
		MyStack stack = new MyStack(3);
	
		stack.push("Hello");
		assertEquals(1, stack.size());
		
		stack.push("World");
		assertEquals(2, stack.size());
		
		stack.push("!!!");
		assertEquals(3, stack.size());
		
		stack.push("java");
		assertEquals(4, stack.size());

		stack.push(".");
		assertEquals(5, stack.size());

		assertEquals(".", stack.pop());
		assertEquals("java", stack.pop());
		assertEquals("!!!", stack.pop());
		assertEquals("World", stack.pop());
		assertEquals("Hello", stack.pop());


		stack = new MyStack(3);

		stack.push("Hello");
		assertEquals(1, stack.size());

		assertEquals("Hello", stack.pop());
		assertEquals(null, stack.pop());
	}
}