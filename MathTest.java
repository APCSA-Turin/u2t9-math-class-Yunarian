import java.util.Scanner;
public class MathTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number: ");
        double num = scan.nextDouble();

        System.out.print("Type -1 to take the floor of the inputted number. Any other number will take the ceiling: ");
        int floorOrCeil = scan.nextInt();

        if (floorOrCeil == -1) {
            System.out.println(Math.floor(num));

        }  else {
            System.out.println(Math.ceil(num));
        }

        scan.close();
    }
    
}