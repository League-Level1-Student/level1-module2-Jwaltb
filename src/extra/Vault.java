package extra;

import java.util.Random;

public class Vault {
	Vault() {
		Random r = new Random();
		secretCode = r.nextInt(1_000_000);
	}

	int secretCode;

	boolean tryCode(int guess) {
		if (guess == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}
