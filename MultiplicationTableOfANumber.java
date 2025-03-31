import java.util.Scanner;
class MultiplicationTableOfANumber{
public static void main(String[] args){
  int [] multiplicationTable = new int[10];//declaring an array
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter your number: ");
  int number = input.nextInt();
  int index = 0, size = 0;
  for(int i = 1;i<11;i++){
	 multiplicationTable[index] = number*i;// storing value in array
	 index++;
  }
  for(int j = 1;j<11;j++){
     System.out.println(number+" * "+j+" = "+multiplicationTable[size]);
	 size++;
  }  
  input.close();//closing scanner object
}
}