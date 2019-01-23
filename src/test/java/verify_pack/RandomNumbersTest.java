package verify_pack;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.junit.Test;

import com.devskiller.calculator.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersTest {

	private Random random = new Random(System.currentTimeMillis());
	private Supplier<Integer> randomInt = () -> random.nextInt(999) + 1;

	//subject
	Calculator calculator = new Calculator();

	@Test
	public void shouldAddTwoRandomNumbers() {
		verifyThat(() -> {
			int a = randomInt.get();
			int b = randomInt.get();
			return calculator.add(a, b) == (a + b);
		});
	}


	@Test
	public void shouldSubtractTwoRandomNumbers() {
		verifyThat(() -> {
			int a = randomInt.get();
			int b = randomInt.get();
			return calculator.subtract(a, b) == (a - b);
		});
	}

	@Test
	public void shouldMultiplyTwoRandomNumbers() {
		//when
		verifyThat(() -> {
			int a = randomInt.get();
			int b = randomInt.get();
			return calculator.multiply(a, b) == (a * b);
		});
	}

	@Test
	public void shouldDivideTwoRandomNumbers() {
		verifyThat(() -> {
			int a = randomInt.get();
			int b = randomInt.get() * a;
			return calculator.divide(b, a) == (b / a);
		});
	}

	private static void verifyThat(final BooleanSupplier booleanSupplier) {
		boolean result = IntStream.rangeClosed(1, 100)
				.boxed()
				.allMatch(i -> booleanSupplier.getAsBoolean());
		assertThat(result).isTrue();
	}
}
