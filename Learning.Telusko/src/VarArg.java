
public class VarArg {
	public void m1(int... a) {
		System.out.println("var-arg");
	}
	public void m1(int i) {
		System.out.println("int method");
	}

	public static void main(String[] args) {
		VarArg va = new VarArg();
		va.m1(3);
		va.m1();

	}

}
