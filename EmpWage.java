import java.util.Random;
public class EmpWage {
	private static final int ratePerHour=20;
	private static final int fullTime=1;
	private static final int partTime=2;
	private static final int workingDays=20; 
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Random rand=new Random();
	int empHr=0,totalHrs=0;
	for(int i=0;i<workingDays;i++) {
	int empCheck=rand.nextInt(3);
	switch(empCheck) {
	case fullTime: empHr=8;
			break;
	case partTime: empHr=4;
			break;
	default: empHr=0;
	}
	totalHrs+=empHr;
	}
	System.out.println("Monthly Wage= "+(totalHrs*ratePerHour));
	}
}
