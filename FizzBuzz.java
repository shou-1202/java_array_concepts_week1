import java.util.Scanner;
class FizzBuzz{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	String[] array = new String[number+1];
	if(number>0){
	for(int i=0; i<=number ; i++){
		if((i%3==0)&&(i%5==0)){
			array[i] = "FizzBuzz";
		}
		else if(i%5==0){
			array[i] = "Buzz";
		}
		else if(i%3==0){
			array[i] = "Fizz";
		}
		else{
			array[i] = Integer.toString(i);
		}
	}
	}
	else{
		System.out.println("Error! ");
	}
	for(int i =0; i<=number;i++){
		System.out.println("Position "+i+" = "+array[i]);
	}
    input.close();//closing scanner object
}
}