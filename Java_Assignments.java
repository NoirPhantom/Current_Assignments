import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Java_Assignments {

    final static String filePath = "C:\\Users\\NoirPhantom\\git\\Java-Assignments-master\\the_prince_quotes.txt";

    public static void main(String[] args) {

        // Question 1 - Writing a program to reverse the order of words in a sentence
        String str[] = "The first program everyone writes is Hello World".split(" ");
        String reverseStr = "";

        for (int i = str.length - 1; i >= 0; i--) {
            reverseStr += str[i] + " ";
        }
        System.out.println("Sentence in reverse: " + reverseStr);

        // Question 2 - Writing a program to ask the user to enter a year and tell them
        // if it's a leap year or not
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                isLeapYear = true;
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        } else {
            isLeapYear = false;
        }
        // if (!isLeapYear) {
        // System.out.println(year + ": Non Leap-year");
        // } else {
        // System.out.println(year + ": Leap-year");
        // }

        // Question 3 - Write a program that declares and initializes a counter to 0 -
        // Run a forever while loop, increment counter by 1 with every iteration, beark
        // the loop when counter is 5, continue to loop without printing the number when
        // count is 3. Print the counter for all other values.
        int counter = 0;

        while (true) {
            if (counter == 5) {
                break;
            } else if (counter == 3) {
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }

        // Question 4 - Write a program to initialize an array of 5 float numbers. Loop
        // through the array using a for loop and print each number.
        float[] number = { 2.5f, 4.8f, 9.07f, 12.55f, 55.7f };

        for (int i = 0; i <= number.length - 1; i++) {
            System.out.println(number[i]);
        }

        // Question 5 - Write a program to ask the user for a decimal number, and print
        // the floor, ceil, round of that number
        System.out.println("Enter decimal number: ");
        double deci = input.nextDouble();

        System.out.println("The ciel value of the number is: " + Math.ceil(deci));
        System.out.println("The ciel value of the number is: " + Math.floor(deci));
        System.out.println("The ciel value of the number is: " + Math.round(deci));

        // Question 6 - Write a program to ask the user for states they have visited in
        // the US. Ignore case by converting their input to lower case. Ignore duplicate
        // inputs. Order of input doesn't matter. The program runs forever until the
        // user types "done". When the user types "done", display the unique list of
        // states back to the user.
        HashSet<ArrayList> states = new HashSet<>();
        String state;

        ArrayList<String> stateList = new ArrayList<String>();

        while (true) {

            System.out.println("Enter the states you have visited one at a time: ");
            System.out.println("State Name: ");

            input.nextLine();
            state = input.nextLine().toLowerCase();
            stateList.add(state);

            if (state.equalsIgnoreCase("done")) {
                break;
            }
        }
        System.out.println(states);

        // Question 7 - Write a program that asks user for 2 integers and print the
        // divison of the 2 integers. Handle ArithmeticException and print its
        // stacktrace. Handle all other RuntimeException and print its message.
        // Irrespective of whether an exception occurred or not, print a "Thank you"
        // message.
        int num1;
        int num2;

        try {

            System.out.println("Enter first number: ");
            num1 = input.nextInt();//String for user input only exception would catch and continue the code

            System.out.println("Enter second number: ");
            num2 = input.nextInt();

            System.out.println("The division of the 2 numbers is: " + (num1 / num2));

        } catch (ArithmeticException e) {

            System.out.println(e.getStackTrace());

        } catch (Exception e) {

            System.out.println(e.getStackTrace());

        } finally {

            System.out.println("Thank you");

        }

        // Question 8 - Write a program that counts the occurrences of each word in a
        // text file (the_prince_quotes.txt in the same repository). Make it
        // case-insensitive by converting each word to lower case before counting
        Map<String, String> mapFromFile = HashMapFromTextFile();

        for (Map.Entry<String, String> entry : mapFromFile.entrySet()) {

            System.out.println(entry.getKey().toLowerCase());

        }

        input.close();

    }

    public static Map<String, String> HashMapFromTextFile() {

        Map<String, String> map = new HashMap<String, String>();
        BufferedReader br = null;

        try {

            // create file object
            File file = new File(filePath);

            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));

            String line = null;

            // read file line by line
            while ((line = br.readLine()) != null) {

                // split the line by :
                String[] parts = line.split(":");

                // first part is name, second is number
                String name = parts[0].trim();
                String number = parts[0].trim();

                // put name, number in HashMap if they are
                // not empty
                if (!name.equals("") && !number.equals(""))
                    map.put(name, number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }
        return map;
    }

}
// "C:\\Users\\NoirPhantom\\git\\Java-Assignments-master\\Java-Assignments-master\\the_prince_quotes.txt"