import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Informe as suas 3 notas ");
    Scanner scanner = new Scanner(System.in);

    double nota1, nota2, nota3;

    System.out.println("Informe a primeira nota: ");
    nota1 = scanner.nextDouble();

    System.out.println("Informe a segunda nota: ");
    nota2 = scanner.nextDouble();

    System.out.println("Informe a terceira nota: ");
    nota3 = scanner.nextDouble();


    System.out.println("Informe qual parametro você quer, A, P ou H");
    System.out.println("A - Média Aritmética, P - Média Ponderada, H - Média Harmônica");
    char parametro = scanner.next().charAt(0);
    
    if(parametro == 'A'){
      double media = (nota1 + nota2 + nota3);
      System.out.println("A média aritmética é: " + media);
    } else if(parametro == 'P'){
      double media1 = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
      System.out.println("A média ponderada é: " + media1);
    }else if(parametro == 'H'){
      double media2 = 3 / (1/nota1 + 1/nota2 + 1/nota3);
      System.out.println("A média harmônica é: " + media2);
    }
      
    

    
  }
}