package verify_pack;

import com.devskiller.calculator.Calculator;
import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersTest {

	Random random = new Random(System.currentTimeMillis());

	@Test
	public void shouldAddTwoRandomNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.add(a,b);

		//then
		assertThat(result).isEqualTo(a+b);
	}

	@Test
	public void shouldSubtractTwoRandomNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.subtract(a,b);

		//then
		assertThat(result).isEqualTo(a-b);
	}

	@Test
	public void shouldMultiplyTwoRandomNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int result = calculator.multiply(a,b);

		//then
		assertThat(result).isEqualTo(a*b);
	}

	@Test
	public void shouldDivideTwoRandomNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int a = random.nextInt(100)+1;
		int b = (random.nextInt(100)+1) * a;
		int result = calculator.divide(b,a);

		//then
		assertThat(result).isEqualTo(b/a);
	}
}
