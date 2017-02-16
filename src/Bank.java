
public class Bank {
	private float rateOfInterest;
	Bank()
	{
		rateOfInterest = 4;
	}
	Bank(float roi)
	{
		rateOfInterest = roi;
	}
	public void getRateOfInterest()
	{
		System.out.println("The Rate of Interest in a Bank is : "+ rateOfInterest +"%");
	}
}
