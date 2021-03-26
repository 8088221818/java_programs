package assignments;

public class StringReversal {
	public static void main(String[]args) {
		String input="this is java training";//"","a"
		String output=reverse(input);
		System.out.println("the reverse of a string is: " + output);		
	}
	private static String reverse(String input) {
		String reverse= "";
		if(input.isEmpty()||input==null) {
			System.out.println("please enter valid string,Empty and null values are not accepted");
		}
		if(input.length()<=1) {
			reverse=input;
		}else {
			String[] originalArray = input.split("\\s+");
					for(String item:originalArray) {//this,is,java,training
						reverse=item+" "+reverse;//this+""+"",is+" "+this,java+""+is+" "+this.......
					}
		}
		return reverse.trim();
		
	}

}
