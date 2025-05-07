//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args) {
//
//        Sum divya = new Sum();
//        divya.addtinalOFSum();
//
//        Car myCarOne = new Car();
//        myCarOne.brand="flat";
//        myCarOne.color="black";
//        myCarOne.displayInfo();
//
//        Car myCarTwo = new Car();
//        myCarTwo.startEngine();
//
//        Car myCarThree = new Car();
//        myCarThree.displayInfo();
//    }
//}
//class Car {
//    String brand = "---";
//    int topSpeed;
//    String color = "white";
//    int wheels;
//    int enginePower;
//    int seets;
//
//    public void startEngine() {
//        System.out.println("Engine Started");
//    }
//
//    public void stopEngine() {
//        System.out.println("Stop Started");
//    }
//
//    public void displayInfo(){
//        System.out.println(" car brand = "+brand+ "Car color ="+color);
//    }
//   }

//----------------------random number----------

//import java.util.Scanner;
//import java.util.Random;
//
//class Scratch {
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = random.nextInt(10);
//        int num2 = random.nextInt(10);
//        int correctAnswer = num1 * num2;
//
//        System.out.println("Enter your answer:");
//        int userAnswer = scanner.nextInt();
//
//        if(userAnswer == correctAnswer){
//            System.out.println("It is correct!");
//        }else {
//            System.out.println("It is not correct. The correct answer is: " + correctAnswer);
//        }
//    }
//}

//-----------------using do-while loop
//import java.util.Random;
//import java.util.Scanner;
//
// public class  scratch{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String userInput = "";
//
//        System.out.println("Press 'E' to stop the random number generation.");
//
//        // Using do-while loop
//        do {
//            int randomNumber1 = random.nextInt(10);
//            int randomNumber2 = random.nextInt(10);
//
//            System.out.println("Random Numbers: " + randomNumber1 + " and " + randomNumber2);
//
//            // Wait for a short duration
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            // Check if user wants to exit
//            if (scanner.hasNextLine()) {
//                userInput = scanner.nextLine();
//            }
//
//        } while (!userInput.equalsIgnoreCase("E"));
//
//        System.out.println("Program stopped.");
//        scanner.close();
//    }
//}
//
//import java.util.Scanner;
//import java.util.Random;
//
//class Scratch {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        String userInput = "";
//
//        int num1 = random.nextInt(10);
//        int num2 = random.nextInt(10);
//        int correctAnswer = num1 * num2;
//        Random random.continueNum();
//
//        System.out.println("Enter your answer:");
//        int userAnswer = scanner.nextInt();
//
//        if(userAnswer == correctAnswer){
//            System.out.println("It is correct!");
//        }else {
//            System.out.println("It is not correct. The correct answer is: " + correctAnswer);
//        }
//
//        public void continueNum(){
//        System.out.println("Press 'E' to stop the random number generation.");
//            public static void main(String[] args) throws InterruptedException {
//                do {
//                    System.out.println("generate random number inside do while loop");
//
//                    System.out.println("End generate random number of do while loop");
//
//                    Thread.sleep(num1 * num2);
//                } while (true);
//            }
//     }
//    }
//   }

//------------------random---------

//import java.util.Random;
//import java.util.Scanner;
// class Scratch{
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        String userChoice;
//
//        do {
//            int num1 = random.nextInt(9) + 1; // Generates numbers from 1 to 9
//            int num2 = random.nextInt(9) + 1;
//            int correctAnswer = num1 * num2;
//
//            System.out.println("\nMultiply: " + num1 + " * " + num2);
//            System.out.print("Enter your answer (or press 'e' to exit): ");
//
//            if (scanner.hasNextInt()) {
//                int userAnswer = scanner.nextInt();
//                if (userAnswer == correctAnswer) {
//                    System.out.println("Correct! ");
//                } else {
//                    System.out.println("Incorrect. The correct answer is: " + correctAnswer);
//                }
//            } else {
//                userChoice = scanner.next();
//                if (userChoice.equalsIgnoreCase("e")) {
//                    System.out.println("Exiting the game! ");
//                    break;
//                }
//            }
//        } while (true);
//
//        scanner.close();
//    }
//}

