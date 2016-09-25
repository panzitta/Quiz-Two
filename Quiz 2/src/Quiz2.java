import java.util.Scanner;

public class Quiz2 {
	public static void main(String[]args) {
		Scanner input= new Scanner (System.in);
		System.out.println("What is the cost of tuition for the 2014-2015 school year?");
		double Tuition = input.nextDouble();
		double TotalCost=0;
		for (int y=2014; y<2018; y++){
			System.out.println("What is the percentage increase from fall " +y +" to "+ (y+1)+"?");
			double Increase = input.nextDouble();
			if (Increase<=1 & Increase>=0){
				Tuition = Tuition*Increase+Tuition;
				TotalCost=TotalCost+Tuition;}
			else if (Increase>1){
				Increase=Increase/100;
				Tuition = Tuition*Increase+Tuition;
				TotalCost=TotalCost+Tuition;}
			else{
				System.out.println("Percentage increase cannot be negative. Inaccurate Total Cost Below.");
				break;
			}
			
		}
		
		System.out.printf("The total cost to complete the degree is $%.2f", TotalCost);	

		
	}
	

}
