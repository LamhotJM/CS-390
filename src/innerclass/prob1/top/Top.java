package innerclass.prob1.top;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	public Top() {
		mid = new Middle();
		//midbot = new Middle().new Bottom();// or
	    midbot = mid.new Bottom();
	}

	// returns the value in the instance variable of Bottom
	int readBottom() { //read bottom from top (last class)/top class
		// implement
		return midbot.b;
	}

	class Middle {
		int m = 2;

		// returns sum of instance variable in Top and
		// instance variable in Bottom
		int addTopAndBottom() {

			// implement
			return Top.this.t + Top.this.readBottom();
		}

		class Bottom {
			int b = 3;

			// returns the product of the instance variables
			// in all three classes
			int multiplyAllThree() {
				// implement
				// top * middle * bottom
				return  Top.this.t * Middle.this.m * b;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}