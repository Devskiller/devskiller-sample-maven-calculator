package verify_pack;

import com.devskiller.calculator.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

public class IllegalArgumentsTest {

	@Test(expected = RuntimeException.class)
	public void shouldThrowExceptionForDivisionByZero() {
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.divide(10, 0);

		//then
		failBecauseExceptionWasNotThrown(RuntimeException.class);
	}

}
