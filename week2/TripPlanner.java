import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {


        travelTimeBudget();
//        timeDifference();
//        countryArea();
    }


//    public static void timeDifference(){
//        Scanner input = new Scanner((System.in));
//        System.out.println("What is the time difference, in hours, between your home and your destination? ");
//        int difference = input.nextInt();
//        if(difference<0){
//            difference=24-difference;
//        }
//        System.out.println("That means that when it is midnight at home it will be "+difference+":00 in your travel destination and when it's noon at home it will be "+ (12+difference)+":00");
//        System.out.println("***********");
//
//    }
//
    private static void travelTimeBudget() {
        Scanner input = new Scanner(System.in);
        // takes in days planned on trip, allowance
        System.out.println("How many days are you going to spend traveling? ");
        int tripSpan = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        Double tripBudget = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String destinationCurrencySymbol = input.next();
        System.out.print("How many " + destinationCurrencySymbol + " are there in 1 USD? ");
        Double exchangeRate = input.nextDouble();

        int tripSpanInHours = tripSpan * 24;
        int tripSpanInMinutes = tripSpanInHours * 60;
        int tripSpanInSeconds = tripSpanInMinutes * 60;
        System.out.println("\nIf you are travelling for " + tripSpan + " days that is the same as " + tripSpanInHours + " hours or " + tripSpanInMinutes + " minutes " + "or " + tripSpanInSeconds + " seconds.");

        double budgetPerDay = tripBudget / tripSpan;
        budgetPerDay = budgetPerDay * 100;
        budgetPerDay = (int) budgetPerDay;
        budgetPerDay =(double) budgetPerDay/100.0;
        System.out.println("If you are going to spend $" + tripBudget + " USD that means per day you can spend up to " + budgetPerDay + " USD");

        double tripBudgetInForeignCurrency = tripBudget * exchangeRate;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency * 100;
        tripBudgetInForeignCurrency = (int) tripBudgetInForeignCurrency;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency /100.0;
        double dailyBudgetInForeignCurrency = tripBudgetInForeignCurrency / tripSpan;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency *100;
        dailyBudgetInForeignCurrency = (int)dailyBudgetInForeignCurrency;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency/100.0;
        System.out.println("Your total budget in " + destinationCurrencySymbol + " is " + tripBudgetInForeignCurrency + " " + destinationCurrencySymbol + ", which per day is " + dailyBudgetInForeignCurrency + " " + destinationCurrencySymbol);

    }

//
//    private static void countryArea(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is the square area of your destination country in km^2? ");
//        double kilometers = input.nextDouble();
//        // takes the distance between home and destination in square kilometers and converts to square miles
//        double miles = kilometers / 0.62137;
//        miles = miles * 100;
//        miles = (int) miles;
//        miles = miles/100.0;
//        System.out.println("In miles^2 that is " + miles);
//
//    }



}