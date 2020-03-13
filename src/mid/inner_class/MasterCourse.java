package mid.inner_class;

public class MasterCourse {
	private String courseID;
	private int [] testGrades;
	
	MasterCourse(String theCourseID, int [] allTestGrades, int aYear, int aMonth, int aDay)
	{
		courseID = theCourseID;
		testGrades = allTestGrades;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public int[] getTestGrades() {
		return testGrades;
	}

	public void setTestGrades(int[] testGrades) {
		this.testGrades = testGrades;
	}
	
	public int getAverageGrade()
	{
		int finalGrade =0;
		for (int grade: testGrades)
		{
			finalGrade +=grade;
		
		}
		return (finalGrade/testGrades.length);
	}
	
	@Override
	public final boolean equals(Object ob)
	{
		if(ob == null) return false;
		if (!(ob instanceof MasterCourse)) return false;
		MasterCourse inMCObj =(MasterCourse) ob;
		return (inMCObj.courseID.equals(courseID));
		
	}
	
	

}
