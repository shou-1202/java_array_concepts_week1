import java.util.Scanner;
class OddAndEvenArray{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	int[] odd = new int[(number/2)+1];
	int[] even = new int[(number/2)+1];
	int oddIndex = 0, evenIndex = 0;
	if((number==0)||(number<0)){
		System.out.println("ERROR! EXITING THE PROGRAM");
	}
	else{
		for(int i =1;i<=number;i++){
			if(i%2!=0){
				odd[oddIndex] = i;
				oddIndex++;
			}
			else{
				even[evenIndex] = i;
				evenIndex++;
			}
	}
	}
	System.out.println("odd number array elements: ");
    for(int i = 0;i<oddIndex;i++){
		System.out.println(odd[i]);
	}
	System.out.println("even number array elements: ");
	for(int i = 0;i<evenIndex;i++){
		System.out.println(even[i]);
	}
    input.close();//closing scanner object
}
}