//import java.util.Random;
//class Scratch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int amount = "";
//        int deposit;
//        int withdraw;
//
//        System.out.println("Initial Balance: " + amount);
//
//
//        System.out.println("Enter deposite amount: ");
//        if (deposit > 0) {
//            amount += deposit;
//            System.out.println("Deposited:   " + deposit);
//        } else {
//            System.out.println("Invalid deposit amount!");
//        }
//
//    }
//}

//import java.util.Scanner;
//
//class Scratch{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int amount = 0;
//        int deposit;
//        int withdraw;
//
//        System.out.println("Initial Balance: " + amount);
//
//        // Deposit
//        System.out.print("Enter deposit amount: ");
//        deposit = scanner.nextInt();
//        if (deposit > 0) {
//            amount += deposit;
//            System.out.println("Deposited: " + deposit);
//        } else {
//            System.out.println("Invalid deposit amount!");
//        }
//
//        System.out.println("Balance after deposit: " + amount);
//
//        // Withdraw
//        System.out.print("Enter withdrawal amount: ");
//        withdraw = scanner.nextInt();
//        if (withdraw > 0 && withdraw <= amount) {
//            amount -= withdraw;
//            System.out.println("Withdrawn: " + withdraw);
//        } else if (withdraw > amount) {
//            System.out.println("Insufficient balance!");
//        } else {
//            System.out.println("Invalid withdrawal amount!");
//        }
//
//        System.out.println("Final Balance: " + amount);
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//import java.util.Random;
//   class  Scratch{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String userChoice;
//
//        do {
//
//            int num1 = random.nextInt(10);
//            int num2 = random.nextInt(10);
//            int correctAnswer = num1 * num2;
//
//
//            System.out.println("What is " + num1 + " * " + num2 + "?");
//
//            System.out.print("Enter your answer: ");
//            int userAnswer = scanner.nextInt();
//
//            if (userAnswer == correctAnswer) {
//                System.out.println("It is correct! ");
//            } else {
//                System.out.println("It is not correct.  The correct answer is: " + correctAnswer);
//            }
//
//
//            System.out.print("Press 'E' to exit or any other key to continue: ");
//            userChoice = scanner.next();
//
//        } while (!userChoice.equalsIgnoreCase("E"));
//
//        System.out.println("Program stopped! ");
//        scanner.close();
//    }
//}

//-----------electric bill----------
//import java.util.Scanner;
//class  Scratch{
//    public static void main(String[] args) {
//        Scanner inputunit = new Scanner(System.in);
//
//        int x = 0;
//        do {
//            System.out.println("Enter the bill unit");
//            int unit = inputunit.nextInt();
//            int billamount = 0;
//
//            if (unit >= 50) {
//                billamount = unit * 7;
//            } else if (unit >= 51 || unit <= 150) {
//                billamount = unit * 8;
//            } else if (unit >= 151 || unit <= 250) {
//                billamount = unit * 12;
//            } else if (unit >= 251) {
//                billamount = unit * 15;
//            }
//            int additionalcharges = (billamount * 20) / 100;
//            int total = additionalcharges + billamount;
//            System.out.println("your bill is:" + billamount);
//            System.out.println("Additional charges (20%):" + additionalcharges);
//            System.out.println("your final bill amount is:" + total);
//        } while (x < 5);
//    }
//}

//import java.util.Scanner;
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your email:")
//        String userEmail = scanner.nextInt();{
//        System.out.println("Enter your password:")
//        String userPassword =  scanner.nextInt(){
//        String correctEmail="divya@gmail.com"
//        String correctPassword="Divya12"
//        if (userEmail == (correctEmail) && userPassword == (correctPassword)){
//         System.out.println("Login successfully");
//        }else{
//         System.out.println("Invalid email or password");
//        }
//        }
//        }
//}

//import java.util.Scanner;
//
//class Scratch{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your email: ");
//        String userEmail = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        String userPassword = scanner.nextLine();
//        String correctEmail = "divya@gmail.com";
//        String correctPassword = "Divya12";
//        if (userEmail == (correctEmail) && userPassword == (correctPassword)) {
//            System.out.println("Login successfully");
//        } else {
//            System.out.println("Invalid email or password");
//        }
//    }
//}

//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the num:");
//        int num = scanner.nextInt();
//        if((num & 1) == 0){
//            System.out.println("num is even");
//        }else {
//            System.out.println("num is odd");
//        }
//    }
//}

