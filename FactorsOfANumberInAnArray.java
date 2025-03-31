import java.util.Scanner;
class FactorsOfANumberInAnArray{
public static void main(String[] args){
	int maxFactor = 10;
	int[] factors = new int[maxFactor];
	int index = 0;
	Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	for(int i=1; i<=number ; i++){
		if(number%i==0){
			if(index >= maxFactor){
				maxFactor *= 2;
			    int[] temp = new int[maxFactor];
				for(int j = 0;j<index;j++){
					temp[j] = factors[j];
				}
				factors = temp;
				factors[index] = i;
				index++;
			}
			else{
				factors[index] = i;
				index++;
			}
		}
	}
	for(int k = 0;k<index;k++){
	    System.out.println(factors[k]);
	}
    input.close();//closing scanner object
}
}