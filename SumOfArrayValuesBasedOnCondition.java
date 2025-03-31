import java.util.Scanner;
class SumOfArrayValuesBasedOnCondition{
public static void main(String[] args){
  double [] variable = new double[10];//declaring an array
  int index = 0;
  double total = 0.0;
  while(true){
     Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
     System.out.println("Enter your number: ");
     double number = input.nextDouble();
	 if(index>9){
		 break;
	 }
	 else{
		 if((number==0)||(number<0)){
			 break;
		 }
		 else{
			 variable[index] = number;
		 }
	 }
	 index++;
  }
  for(int i = 0;i<index;i++){
	  total += variable[i];
	  System.out.print(variable[i]+"\t");
  }
  System.out.println("\nTotal: "+total);
  
}
}