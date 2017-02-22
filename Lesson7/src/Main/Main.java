package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] fraction = {"freedom", "independence", "green"};
		
		for (int i = 0; i < fraction.length; i++) {
			System.out.println(fraction[i]);
		}
		
		System.out.println();
		
		for(String n : fraction){
			System.out.println(n);
		}
		
		System.out.println("From git");
		int balance = 5000;
		
		Scanner scanner = new scanner(Scanner.in);
		
		System.out.println("Enter 1 for cheking balance");
		System.out.println("Enter 2 for credit");
		System.out.println("Enter 3 for get money");
		System.out.println("Enter 4 for exit");
		boolean bankomat = true;
		int scanner = scanner.NextInt();
		while (bankomat)
		switch (key){
			case "1":{
			System.out.println("balance");
				break;
			}
			case "2":{
			if (credit>balance | credit > 0){
				System.out.println("How much money you want get?");
				int credit = scanner.NextInt();
				balance = balance - credit;
			} else { System.out.println("no money");
			}
				break;
			}
			case "3":{
				System.out.println("How much money you wan.....?");
				int money = scanner.NextInt();
				balance = balance + money;
				break;
			}
			case "4":{
				bankomat = false;
				exit;
				break;
			}	
		}
		
	}

}
