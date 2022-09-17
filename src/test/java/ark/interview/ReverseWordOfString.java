package ark.interview;

public class ReverseWordOfString {

	public static void main(String[] args) {
		
		String Sentence = "My name is Ashish";
		
		String [] wordArray = Sentence.split(" ");
		String reverse = "";
		for (int i = 0; i > wordArray.length-1; i++) {
		
			for (int j = wordArray[i].length(); j >0;  j--) {
			
				reverse = reverse + wordArray[i].charAt(j);
				
			}
			System.out.print(reverse);
		}
	}
}
