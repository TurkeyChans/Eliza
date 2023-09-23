//https://youtu.be/09xsTejo4zM

import java.util.Scanner;

public class ProjectEliza {
	public static void main(String[] args) {
    	boolean Loop = true;
    	String Name = "";
    	String input = "";
    	char Question_Mark = '?';
    	char Exclamation_Mark = '!';
    	String leave;
    	String leave_lower;
    	
        while(Loop){
        	
            Scanner scnr = new Scanner(System.in);
            
            System.out.println("ELIZA: Hello, my name is Eliza. What is your name? ");
            
            System.out.print("USER: ");
            
            Name = scnr.next();
            
            System.out.println("ELIZA: Hello, " + Name + ". Tell me what is on your mind today in 1 sentence.");
            
            
            while(!input.equals("EXIT")){
            	
                System.out.print("USER: ");
                
                input = scnr.next();
                
                input += scnr.nextLine();
                
                if(!input.equals("EXIT")){
                	
                    String[] words = input.split("\\s+");
                    
                    int lengths = input.length() - 1;
                    
                    if (input.charAt(lengths) == Question_Mark) {
                    	
                        System.out.println("ELIZA: " + PromptBank.getRandomQuestionTrunk(words));
                        
                    }
                    else if (input.charAt(lengths) == Exclamation_Mark){
                    	
                    	String search  = "!";
                    	String remove = words[0].replace("!", "");
                    	String remove1 = words[(words.length) - 1].replace("!", "");
                    	
                    	if (words[0].toLowerCase().indexOf(search.toLowerCase()) != -1 ) {

                    		System.out.println("ELIZA: " + "WOW! Dramatic! " + remove + " and " + remove + " seems to be on your mind. Let's talk about it.");

                    	} else {

                    		System.out.println("ELIZA: " + "WOW! Dramatic! " + words[0] + " and " + remove1 + " seems to be on your mind. Let's talk about it.");

                    	}
                    	
                        
                    }
                    else {
                    	input = input.substring(0, lengths);
                    	
                        words = input.split("\\s+");
                        
                        System.out.println("ELIZA: " + PromptBank.getRandomStatementTrunk(words));
                        
                        
                    }
                }
            }
            
            System.out.println("ELIZA: Do you want to run the session again?");
            
            System.out.print("USER: ");
            
            leave = scnr.next();
            
            leave_lower = leave.toLowerCase();
            
            if(leave_lower.equals("no")){
            	
            	System.out.println("ELIZA: Goodbye, until next time");
            	
            	Loop = false;
            	
            }
            else{
                Loop = true;
                input = "";
                
            }
        }
	}
}
