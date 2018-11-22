
public class as1_if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double income=1500_000_000;
		double taxAmount=0;
		long first=150_000_000l;
		long second=300_000_000l;
		long third=600_000_000l;
		long fourth=1_200_000_000l;
		
		if(income<=first) {
			taxAmount=income*0.25;
			System.out.println("Tax amount for this income:"+income+" is:"+taxAmount);
		}else if(income<=second) {
			taxAmount=((second-first)*0.30)+(first*0.25);
			System.out.println("Tax amount for this income:"+income+" is:"+taxAmount);
		}else if(income<=third) {
			taxAmount=((income-second)*0.35)+((second-first)*0.30)+(first*0.25);
			System.out.println("Tax amount for this income:"+income+" is:"+taxAmount);
		}else if(income<=fourth) {
			taxAmount=((income-third)*0.40)+((third-second)*0.35)+((second-first)*0.30)+(first*0.25);
			System.out.println("Tax amount for this income:"+income+" is:"+taxAmount);
		}else if(income>fourth) {
			taxAmount=((income-fourth)*0.45)+((fourth-third)*0.40)+((third-second)*0.35)+((second-first)*0.30)+(first*0.25);
			System.out.println("Tax amount for this income:"+income+" is:"+taxAmount);
		}
		
		
		
	}

}
