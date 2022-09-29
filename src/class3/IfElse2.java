package class3;

public class IfElse2 {

	public static void main(String[] args) {
	
		double money=5;//declare values 
		boolean isHungry=true;
		double kfcBurger=11;
		
		/*Always looks for a true or false conditions. here are 3 ways: 
		 * 
		 *  syntax: if(true or false statement) {systemout();} 
		 *  else 
		 *  {systemout()}
		 */
		
		//#1 evaluates a true/false statement
		if(money>kfcBurger) {
			System.out.println("Yaaa, I can enjoy a burger");
		}else {
			System.out.println("I should make something at home");
		}
	//#2 storing  false condition DIRECTLY inside
		if(false) {
			System.out.println("If block");
		}else {
			System.out.println("else block");
		}
	
			//#3 Boolean storing true/false in a variable 
			if (isHungry) {
				System.out.println("Lets eat something yummy");
			}
			else {
				System.out.println("Lets do soem coding");
			}
			
				
				if (3>2)
					System.out.println("there is a true statement inside parenthesis");
			
			//Another example 
				
				double myBankBalance=2000;
				double theAmountThatIWantToTransfer=2500;
				
				if(myBankBalance>theAmountThatIWantToTransfer)
					System.out.println("Funds transfered");
				else
					System.out.println("Please try again");
		}
			}

	


