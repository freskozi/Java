
import java.util.Scanner;
 
public class MainProgram {
 
    public static void main(String[] args) {

        Statistics statistics = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");


        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
 
 

        while (true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }

            allNumbers.addNumber(number);

            if (number % 2 == 0){
                evenNumbers.addNumber(number);
            }else{
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
 
}
}