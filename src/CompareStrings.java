
/**
* The class asks the user for text and sub-text
* It will then find any instances of the sub-text in the main text
* @version 1.1
* @author Matthew Cobbing
*/

import java.util.*;

public class CompareStrings {

	public static void main(String[] args) {

		String text = getUserInput("text").toLowerCase(); //generate lower case text string
		String subtext = getUserInput("subtext").toLowerCase(); //generate lower case sub-text string

		char[] textArray = text.toCharArray(); //generate char arrays from both strings
		char[] subtextArray = subtext.toCharArray();
		
		if(!isUserError(textArray.length, subtextArray.length)) {
			return;
		}

		ArrayList<Integer> arrli = findSubtext(textArray, subtextArray); //generate int arraylist from findSubtext results

		if (arrli.isEmpty()) {
			System.out.println("<no matches>"); //no matches found in findSubtext
		} else {
			System.out.println(arrli.toString().replaceAll("\\[", "").replaceAll("\\]", "")); //print findSubtext results, delete brackets
		}

	}
	
	public static boolean isUserError(int textLength, int subtextLength) {
		
		if (subtextLength > textLength) { //check text is not shorter than sub-text
			System.out.println("Error: Text must be longer than subtext.");
			return false;
		}
		
		if (textLength == 0 || subtextLength == 0) {//check text or sub-text > 0 
			System.out.println("Error: Text or Sub-text cannot be empty.");
			return false;
		}
		
		return true;
	}

	public static String getUserInput(String text) {
		//method asks the user for text input
		System.out.println("Please input " + text + ":"); 
		Scanner sc = new Scanner(System.in); 

		String input = sc.nextLine(); 

		return input;
	}

	public static ArrayList<Integer> findSubtext(char[] textArray, char[] subtextArray) {
		//method finds instances of sub-text in text
		ArrayList<Integer> matchArr = new ArrayList<Integer>(); //create ArrayList for matches

		for (int i = 0; i < textArray.length; i++) { //iterate through text array
			for (int j = 0; j < subtextArray.length; j++) { //iterate through sub-text array
				if (textArray[i + j] == subtextArray[j]) { //if match found between text and sub-text array
					if (j == subtextArray.length - 1) { 
						matchArr.add(i + 1); 
					}
				} else {
					break;
				}
			}
		}

		return matchArr;

	}

}
