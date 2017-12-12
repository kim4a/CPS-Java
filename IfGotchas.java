import java.util.Scanner;

public class IfGotchas {

	public static void main(String[] args) {
		boolean isCrazy = false;
		boolean isOverWorked = false;
		boolean isFine = false;
		Scanner sc = new Scanner(System.in);
		double hoursTaken = 0;
		System.out.println("How many credit hours are you taking this semester?");
		hoursTaken = sc.nextDouble();
		if(hoursTaken > 21)
			isCrazy = true;
		if(hoursTaken > 15)
			isOverWorked = true;
		if(hoursTaken <= 15);
			isFine = true;
		System.out.println("Are you crazy? " + isCrazy);
		System.out.println("Are you over worked? " + isOverWorked);
		System.out.println("Are you fine? " + isFine);

	}

}