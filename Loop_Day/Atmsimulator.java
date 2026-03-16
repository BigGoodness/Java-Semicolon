import java.util.Scanner;

public class Atmsimulator{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);
    
    int accountBalance = 1000;

    while(true){
        
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");

      
    
 

int choice = inputCollector.nextInt();

switch (choice) {
    case 1:
        System.out.println("How much do you want to deposit");
        double depositBalance = inputCollector.nextDouble();
        accountBalance += depositBalance;
        System.out.println(accountBalance);
        break;

    case 2:
        System.out.println("Withdraw selected");
        double withdrawBalance = inputCollector.nextDouble();
        withdrawBalance -= depositBalance;
        break;

    case 3:
        System.out.println("Check selected Balance");
        double checkBalance = inputCollector.nextDouble();
        checkBalance = accountBalance - depositBalance;
        break;

    default:
        System.out.println("Exit");
}


}






}
}

