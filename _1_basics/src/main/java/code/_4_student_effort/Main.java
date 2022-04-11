package code._4_student_effort;


import code._4_student_effort.FizzBuzzChallenge.FizzBuzz;
import code._4_student_effort.FooBarQix.FooBarQix;
import code._4_student_effort.PairOf2Challenge.PairOfTwo;
import code._4_student_effort.PairOf3Challenge.PairOFThree;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //FizzBuzz challenge


    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.fizzbuzz();
    fizzBuzz.fizzBuzz2();
    System.out.println("---------------------------");
    // FooBarQix challenge
    FooBarQix foo = new FooBarQix();
    System.out.println(foo.compute2(101));
    System.out.println("---------------------------");
    // PairOfTwo
    PairOfTwo pairOfTwo = new PairOfTwo();
    int [] nrs = new int []{2,3, -2, -1, -3};
    pairOfTwo.countPairsInArray(nrs);

    // Pair of Three
    PairOFThree pairOFThree = new PairOFThree();
    }
}
