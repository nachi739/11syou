package code11_17;

public class Fool extends Character implements Human {
	// Characterからhpやnameなどのフィールドを継承している
	// Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {}
}