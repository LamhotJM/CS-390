package day5.session1;

class A {
	int i = 1;

	int f() {
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A sub = new B();
		System.out.println(sub.f());

	}

}

class B extends A {
	int i = 3;

	int f() {
		i = super.i + 1;
		return super.f() + i;
	}

}
