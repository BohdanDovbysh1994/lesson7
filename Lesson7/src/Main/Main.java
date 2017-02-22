package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 		String [] fraction = {"freedom", "independence", "green"};
		
// 		for (int i = 0; i < fraction.length; i++) {
// 			System.out.println(fraction[i]);
// 		}
		
// 		System.out.println();
		
// 		for(String n : fraction){
// 			System.out.println(n);
// 		}
		
// 		System.out.println("From git");
		Scanner scanner = new scanner(Scanner.in);
		int balance = 5000;
		boolean bankomat = true;
		String login1 = Bohdan;
		String login = scanner.Next;
		int password1 = 1111;
		int password = scanner.NextInt;
		
		System.out.println ("Enter your login)
		if (login equals.login1){
		System.out.println("Enter your password")
			if (passwor == password1){
			System.out.println("Enter 1 for cheking balance");
			System.out.println("Enter 2 for credit");
			System.out.println("Enter 3 for get money");
			System.out.println("Enter 4 for exit");
		int key = scanner.NextInt();
		while (bankomat)
		switch (key){
			case "1":{
			System.out.println(balance);
				break;
			}
			case "2":{
			if (credit>balance | credit > 0){
				System.out.println("How much money you want get?");
				int credit = scanner.NextInt();
				balance = balance - credit;
				System.out.println("Your balance is" + balance);
			} else { System.out.println("no money");
			}
				break;
			}
			case "3":{
				System.out.println("How much money you want.....?");
				int money = scanner.NextInt();
				balance = balance + money;
				System.out.println("Your balance is" + balance);
				break;
			}
			case "4":{
				bankomat = false;
				System.exit(4);
				break;
			}	
		default {
				System.out.println("Wrong comand")
		}
		}
		} else {System.out.println ("Inkorect login")}
		} else {System.out.println ("Incorekt password")}
	}

}
