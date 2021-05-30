package tp2;

public class Student {
	private String name;
	private int id;
	private double mean;
	protected double grade1;
	protected double grade2;
	
	private double computeMean(double grade1, double grade2) {
		this.mean = (grade1 + grade2)/2;
		return mean;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getMean() {
		return computeMean(grade1, grade2);
	}
	
	public boolean approved() {
		if (mean >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
}
