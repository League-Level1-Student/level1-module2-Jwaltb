package extra;

public class JamesBond {
	public static void main(String[] args) {
		Vault v = new Vault();
		JamesBond A007= new JamesBond();
		int num=A007.findCode(v);
		System.out.println(num);
	}

	int findCode(Vault v) {
		for (int i = 0; i < 1_000_000; i++) {
			if (v.tryCode(i)) {
				
				return i;
			}

		}
		return -1;
	}
}
