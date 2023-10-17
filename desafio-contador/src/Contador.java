import java.util.Locale;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("CONTADOR");

    System.out.println("Informe o primeiro número");
    int primeiroNumero = scanner.nextInt();

    System.out.println("Informe o segundo número");
    int segundoNumero = scanner.nextInt();
    
    try {
      contadorNumerico(primeiroNumero, segundoNumero);
    }
    catch (ParametrosInvalidosException e){
      System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }

  }


  static void contadorNumerico(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
    int resultado = numeroDois - numeroUm;
    if(resultado < 0){
      throw new ParametrosInvalidosException();
    }
    else if(resultado == 0){
      System.out.println("Não é possível realizar a contagem, pois o resultado é zero.");
    }
    else{
      for(int contador = 1; contador <= resultado; contador++){
      System.out.println("Imprimindo o número " + contador);
      }
    }
  }
}
