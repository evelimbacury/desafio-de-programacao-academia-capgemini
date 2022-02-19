import java.util.Scanner;
/**
 * Questão 1 resolvida - Desafio de Código - Academia Capgemini
 * Autora: Evelim Bacury Rocha
 */
public class questao1{
    public static void main(String[] args) {
        int numero;

        System.out.print("n = ");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        
        montarEscada(numero);
    }

    /**
     * Este método pega o número inserido pelo usuário
     * e monta uma escada com *(asteriísticos) 
     * de base e altura iguais ao número.
     */
    public static void montarEscada(int totalDegrais){
        int degral = 1;
        int contadorDegrais = 0;
        if(totalDegrais <= 0){
            System.out.print("Você entrou com um valor inválido! Por favor insira outro valor.");
        }else{
            for(int espacos = totalDegrais; espacos>contadorDegrais; espacos--){
                while(espacos == degral){
                    System.out.print("*");
                    
                    for(int larguraDegral = 1; larguraDegral<degral; larguraDegral++){
                        System.out.print("*");
                    }
                    
                    degral++;
                    System.out.print("\n");
                    contadorDegrais++;
                    
                    if(contadorDegrais<totalDegrais){
                        espacos = totalDegrais;
                    }
                }
                System.out.print(" ");
            }
        }
    }
}