import java.util.Random;
public class EmpWage {
	static final int ratePerHour=20;
	static final int fullTime=1;
	static final int partTime=2;
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Random rand=new Random();
	int empHr=0;
	int empCheck=rand.nextInt(3);
	if(empCheck==fullTime) {
		empHr=8;
		}
	else if(empCheck==partTime) {
		empHr=4;
	}
	else
		empHr=0;
	System.out.println("Daily Wage= "+(empHr*ratePerHour));
	}
}
