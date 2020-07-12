//Here, I was introduced to Scanner class, and learning about
//standard input and standard output, or stdin and stdout.

//This challenge is complimentary from HackerRank
//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

//Before solving, the lines underneath int a and System.out.println(a)
//were absent. I simply added int b and int c, along with their output commands
//when needing to print their lines. If I wish to run this on VScode, I still need
//to figure out how to get the java compiler to work. It is a very tough challenge
//to figure out, but I know it has to do with the system variables PATH.
//Once I can get the compiler to work, I can replace the a, b, and c with real
//integers, and see my work run successfully here.

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}

// Hopefully, the ongoing pandemic lessens, and I can devote more personal
// time to develop both applications and better practices