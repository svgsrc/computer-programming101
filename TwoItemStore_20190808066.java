

import java.util.Scanner;

/*
 * @author Sevgi SARICA
 * @since 13.11.2022
 *
 */
public class TwoItemStore_20190808066 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("****Store Inventory****");
        System.out.print("Please enter the name of product 1: ");

        String productTemp1 = input.nextLine();
        String product1 = productTemp1.substring(0, 1).toUpperCase()
                + productTemp1.substring(1).toLowerCase();

        System.out.print("Please enter the number of "+ product1 +" we have: ");
        int numOfProduct1 = input.nextInt();
        if (numOfProduct1 < 0) {
            System.out.println("ERROR:Value cannot be negative. Exiting.");
        } else {
            System.out.print("Please enter the cost of " + product1 +" : ");
            double costProduct1 = input.nextDouble();
            if (costProduct1 < 0) {
                System.out.println("ERROR:Value cannot be negative. Exiting.");
            } else {

                System.out.print("Please enter the name of product 2: ");

                input.nextLine();

                String productTemp2 = input.nextLine();
                String product2 = productTemp2.substring(0, 1).toUpperCase()
                        + productTemp2.substring(1).toLowerCase();


                System.out.print("Please enter the number of "+ product2
                        +" we have: ");
                int numOfProduct2 = input.nextInt();
                if (numOfProduct2 < 0) {
                    System.out.println("ERROR:Value cannot be negative." +
                            " Exiting.");
                } else {
                    System.out.print("PLease enter the cost of " + product2
                            +" : ");
                    double costProduct2 = input.nextDouble();
                    if (costProduct2 < 0) {
                        System.out.println("ERROR:Value cannot be negative." +
                                " Exiting");
                    }else{
                        int customerProduct1 = 0;
                        int customerProduct2 = 0;
                        int choice = 0;

                        System.out.println("****Customer User Interface****");
                        String message = "Welcome to our store. We have following."
                                + "Please enter  what you would like: ";
                        do {
                            System.out.println(message);
                            System.out.println("1-" + product1);
                            System.out.println("2-" + product2);
                            System.out.println("0- to checkout");
                            choice = input.nextInt();

                            if (choice == 1) {
                                System.out.print("How many " + product1 +
                                        " would you like?");

                                int product1Choice = input.nextInt();

                                if (product1Choice <= 0) {
                                    System.out.println("ERROR:Invalid requested "
                                            + "amount.");
                                } else if ((product1Choice + customerProduct1)
                                        <= numOfProduct1) {
                                    customerProduct1 += product1Choice;
                                } else {
                                    System.out.println("Error. We do not have " +
                                            " many remaining");
                                }


                            } else if (choice == 2) {
                                System.out.print("How many " + product2 +
                                        " would you like?");

                                int product2Choice = input.nextInt();

                                if (product2Choice <= 0) {
                                    System.out.println("ERROR:Invalid requested "
                                            + "amount.");
                                } else if ((product2Choice + customerProduct2)
                                        <= numOfProduct2) {
                                    customerProduct2 += product2Choice;
                                } else {
                                    System.out.println("Error. We do not have " +
                                            " many remaining");
                                }

                            } else if (choice != 0) {
                                System.out.println("ERROR : invalid menu option");
                            }
                        } while (choice != 0);

                        System.out.println("****Customer Total****");

                        double totalCostOfBread = customerProduct1 * costProduct1;
                        double totalCostOfCola = customerProduct2 * costProduct2;

                        System.out.println(product1 + " - " + customerProduct1 +
                                " X " + costProduct1 + " = " + totalCostOfBread);

                        System.out.println(productTemp2 + " - " + customerProduct2 +
                                " X " + costProduct2 + " = " + totalCostOfCola);

                        double totalCost = totalCostOfBread + totalCostOfCola;

                        System.out.println("-------------------------");

                        System.out.println("Total due - " + totalCost);

                        System.out.println("****Final Report****");

                        System.out.println("We now have the remaining "
                                + "amounts of our products: ");

                        System.out.println(product1 + " - " +
                                (numOfProduct1 - customerProduct1));

                        System.out.println(product2 + " - " +
                                (numOfProduct2 - customerProduct2));
                    }


                }

            }

        }

    }

}
