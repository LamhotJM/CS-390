package mid.practice;

public class Middle extends Top {

	int num()

	{
		return 2;
	}

	static class MiddleInner extends Middle {
		int num()

		{
			return 3;
		}

	}

}
