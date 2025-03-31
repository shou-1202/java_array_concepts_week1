import java.util.Scanner;
class MeanHeightsOfPlayers{
public static void main(String[] args){
	double[] heights = new double[11];
	double total = 0.0;
	double mean;
	Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
	for(int i =0;i<11;i++){
        System.out.println("Enter height: ");
        double height = input.nextDouble();
		heights[i] = height;
		total += heights[i];
	}
    mean = total/11;
	System.out.println("Mean value of height: "+mean);
    input.close();//closing scanner object
}
}