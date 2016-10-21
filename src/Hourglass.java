public class Hourglass {

	public static void main(String[] args) {
		lineWithQuotes();
		printTopHalf();
		printMiddle();
		printBottomHalf();
		lineWithQuotes();
	}

	public static void lineWithQuotes(){
		System.out.print("|");
		for(int j = 0; j<10; j++){
			System.out.print("\"");
		}
		System.out.println("|");	
	}	

	public static void printTopHalf(){
		for (int i=1; i<=4;i++){
			for (int s=1; s<=i;s++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int k=0; k <=9-2*i;k++){
				System.out.print(":");
			}
			System.out.println("/");		
		}	
	}
	
	public static void printBottomHalf(){
		for (int i=4; i>=1;i--){
			for (int s=i; s>=1;s--){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int k=8; k >= 2*i-1;k--){
				System.out.print(":");
			}
			System.out.println("\\");
		}	
	}
	
	public static void printMiddle(){
		System.out.println("     ||");
	}
}