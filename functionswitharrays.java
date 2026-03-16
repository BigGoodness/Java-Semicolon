import java.util.Scanner;

public class functionsWithArrays {

    public static void main(String... args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inputCollector.nextLine();

        printName(name);
    }

    public static void printName(String name) {
        System.out.printf("Your name is: %s%n", name);
    }
}










































//public static void Greetings(){
//    System.out.println("Welcome to java programming");
// 
//}
//}
//




//
//public static int calculateTotal(int[] grades) {
//    int total = 0;
//    for (int grade : grades) {
//        total += grade;
//    }
//    return total;
//}
//}
//





//public static void printArray(int[] arr){
//    for (int value : arr) {
//        System.out.println(value);
//}
//}
//}
