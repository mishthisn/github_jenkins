package unix_parse_files;

// https://automationrhapsody.com/data-driven-testing-junit-parameterized-tests/
// https://stackoverflow.com/questions/19203730/writing-java-tests-with-data-providers

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	
	private String expr;
	private int expectedResult;
	
	public CalculatorTest(String expr, int result) {
		this.expr = expr;
		this.expectedResult = result;
	}
	
	@Parameters
    public static Iterable<Object[]> data() {
	    return Arrays.asList(new Object[][] {
	        {"1 + 1", 2},
	        {"2 + 2", 4},
	        {"3 + 3", 6},
	    });
    }

	@Test
	public void test() {
		int actualResult = calculator_BASIC.evaluate(this.expr);
		assertEquals(this.expectedResult, actualResult);
	}
}
