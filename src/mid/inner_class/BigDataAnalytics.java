package mid.inner_class;

public class BigDataAnalytics extends MasterCourse {
	private int averageProjectGrade;
	private boolean isBusinessCourse;
	
	public BigDataAnalytics(String courseID, int[] allTestGrades,int averageProjectGrade,
			boolean isABusinessCourse, int year, int month, int day)
	{
		super(courseID,allTestGrades, year, month,day);
		averageProjectGrade=0;
		isBusinessCourse= isABusinessCourse;
		
	}
	
	@Override
	public int getAverageGrade()
	{
		int finalTestGrade = super.getAverageGrade();
		return ((finalTestGrade+averageProjectGrade/2));
	}
	

	public void getAverageProjectGrade(int pg) {
		averageProjectGrade=pg;
	}

	public boolean isBusinessCourse() {
		return isBusinessCourse;
	}

	public void setBusinessCourse(boolean isBusinessCourse) {
		this.isBusinessCourse = isBusinessCourse;
	}

}
