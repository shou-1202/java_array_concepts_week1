import java.util.Scanner;
class CheckIfNumberIsPositive{
public static void main(String[] args){
  int [] number = new int[5];//declaring an array
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  for(int i = 0;i<number.length;i++){
	  System.out.println("\nEnter a number "+(i+1)+": ");
      number[i] = input.nextInt();// storing input value in the variable
  }
  for(int j = 0;j<number.length;j++){
     if (number[j]>0){
			System.out.println("\n Number is positive");//printing the result
		 if(number[j]%2==0){
			System.out.println("\n Number is even");//printing the result
		 }
		 else{
			System.out.println("\n Number is odd");//printing the result
		 }
	 }
     else if(number[j]==0)
	 {
	   System.out.println("\nNumber is zero");//printing the result
	 }
	 else{
			System.out.println("\n Number is negative");//printing the result
	 }
  }  
  input.close();//closing scanner object
}
}