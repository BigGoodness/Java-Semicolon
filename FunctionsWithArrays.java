import java.util.Scanner;

public class FunctionsWithArrays {

    public static void main(String...args) {

        Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();

    boolean result = isEven(number);
    System.out.println(result);
}

    public static boolean isEven(int number){
    if(number % 2 == 0){
        return true;
} else {
    return false;
}
}
}



























//    int number = inputCollector.nextInt();
//
//    int result = square(number);
//    System.out.println("Square: " + result);
//}
//
//      public static int square(int number){
//        number *= number;
//        return number;
//}
//













//    printLine();
//}
//
//    public static void printLine(){
//    System.out.println("---------------------");
//}
//}
//




//        System.out.print("Enter your name: ");
//        String name = inputCollector.nextLine();
//
//        printName(name);
//    }
//
//    public static void printName(String name) {
//        System.out.printf("Your name is: %s%n", name);
//    }
//}




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
