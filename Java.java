package pesa.com;

import java.util.*;
import java.util.Scanner;
import pesa.com.RunMpesa;

class Operation{
static void sendCash(){
  int Number;
  System.out.println("Enter number");
    Scanner obj = new Scanner(System.in);
    Number = obj.nextInt();
    System.out.println("enter amount");
    Scanner obj2 = new Scanner(System.in);
    int amount = obj2.nextInt();
    obj.close();
}
static void withdrawal(){
  System.out.println("Enter Agent number");
  int agentNo;
  Scanner no = new Scanner(System.in);
  agentNo = no.nextInt();
  int amount = no.nextInt();
  int pin = no.nextInt();}
static void status()
{
    System.out.println("Your account balance is");
  }
 
  
  Operation oper = new Operation();

}

class RunMpesa extends Operation{
  public static void main(String[] args){
    System.out.println("1. Send Money");
    System.out.println("2. Withdrawal");
    System.out.println("3. Account status");
   Scanner inp = new Scanner(System.in);
   int choice = inp.nextInt();
   switch (choice){
     case 1 : sendCash();
     break;
     case 2 : withdrawal();
     break;
     case 3 : status();
      break;
   }
 }
}
