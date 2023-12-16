import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

           String outputString = "";
            Scanner console = new Scanner(System.in);
            String inputString = console.nextLine();
            String[] ranges = inputString.split(", ");
            for (String range : ranges) {
                String[] numbers = range.split(" ");
                int number1 = Integer.parseInt(numbers[0]);
                int number2 = Integer.parseInt(numbers[1]);
                if (number1 > number2) {
                    System.out.println("Начало диапазона больше, чем конец");
                    System.exit(1);
                }
                else {
                    outputString = outputString + Integer.toString(number2 - number1) + ", ";
                }
            }
            outputString = outputString.substring(0, outputString.length() - 2); // Обрезаем лишнюю запятую в конце
            System.out.println(outputString);


    }


}
