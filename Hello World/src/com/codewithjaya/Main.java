  package com.codewithjaya;

  import java.awt.*;
  import java.text.NumberFormat;
  import java.util.Arrays;
  import java.util.Date;
  import java.util.Locale;
  import java.util.Scanner;

  // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      final  byte MONTHS_IN_YEAR = 12;
      final  byte PERCENT = 100;

      int principal = 0;
      float monthlyInterest = 0;
      int numberOfPayment = 0;
        Scanner scanner = new Scanner(System.in);

      while (true) {
          System.out.print("Principal: ");
           principal = scanner.nextInt();
          if (principal>= 1000 && principal <= 1_000_000)
          break;
          System.out.println("Enter a value between 1K and 1M");
      }
      while (true) {
          System.out.println("Annual Interest Rate: ");
          float annualInterest = scanner.nextFloat();
           monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
          if (annualInterest >= 1 && annualInterest <= 30) {
              break;
          }
          System.out.println("Enter a value between 1 and 30");

      }
      while (true) {
          System.out.print("Period (Years): ");
          int years = scanner.nextInt();
          if (years >= 1 && years <= 30) {
               numberOfPayment = years * MONTHS_IN_YEAR;
              break;
          }
          System.out.println("Enter a value between 1 and 30");
      }
               double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println("Mortgage: " + mortgageFormatted);


    }
}

   // int myAge =30;
   // int herAge = myAge;
    // System.out.println(herAge);

  // byte age = 40;
  // long viewCount = 3_123_456_789L;
  // float price = 10.99F;
  // char letter = 'A';
  //boolean isEligible = false;

  //  byte age = 40;
  // Date now = new Date();
  // System.out.println(now);

  //Point point1 = new Point(1,1);
  // Point point2 = point1 ;
  //point1.x = 5;
  //System.out.println(point2);

  //String message = "  Hello World" + "!!  ";
  //System.out.println(message.trim());
  // System.out.println(message);

  //  String message = "Hi \"Jaya\"";
  //String message = "Hi:\\Jaya\\";
  // String message = "Hi:\nJaya\\";
  //  String message = "Hi:\tJaya\\";
     //     System.out.println(message);

  //int[] numbers = new int[10];
  //       numbers[0] = 1;
  //       numbers[1] = 2;
  //       numbers[2]= 5;
  //        System.out.println(Arrays.toString(numbers));

  //int[] numbers = {5,3,2,1,4,10};
  //        System.out.println(numbers.length);

  //int[] numbers = {5,3,2,1,4,10};
  //       Arrays.sort(numbers);
  //        System.out.println(Arrays.toString(numbers));

  // int[] [] numbers = new int[2][3];
  //       numbers[0][0] = 1;
  //        System.out.println(Arrays.deepToString(numbers));

  // int[] [] numbers = {{1,2,3}, {4,5,6}};
  //        System.out.println(Arrays.deepToString(numbers));

  // final float PI = 3.14F;
  // (PI = 2) can't change the PI value because it we use contstant "final"
  //              System.out.println(PI);

  //int result = 10 + 3;
  //double result = (double)10 / (double) 3;
  //        System.out.println(result);

  //int x = 1;
  //      x++;
  // ++x;
  //        System.out.println(x);

  //int x = 1;
  //      x--;
  //--x
  //        System.out.println(x);

  //int x = 1;
  //      int y = x++;
  //        System.out.println(x);
  //        System.out.println(y);

     // int x = 1;
     // int y = ++x;
       // System.out.println(x);
          //      System.out.println(y);

  //int x = 1;
  //     x += 2;
  //        System.out.println(x);

  // // Implicit casting
  //        //byte > short > int > long
  //     short x = 1;
  //     int y = x + 2;
  //        System.out.println(y);

  //   // Implicit casting
  //        //byte > short > int > long >float > double
  //   double x = 1.3;
  //     double y = x + 2; //2.0
  //     int y =(int) x + 2;
  //        System.out.println(y);

  //String x = "1";
  //     int y = Integer.parseInt(x) + 2;
  //        System.out.println(y);

  //String x = "1.5";
  //     double y = Double.parseDouble(x) + 2;
  //        System.out.println(y);

  // int result =  Math. round(1.1F);
  //        System.out.println(result);

  //    int result =  (int)Math. ceil(1.1F);
  //        System.out.println(result);

  // int result =  (int)Math.floor(1.1F);
  //        System.out.println(result);

  // int result = Math.max(1,5);
  //        System.out.println(result);

  //   int result = Math.min(1,5);
  //        System.out.println(result);

  // double result = Math.random();
  //        System.out.println(result);

  //double result = Math.random() * 100;
  //        System.out.println(result);

  // double result = Math.round(Math.random() * 100);
  //        System.out.println(result);

  //int result =(int) Math.round(Math.random() * 100);
  //        System.out.println(result);

  // int result =(int) (Math.random() * 100);
  //        System.out.println(result);

  // NumberFormat currency = NumberFormat.getCurrencyInstance();
  //      String result = currency.format(1234567.891);
  //        System.out.println(result);

  //NumberFormat percent = NumberFormat.getPercentInstance();
  //      String result = percent.format(1.5);
  //        System.out.println(result);

  //String result =NumberFormat.getPercentInstance() . format(1.5);
  //        System.out.println(result);

  //        Scanner scanner = new Scanner(System.in);
  //        System.out.print("Age: ");
  //        byte age = scanner.nextByte();
  //        System.out.println("MY Age" + age);

  //Scanner scanner = new Scanner(System.in);
  //        System.out.print("Name: ");
  //        String name = scanner.nextLine();
  //        System.out.println("I am " + name);

  //Scanner scanner = new Scanner(System.in);
  //        System.out.print("Name: ");
  //        String name = scanner.nextLine().trim();
  //        System.out.println("I am " + name);

  //** final  byte MONTHS_IN_YEAR = 12;
  //        final  byte PERCENT = 100;
  //
  //        Scanner scanner = new Scanner(System.in);
  //
  //        System.out.print("Principal: ");
  //        int principal= scanner.nextInt();
  //
  //        System.out.print("Annual Interest Rate: ");
  //        double annualInterest = scanner.nextDouble();
  //        double monthlyInterest = annualInterest/ PERCENT/ MONTHS_IN_YEAR ;
  //
  //        System.out.print("Period (Years): ");
  //        int years = scanner.nextInt();
  //        int numberOfPayment = years * MONTHS_IN_YEAR ;
  //
  //        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
  //         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
  //        System.out.println("Mortgage: " + mortgageFormatted);1

  //final  byte MONTHS_IN_YEAR = 12;
  //        final  byte PERCENT = 100;
  //
  //        Scanner scanner = new Scanner(System.in);
  //
  //        System.out.print("Principal: ");
  //        int principal= scanner.nextInt();
  //
  //        System.out.print("Annual Interest Rate: ");
  //        double annualInterest = scanner.nextDouble();
  //        double monthlyInterest = annualInterest/ PERCENT/ MONTHS_IN_YEAR ;
  //
  //        System.out.print("Period (Years): ");
  //        int years = scanner.nextInt();
  //        int numberOfPayment = years * MONTHS_IN_YEAR ;
  //
  //        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
  //         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
  //        System.out.println("Mortgage: " + mortgageFormatted);

  //int x = 1;
  //        int y = 1;
  //        System.out.println(x==y);

  //int x = 1;
  //        int y = 1;
  //        System.out.println(x!=y);

  // int x = 1;
  //        int y = 2;
  //        System.out.println(x <= y);

  //   int x = 1;
  //        int y = 2;
  //        System.out.println(x >= y);

  //  int temperature = 25;
  //       boolean isWarm = temperature > 20 && temperature < 35 ;
  //        System.out.println(isWarm);

  //boolean hasHighIncome = true;
  //      boolean hasGoodCredit = true;
  //      boolean hasCriminalRecord = false;
  //      boolean isEligible =( hasHighIncome || hasGoodCredit ) && !hasCriminalRecord ;

  //    int temp = 35;
  //     if (temp > 30) {
  //         System.out.println("It's a hot day");
  //         System.out.println("Drink water");
  //     } else if (temp >20) {
  //         System.out.println("Beautiful day");
  //     }
  //     else {
  //         System.out.println("Cold Day");
  //     }

  //int income = 120_000;
  //        boolean hasHighIncome = (income > 100_000);

  //  int income = 120_000;
  //     String className = income > 100_000 ? "First" : "Economy";

  //   String role = "admin";
  //        switch (role) {
  //            case "admin":
  //                System.out.println("You're an admin");
  //                break;
  //            case "moderator":
  //                System.out.println("You're a moderator");
  //                break;
  //            default:
  //                System.out.println("You're a guest");
  //        }

  //Scanner scanner = new Scanner(System.in);
  //        System.out.print("Number: ");
  //        int number = scanner.nextInt();
  //         if (number % 5==0 && number % 3 ==0) {
  //            System.out.println("FizzBuzz");
  //        }
  //        else if (number % 5 == 0)
  //        {
  //            System.out.println("Fizz");
  //        }
  //        else if (number % 3 == 0) {
  //            System.out.println("Buzz");
  //        }
  //        else {
  //            System.out.println(number);
  //        }

  //    for (int i= 0; i<5; i++)
  //          System.out.println("Hello World");

  //    for (int i= 0; i<5; i++)
  //          System.out.println("Hello World " + i);

  //     for (int i= 5; i>0; i--)
  //          System.out.println("Hello World " + i);

  // Scanner scanner = new Scanner(System.in);
  //     String input = "";
  //     while (!input.equals("quit")) {
  //         System.out.print("Input: ");
  //         input = scanner.next().toLowerCase();
  //         System.out.println(input);
  //     }

  //   Scanner scanner = new Scanner(System.in);
  //     String input = "";
  //
  //     do{
  //         System.out.print("Input: ");
  //         input = scanner.next().toLowerCase();
  //         System.out.println(input);
  //     } while (!input.equals("quit"));



  // Scanner scanner = new Scanner(System.in);
  //     String input = "";
  //        while (true) {
  //                    System.out.print("Input: ");
  //                    input = scanner.next().toLowerCase();
  //                    if (input.equals("pass"))
  //                        continue;
  //                    if (input.equals("quit"))
  //                        break;
  //                    System.out.println(input);
  //               }

  // String [] fruits = {"Apple", "Mango","Orange"};
  //      for (String fruit : fruits)
  //          System.out.println(fruit);

  //public static void main(String[] args) {
  //      final  byte MONTHS_IN_YEAR = 12;
  //      final  byte PERCENT = 100;
  //
  //      int principal = 0;
  //      float monthlyInterest = 0;
  //      int numberOfPayment = 0;
  //        Scanner scanner = new Scanner(System.in);
  //
  //      while (true) {
  //          System.out.print("Principal: ");
  //           principal = scanner.nextInt();
  //          if (principal>= 1000 && principal <= 1_000_000)
  //          break;
  //          System.out.println("Enter a value between 1K and 1M");
  //      }
  //      while (true) {
  //          System.out.println("Annual Interest Rate: ");
  //          float annualInterest = scanner.nextFloat();
  //           monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
  //          if (annualInterest >= 1 && annualInterest <= 30) {
  //              break;
  //          }
  //          System.out.println("Enter a value between 1 and 30");
  //
  //      }
  //      while (true) {
  //          System.out.print("Period (Years): ");
  //          int years = scanner.nextInt();
  //          if (years >= 1 && years <= 30) {
  //               numberOfPayment = years * MONTHS_IN_YEAR;
  //              break;
  //          }
  //          System.out.println("Enter a value between 1 and 30");
  //      }
  //               double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
  //                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
  //                System.out.println("Mortgage: " + mortgageFormatted);