import java.util.*;
public class FirstJavaCode{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter the number: ");
    a = sc.nextInt();
    if(a>0){
      System.out.println("The number is positive!");
    } 
    else if(a<0){
      System.out.println("The number is negative!");
    }
    else{
      System.out.println("The number entered is 0");
    }
  }
}