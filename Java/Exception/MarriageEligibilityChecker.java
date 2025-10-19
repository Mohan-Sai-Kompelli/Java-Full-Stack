
public class MarriageEligibilityChecker {

	public static void main(String[] args) {
		
		MarriageEligibilityChecker check = new MarriageEligibilityChecker();
		try {
			   check.eligibilityChecker(27);
		}catch(TooYoungException | TooOldException e ) {
			e.printStackTrace();
		}
		
	}
	
	public void eligibilityChecker(int age) throws TooOldException, TooYoungException {
		if(age<18) {
			throw new TooYoungException("Marriage cannot be approved . age isbelow 18 years");
		}
		else {
			if(age>60) {
				throw new TooOldException("Marriage cannot be approved. Your age is above 60 years");
			}
			else {
				System.out.println("Marriage Approved . you will get the best match details through email");
			}
		}
	}

}
