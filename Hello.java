import java.util.Scanner;
/**
 * Author: Ethan McKinley
 *
 * Desc.: put the world in a toaster
 *
 *
 * */

public class Hello{

	public void resOutput(int inputIntParameter){
		// if statement to deptermine the user's mood
		if(inputIntParameter == 1){

			//when user is happy 
			System.out.println(userPrompts[0]);
		}
		
		else if(inputIntParameter == 2){
			
			//when user has crippling depression
			System.out.println(userPrompts[1]);

		}
		else{
			System.out.println(userPrompts[2]);

		}

	}
	public static void main(String []args){

		/**
		 * Creating new Scanner object to obtain user input
		 **/
		Scanner input = new Scanner(System.in);
		int inputInt;
		String[] userPrompts = new String[3];

		userPrompts[0] = "Great!";
		userPrompts[1] ="Run, Forest, run!";
		userPrompts[2] ="learn to read";

		System.out.print("please enter 1 if you feel happy & 2 if you feel sad");
		inputInt = input.nextInt();
		
		resOutput(inputInt);

	
	}
}
