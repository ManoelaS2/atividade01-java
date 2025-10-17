package ex01aula;

public class VerificadorVoto {
    
    public VerificadorVoto(){
    }   
            
            
    public static void podeVotar(int idade) {
        if(idade >= 16){
            System.out.println("Pode votar");
        }else{
            System.out.println("Nao pode votar");
        }
    }
}
