import java.util.Scanner;
class AbleToVoteUsingArray{
public static void main(String[] args){
  int [] age = new int[10];//declaring an array
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  for(int i = 0;i<age.length;i++){
	  System.out.println("\nEnter age for student "+(i+1)+": ");
      age[i] = input.nextInt();// storing input value in the variable
  }
  for(int j = 0;j<age.length;j++){
     if (age[j]>=18){
       System.out.println("\nThe student with age "+age[j]+" can vote");//printing the result
  }
     else{
	   System.out.println("\nThe student with age "+age[j]+" cannot vote");//printing the result
  }	
  }  
  input.close();//closing scanner object
}
}