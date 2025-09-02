package math;
class Math {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!
    System.out.println("Hello world!");
    System.out.print("yo");

    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): store whole number
    //double: store decimal
    //boolean:store true or false yes or no statements

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
     int x =5;
     boolean y = false;
     double z = 5.3;




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    //Create codes that will print the following:
    System.out.println("Odd integers from 1 to 100");
    for (int i = 1; i<= 100; i++) {
      if (i % 2 !=0) {
        System.out.print(i + " ");
      }
    }

    System.out.println("Numbers ending in 0 from 1000 down to 0:");
    for (int i =1000; i>=0; i-=10 ){
      if (i != 0) {
        System.out.print(i + " ");
      }
    }

    System.out.println("Multiples of 3 from 1 to 100:");
    for (int i =3; i<= 100; i+=3) {
      System.out.print(i + " ");
    }
    //Odd integers from 1 to 100, inclusive of both



    //All multiples of 3 from 1 to 100




    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
  }
}