package bmi;

public class BMI {
	
	double bmi;
	
	public BMI(double weight, double height) {
		bmi = weight / (height * height) * 703;
	}

	public double getBMI() {
		return bmi;
	}
	
	public String getStatus() {
		if (bmi < 18.5)
			return "underweight";
		else if (bmi < 25)
			return "normal";
		else if (bmi < 30)
			return "overweight";
		else
			return "obese";
	}

}
