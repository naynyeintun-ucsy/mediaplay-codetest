
import java.util.Scanner;

public class MediaPlayer  {

	
	public static void main(String args[]) throws InstantiationException , IllegalAccessException{
		
		
		Scanner sc = new Scanner(System.in);
		
		String confirmation="yes";
	while(confirmation.equals("yes")){
		try{
			
			System.out.println("Enter Your File Name including Extension (.mp3, .mp4 or .png) => ");
			String fileName= sc.next();
			String extension= fileName.substring(fileName.indexOf('.'));
			PlayerFactory factory = new PlayerFactory();
			Player player= factory.getInstance(extension);
			player.run();
			
	
			
			
		}catch(StringIndexOutOfBoundsException se){
			System.out.println("Wrong extension plz check again");
		}
catch (Exception e) {
			System.out.println("Sorry cannot play file please update user level " );
		}

                 System.out.println("Would you like to play other file yes or no");
	confirmation = sc.next();

}
	    
	}
	
}
