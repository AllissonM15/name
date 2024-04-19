import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner input=new Scanner(System.in);
    System.out.println(" enter your name. ");
    String name = input.nextLine();  
     for(int i = 0; i < 3; i++){
    
    System.out.println(" welcome " + name);
    }

     }
}