//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter number:");
//        int number = scanner.nextInt();
//
//        String result = (number % 2 == 0) ? "Even" : "odd";
//        System.out.println(number + "is" + result);
//
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] arg){
//        Scanner number = new Scanner(System.in);
//
//        System.out.println("Enter number");
//        int num = number.nextInt();
//        for (int num = 1 ; num <= 10 ; num++){
//            System.out.println( +num );
//        }
//    }
//}

//import java.util.Scanner;
//
//class Scratch{
//    public static void main(String[] args){
//        Scanner number = new Scanner(System.in);
//
//        System.out.println("Enter a number:");
//        int input = number.nextInt();
//
//        for ( int i = 1; i <= 10; i++){
//            System.out.println( + i);
//        }
//    }
//}
//
//import java.util.Scanner;
//
//class Scratch {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//
//        System.out.println("Enter a value:");
//        int input = number.nextInt();
//
//        int evenSum = 0;
//
//        System.out.println("Even numbers:");
//        for (int i = 2; i <= input; i += 2) {
//            System.out.println(i);
//            evenSum += i;
//        }
//
//        number.close();
//    }
//}


//            -------sum of even------------
//class Sum {
//    public void addtinalOFSum() {
//        Scanner number = new Scanner(System.in);
//        System.out.println("enter your value");
//        int input = number.nextInt();
//        int output = 0;
//        for (int i = 1; i <= input; i++) {
//            if (i % 2 == 0) {
//                output += i;
//            }
//        }
//        System.out.println("The sum of all even numbers from 1 to " + input + " is: " + output);
//
//    }
//}

//------------perimeter of rectangle-------
//
//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args){
//
//        int length = 40;
//        int width = 20;
//        int perimeter = 2* (length + width);
//        System.out.println("Perimeter of rectangle is:" +perimeter);
//
//        Scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = input.nextInt();
//        System.out.println("Entered a number is:" +number);
//    }
//}

//
//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("enter length");
//        int length = input.nextInt();
//
//        System.out.println("enter length");
//
//    }
//}

//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args) {
//        String pin = "1234";
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i <=3; i++){
//            System.out.println("Enter your pin: ");
//            String enteredPin = input.nextLine();
//
//            if(enteredPin.equals(pin)){
//                System.out.println("login successfu!");
//                System.out.println("option : ");
//                System.out.println("Deposit enter 1");
//                System.out.println("Withdraw enter 2");
//                System.out.println("Check balance enter 3");
//                int option = input.nextInt();
//
//                System.out.println("your enterd option is : "+option);
//                break;
//            }
//            else {
//                System.out.println("login unsuccessful!");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//class Scratch {
//    public static void  main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the value of N: ");
//        int n = input.nextInt();
//        int i = 1;
//
//        while (i <= n){
//            System.out.println(i);
//            i++;
//        }
//        input.close();
//    }
//}

//--------------------------



class Scratch{
    public static void main(String[]args){
        System.out.println("hello java");
 //        ---------object 1
        TShirt alfiya = new TShirt("pink",800);
        alfiya.setUserNameAndSize("Divya","medium");
        alfiya.displayTShirt();
 ////        --------------------object 2
        TShirt  omera = new TShirt("pink",500);
          omera.setUserNameAndSize("omera","medium");
         omera.displayTShirt();
         omera.message();
    }
 }
 //----------class Attributes-------
 class TShirt{
 //    client is property
    String clientName ;
 //    -----------blue is parameter....
    String tshirtColor = "Blue";
    String companylogo ="Enjoy Programming";
    String tShirtSize;
    Integer cost = 500;
 //    ----------constructor---------------
    TShirt(String color ,int price){
 //        ---------parameter
        clientName ="techno";
        tShirtSize ="xl";
        tshirtColor= color;
        cost= price;
        System.out.println("Welcome to enjoy programming");
    }
 ////    ---------function
    void setUserNameAndSize( String userName,String size){
        clientName = userName;
        tShirtSize = size;
    }
    void message(){
     System.out.println("welcome to enjoy");
    }
    void displayTShirt(){
        System.out.println("TShirt belong to student:" + clientName);
        System.out.println(" TShirt Belong to company:"+companylogo);
        System.out.println("TShirt size:"+tShirtSize);
        System.out.println("TShirt cost:"+ cost);
        System.out.println("TShirt color:"+tshirtColor);
    }
 }














