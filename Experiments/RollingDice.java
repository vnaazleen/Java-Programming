public class RollingDice {
	public static void main(String[] args) {
		int rolls = 10000;
		int count = 0;
		for (int i=0; i < rolls; i++) {
			int dice1 = 1 + (int) (Math.random() * 10) % 6;
			int dice2 = 1 + (int) (Math.random() * 10) % 6;
			
			if (dice1 == dice2){
				count += 1;
			}
		}
		
		System.out.println(count);
	}
}
