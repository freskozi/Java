
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
            
        
    


            
        
        }
        System.out.println("Search for?");
            String input2 = scanner.nextLine();
            list.contains(input2);
            boolean checkName = list.contains(input2);
            if (checkName) {
                System.out.println(input2 + " was found!");
            } else {
                System.out.println(input2 + " was not found!");
            }

    }
}
