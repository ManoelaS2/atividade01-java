import java.util.Scanner;
public class MainAtividade {    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opc;
       do{
           System.out.println("1- Verificador de Idade para Votação");
           System.out.println("2- Calculadora de Área de Quadrado");
           System.out.println("3- Conversor de Temperatura (Celsius para Fahrenheit)");
           System.out.println("4- Concatenador de Nome Completo");
           System.out.println("5- Saida");
           System.out.println("Escolha uma opcao");
           opc = scanner.nextInt();
           
    
        }while(opc != 5);
    }
    
}
