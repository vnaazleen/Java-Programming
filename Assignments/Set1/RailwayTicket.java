import java.util.HashMap;
import java.util.Scanner;

public class RailwayTicket {
	
	private String name;
	private String coach;
	private long mobileNumber;
	private int amount;
	private int totalAmount;
	
	private HashMap<String, Integer> amounts = new HashMap<String, Integer>(4);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void accept () {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		this.name = in.next();
		System.out.println("Enter your coach: ");
		this.coach = in.next();
		System.out.println("Enter your Mobile number: ");
		this.mobileNumber = in.nextLong();
		System.out.println("Enter amount: ");
		this.amount = in.nextInt();
		
		amounts.put("First_AC", 700);
		amounts.put("Second_AC", 500);
		amounts.put("Third_AC", 250);
		amounts.put("sleeper", 0);
	}

	public void update () {
		totalAmount = amount + amounts.get(coach);
	}
	
	public void display () {
		System.out.println("Name: " + name);
		System.out.println("Coach: " + coach);
		System.out.println("Mobile number: " + mobileNumber);
		System.out.println("Total amount: " + totalAmount);
	}
	
	public static void main(String[] args) {
		RailwayTicket ticket = new RailwayTicket();
		ticket.accept();
		ticket.update();
		ticket.display();
	}

}
