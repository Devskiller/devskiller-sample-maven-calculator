package verify_pack;

import org.junit.Test;

import com.devskiller.calculator.Calculator;

import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

public class IllegalArgumentsTest {

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionForDivisionByZero() {
		//given
		Calculator calculator = new Calculator();

		//when
		calculator.divide(10, 0);

		//then
		failBecauseExceptionWasNotThrown(RuntimeException.class);
	}

}
