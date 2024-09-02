import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 int numero = sc.nextInt();
    System.out.println(" o numero digitado foi:");
  System.out.println(numero);
if(numero > 0){
 System.out.println("o numero e positivo");
  if(numero < 0){
    System.out.println("o numero e negativo");

    if(numero == 0){
      System.out.println("o numero digitado é zero ");
    }




    
  }
}

sc.close();
  }
}