import java.util.Random;
import java.util.Scanner;

public class Air {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int seatsAvailable = 1;

        boolean[] capacity = new boolean[10];
        int[] seatFirst = {1, 2, 3, 4, 5};
        int[] seatEconomy = {6, 7, 8, 9, 10};

        while (seatsAvailable <= 10) {
            System.out.println("WELCOME TO SEMICOLON AIRLINE.");
            System.out.println("Type 1 for first class, Type 2 for economy ");
            System.out.println();
            int section = input.nextInt();
            if (capacity[0] == true && capacity[1] == true && capacity[2] == true && capacity[3] == true && capacity[4] == true
                    && capacity[5] == true && capacity[6] == true && capacity[7] == true && capacity[8] == true
                    && capacity[9] == true) {
                System.out.println("No more seats available. Next flight leaves in 3 hours.");
                break;
            }
            if (section == 1 && capacity[0] == true && capacity[1] == true && capacity[2] == true && capacity[3] == true && capacity[4] == true) {
                System.out.println();
                System.out.println("First Class is filled up. Would you like to reserve a seat in economy?");
                System.out.println("Enter 1 for no, enter 2 for yes.");
                int response = input.nextInt();
                if (response == 1) {
                    System.out.println("Next flight leaves in 3 hours");
                    break;
                } else
                    continue;
            }
            if (section == 1) {
                int randomSeat = (seatFirst[rand.nextInt(5)]);
                while (capacity[randomSeat - 1] == true) {
                    randomSeat = (seatFirst[rand.nextInt(5)]);
                    if (capacity[randomSeat - 1] == false) {
                        capacity[randomSeat - 1] = true;
                        System.out.println("BOARDING PASS");
                        System.out.println("Seat no: " + randomSeat);
                        System.out.println("Class section: First class");
                        System.out.println();
                        break;
                    } else {
                        continue;
                    }
                }

                if (capacity[randomSeat - 1] == false) {
                    capacity[randomSeat - 1] = true;
                    System.out.println("BOARDING PASS");
                    System.out.println("Seat no: " + randomSeat);
                    System.out.println("Class section: First class");
                    System.out.println();
                    continue;
                }


            }

            if (section == 2 && capacity[5] == true && capacity[6] == true && capacity[7] == true && capacity[8] == true && capacity[9] == true) {
                System.out.println("Economy is filled up. Would you like to reserve a seat in first class?");
                System.out.println("Enter 1 for no, enter 2 for yes.");
                int response = input.nextInt();
                if (response == 1) {
                    System.out.println("Next flight leaves in 3 hours");
                    break;
                } else
                    continue;
            }
            if (section == 2) {
                int randomSeat = (seatEconomy[rand.nextInt(5)]);

                while (capacity[randomSeat - 1] == true) {
                    randomSeat = (seatEconomy[rand.nextInt(5)]);
                    if (capacity[randomSeat - 1] == false) {
                        capacity[randomSeat - 1] = true;
                        System.out.println("BOARDING PASS");
                        System.out.println("Seat no: " + randomSeat);
                        System.out.println("Class section: First class");
                        System.out.println();
                        break;
                    } else {
                        continue;
                    }
                }
                if (capacity[randomSeat - 1] == false) {
                    capacity[randomSeat - 1] = true;
                    System.out.println("BOARDING PASS");
                    System.out.println("Seat no: " + randomSeat);
                    System.out.println("Class section: First class");
                    System.out.println();
                    continue;
                }
            }
            seatsAvailable++;

        }
    }
}
