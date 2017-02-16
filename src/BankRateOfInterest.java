
public class BankRateOfInterest {

	public static void main(String[] args) {
			Bank b=new Bank(6);
			AxisBank ab=new AxisBank();
			SbiBank sb=new SbiBank();
			IciciBank ib=new IciciBank();
			
			b.getRateOfInterest();
			System.out.println();
			ab.getRateOfInterest();
			System.out.println();
			sb.getRateOfInterest();
			System.out.println();
			ib.getRateOfInterest();
	}

}
