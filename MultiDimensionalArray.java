import java.util.Scanner;
class MultiDimensionalArray{
public static void main(String[] args){
	int index = 0, rows = 2, columns = 2;
	int[][] multiDimensional = new int[rows][columns];
	Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
	for(int i=0; i<rows ; i++){
		for(int j = 0;j<columns; j++){
            System.out.println("Enter a number: ");
	        multiDimensional[i][j] = input.nextInt();
		}
	}
    int array[] = new int[rows*columns];
    for(int i=0; i<rows ; i++){
		for(int j = 0;j<columns; j++){
			array[index] = multiDimensional[i][j];
			index++;
		}
	}
	for(int i = 0;i<(rows*columns);i++){
		System.out.print(array[i]+"\t");
	}
    input.close();//closing scanner object
}
}