package assignments;

public class FibnociiRecur {
	//Recursion:A process in which method calls itself continuosly.
	static int firstterm=0,secondterm=1;
	static int sum;
	public static void main(String[]args) {
		System.out.print(firstterm + " " + secondterm);
		FibnociiRecur fb=new FibnociiRecur();
		fb.printFab(10);
	}
    public void printFab(int number) {
    	if(number>=1) {
    		sum=firstterm+secondterm;//1,2,3,5,8...
    		System.out.print(" " + sum);
    		firstterm=secondterm;//1,1,2,3...
    		secondterm=sum;//1,2,3,5..
    		printFab(number-1);//9,8,7,6,5....
    		
    	}
    }
}
//0,1,1,2,3,5,8,13,21....84