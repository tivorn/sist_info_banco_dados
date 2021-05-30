package tp2;

public class Subject {
	public String[] students = new String[10];
	public double[] classGrades1 = new double[10];
	public double[] classGrades2 = new double[10];
	
	public void setStudentToSubject(String name, int index) {
		this.students[index] = name;
	}
	
	public void setStudentGrade1ToSubject(double grade1, int index) {
		this.classGrades1[index] = grade1;
	}
	
	public void setStudentGrade2ToSubject(double grade2, int index) {
		this.classGrades2[index] = grade2;
	}
	
	public double computeClassGrandes1(double[] classGrades1) {

		double sumClassGrades1 = 0;
		
		for (int i = 0; i < classGrades1.length; i++) {
			sumClassGrades1 = sumClassGrades1 + classGrades1[i];
		}
		
		double meanClassGrades1 = sumClassGrades1/classGrades1.length;
		
		return meanClassGrades1;
	}
	
	public double computeClassGrandes2(double[] classGrades2) {
		double sumClassGrades2 = 0;
		
		for (int i = 0; i < classGrades2.length; i++) {
			sumClassGrades2 = sumClassGrades2 + classGrades2[i];
		}
		
		double meanClassGrades2 = sumClassGrades2/classGrades2.length;
		
		return meanClassGrades2;
	}
	
	public double getMeanClassGrades1() {
		return computeClassGrandes1(classGrades1);
	}
	
	public double getMeanClassGrades2() {
		return computeClassGrandes2(classGrades2);
	}
}
