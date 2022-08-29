import java.util.Scanner;

public class Scan {
    public void scanner() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Data types");
        String datatypes = myObj.nextLine();
        System.out.println("data types are " + datatypes);
    }

    public static void main(String[] args) {
        Scan scan = new Scan();
        scan.scanner();
    }
}
