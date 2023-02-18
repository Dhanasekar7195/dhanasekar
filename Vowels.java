package conditionsCheck;

public class Vowels {
	public static void main(String[]args) {
		String n ="Fruit";
		if(n.contains("a") || n.contains("e") || n.contains("i") || n.contains("o") ||n.contains("u")) {
			System.out.println("it contain vowel");
		}
		else { 
			System.out.println("it does's not contain vowel");
		}
	}

}
