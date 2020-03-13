package day4_mid;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		Question4 rt = new Question4();
		System.out.println("Before the modify a " + a);
		rt.modify(a);
		System.out.println("Before the modify a " + a);
	}

	void modify(int number) {
		number = number + 1;
		System.out.println("Number = " + number);
	}

}
