package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit Axis Bank");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Methods :deposit()
		//Description:
//		You have to override the method deposit in AxisBank.

		System.out.println("Bank Detailss are:");
		BankInfo bank = new BankInfo ();
		bank.saving();
		bank.fixed();
		bank.deposit();
			
		System.out.println("Axis Bank Details are:");
		AxisBank axis = new AxisBank ();
		axis.deposit();

	}

}
