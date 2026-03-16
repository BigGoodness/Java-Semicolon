public class LoopTask1{
    
    public static void main(String[]args){  

        int number = 765432;

            int largest = 0;

                for(int count=0; count<= number;count++){
                    int degit = number;
                    
                if(degit > largest){

                    largest = digit;
                    
                    number = number / 10;
                    }
                }

        System.out.println("Largest digit is: " + largest);
        }

}
