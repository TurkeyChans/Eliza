//https://youtu.be/09xsTejo4zM

public class PromptBank {
	public static String getRandomStatementTrunk(String[] words){
		   String search  = ".";
		   String remove = words[0].replace(".", "");
		   String remove1 = words[(words.length) - 1].replace(".", "");
		
		
		   int ends = 0;
		   int max = 3;
		   int min = 1;
		   int ran = max - min + 1;
		   int Ans = (int)(Math.random() * ran) + min;
		   if (words[0].toLowerCase().indexOf(search.toLowerCase()) != -1 ) {
		   if (Ans == 1) {
			   return "Tell me more about " + remove + " and " + remove + ".";
		   }
		   else if (Ans == 2) {
			   return remove + " seems important to you, so does " + remove + ". Please tell me more.";
		   }
		   else {
			   return remove + " and " + remove + " seem to be on your mind. Let's talk about it.";
		   }
		   }
		   else {
			   if (Ans == 1) {
				   return "Tell me more about " + words[0] + " and " + remove1 + ".";
			   }
			   else if (Ans == 2) {
				   return words[0] + "seems important to you, so does " + remove1 + ". Please tell me more.";
			   }
			   else {
				   return words[0] + " and " + remove1 + " seem to be on your mind. Let's talk about it.";
			   }
		   }
		   
	   }
	   
	  

	   public static String getRandomQuestionTrunk(String[] words){
		   
		   String search  = "?";
		   String remove = words[0].replace("?", "");
		   String remove1 = words[(words.length) - 1].replace("?", "");
		   int max = 3;
		   int min = 1;
		   int ran = max - min + 1;
		   int Ans = (int)(Math.random() * ran) + min;
		   if (words[0].toLowerCase().indexOf(search.toLowerCase()) != -1 ) {
			   if (Ans == 1) {
				   return "Is there anything else about " + remove +  " and " + remove + "?";
			   }
			   else if (Ans == 2) {
				   return "Does " + remove + " bother you? How about " + remove + "?";
			   }
			   else {
				   return "Are " + remove +  " and " + remove + " things you think about often?";
			   }
		   }
		   else {
			   if (Ans == 1) {
				   return "Is there anything else about " + words[0] +  " and " + remove1 + "?";
			   }
			   else if (Ans == 2) {
				   return "Does " + words[0] + " bother you? How about " + remove1 + "?";
			   }
			   else {
				   return "Are " + words[0] +  " and " + remove1 + " things you think about often?";
			   }
		   }
	   }
}

