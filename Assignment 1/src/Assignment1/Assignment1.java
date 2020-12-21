package Assignment1;
import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	//detail personal background of the customer
	System.out.print("Enter your first name: ");
	String firstname = input.next();
	System.out.print("Enter your middle name: ");
	String middlename = input.next();
	System.out.print("Enter your last name: ");
	String lastname = input.next();
	System.out.println("Hello \n" + firstname + " " + middlename + " "  + lastname);

	System.out.print("enter your age: ");
	int age = input.nextInt();
	
	System.out.print("enter your gender: ");
	String gender = input.next();
	
	System.out.print("Enter your address: ");
	String address = input.next();
	
	System.out.print("Enter your phone no.: ");
	String PhoneNo = input.next();
		
	//product or services they provide


	System.out.println("Product list: ");
	System.out.println();
	System.out.println("1. White Rice		RM20 per pack");
	System.out.println("2. Brown Rice		RM25 per pack");
	System.out.println("3. Red Rice			RM45 per pack");
	System.out.println("4. Black Rice		RM46 per pack");
	System.out.println("5. Jasmine Rice		RM50 per pack");
	System.out.println("6. Basmati Rice		RM50 per pack");
	System.out.println("7. Japonica Rice	RM52 per pack");
	System.out.println("8. Glutinous Rice	RM54 per pack");
	System.out.println("9. Wild Rice		RM30 per pack");
	System.out.println();
	
	System.out.println("What type of rice would you like to purchase?");
	
	int item1 = 20;
	System.out.print("Enter quantity of White Rice: ");
	int Q_item1 = input.nextInt();
	System.out.println();
	
	int item2 = 25;
	System.out.print("Enter quantity of Brown Rice: ");
	int Q_item2 = input.nextInt();
	System.out.println();
	
	
	
	int item3 = 45;
	System.out.print("Enter quantity of Red Rice: ");
	int Q_item3 = input.nextInt();
	System.out.println();
	
	int item4 = 46;
	System.out.print("Enter quantity of Black Rice: ");
	int Q_item4 = input.nextInt();
	System.out.println();


	int item5 = 50;
	System.out.print("Enter quantity of Jasmine Rice: ");
	int Q_item5 = input.nextInt();
	System.out.println();

	int item6 = 50;
	System.out.print("Enter quantity of Jasmine Rice: ");
	int Q_item6 = input.nextInt();
	System.out.println();
	

	int item7 = 52;
	System.out.print("Enter quantity of Jasmine Rice: ");
	int Q_item7 = input.nextInt();
	System.out.println();
	
	int item8 = 54;
	System.out.print("Enter quantity of Glutinous rice: ");
	int Q_item8 = input.nextInt();
	System.out.println();
	

	int item9 = 30;
	System.out.print("Enter quantity of Wild rice: ");
	int Q_item9 = input.nextInt();
	System.out.println();
	
	//totalprice
	double total1 = (item1 * Q_item1);
	double total2 = (item2 * Q_item2);
	double total3 = (item3 * Q_item3);
	double total4 = (item4 * Q_item4);
	double total5 = (item5 * Q_item5);
	double total6 = (item6 * Q_item6);
	double total7 = (item7 * Q_item7);
	double total8 = (item8 * Q_item8);
	double total9 = (item9 * Q_item9);
	double total = (total1 + total2 + total3 + total5 + total6 + total7 + total8 + total9);
	System.out.println("Total price: RM" + total);
	
	//Discount
			if (total > 100) {
				double discount = total * 0.2;
				double totalprice = (total - discount);
				System.out.println("Discount received: RM" + discount );
				System.out.println("price to be paid: RM" + totalprice);
			}
				else {
					//totalprice
					double discount = total * 0.1;
					double totalprice = (total - discount);
					System.out.println("Discount received: RM" + discount );
					System.out.println("price to be paid: RM" + totalprice);

					
					input.close();
				}
			

}
	
	
	
	
	}


