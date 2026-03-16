
import java.util.Scanner;
public class TaskOne{
 public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
    int sumEven = 0;
    int sumOdd = 0;
    int total = 0;
    int squareOdd = 0;
    int squareEven = 0;
    double mean = 0;
    int sumSquareEven = 0;
    int sumSquareOdd = 0;
    int sumSquare = 0;
   
    

    for(int count = 0; count < 10; count++){
    System.out.println("Enter a number: ");
    
    int number =  input.nextInt();
   
    if (number % 2 == 0){
      
        sumEven += number;
        squareEven = number * number;
        sumSquareEven += squareEven;
        System.out.printf("it is an even number are %d%n",number);
         
        System.out.printf (" The square of  Even number is %d%n",squareEven); 
    
   }  
    else {
       
        sumOdd += number;
         squareOdd = number * number;
          sumSquareOdd += squareOdd; 
         System.out.printf("it is an odd number are %d%n",number); 
         System.out.printf(" The square of each odd number is %d%n",squareOdd); 

}


}

    total = sumOdd + sumEven;
    mean = total / 10;
    sumSquare = sumSquareEven + sumSquareOdd;



    
   
    System.out.printf(" sum of even number is %d%n",sumEven);  
    System.out.printf(" sum of odd number is %d%n",sumOdd); 
    System.out.printf(" sum of all number is %d%n",total); 
   
  
    System.out.printf (" The mean of the numbers is %.2f%n",mean); 
    System.out.printf (" The sum of the square of even number is %d%n",sumSquareEven); 
    System.out.printf (" The sum of the square of odd number is %d%n",sumSquareOdd); 
    System.out.printf (" The sum of the square of all is %d%n",sumSquare); 


}

}








