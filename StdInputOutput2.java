import java.util.*;

class StdInputOutput2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        double number2 = scanner.nextDouble();
        String sentance = scanner.next();
        sentance += scanner.nextLine();
        scanner.close();

        System.out.println("String: " + sentance);
        System.out.println("Double: " + number2);
        System.out.println("Int: " + number);
    }
}