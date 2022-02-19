import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Questão 3 resolvida -Desafio de Código - Academia Capgemini
 * Autora: Evelim Bacury Rocha
 */
public class questao3 {
    public static void main(String[] args) {
		String palavra;
        ArrayList<String> anagramas = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        palavra = in.next();
        char [] caracteres = new char[palavra.length()];

        quebraPalavra(palavra, caracteres);
        verificarAnagramas(palavra, caracteres, anagramas);
	}

    /**
     *Este método quebra a palavra inserida pelo usuário em caracteres.
     */
    private static void quebraPalavra(String palavra, char caracteres[]){
        for(int i = 0; i < palavra.length(); i++){
            caracteres[i] = palavra.charAt(i);
        }
    }

    /**
     * Este método identifica os anagramas, atribue eles a uma lista,
     * verifica se existem anagramas iguais e retorna o valor total de anagramas.
     */
    private static void verificarAnagramas(String palavra, char caracteres[], ArrayList<String> anagramas){
		
		for(int i = 0; i <caracteres.length; i++) {
			for(int j = 1; j < caracteres.length; j++) {
				if(caracteres[i] == caracteres[j] && i !=j && i < j) {
					if(caracteres[i] == caracteres[i+1]){
                        String anagrama1 = palavra.substring(i, i+1);
                        anagramas.add(anagrama1);
                    }else{
                        String anagrama2 = palavra.substring(i, i+1);
                        anagramas.add(anagrama2);

                        String anagrama3 = palavra.substring(i, j);
                        anagramas.add(anagrama3);
                        
                        String anagrama4 = palavra.substring(i + 1, j + 1);
                        anagramas.add(anagrama4);

                        verificarAnagramasIguais(anagrama2, anagrama3, anagrama4, anagramas);
				    }       
                }
			}
		}
        System.out.println(anagramas.size()+" "+ anagramas);
    }

    /**
     *Este método verifica se os anagramas identificados tem as mesmas letras
     *e os retira da lista de anagramas
     */
    private static void verificarAnagramasIguais(String anagrama1, String anagrama2, String anagrama3, ArrayList<String> anagramas){
        char [] arrayAnagrama1 = anagrama1.toCharArray();
        char [] arrayAnagrama2 = anagrama2.toCharArray();
        char [] arrayAnagrama3 = anagrama3.toCharArray();

        Arrays.sort(arrayAnagrama1);
        Arrays.sort(arrayAnagrama2);
        Arrays.sort(arrayAnagrama3);

        if(Arrays.equals(arrayAnagrama1, arrayAnagrama2)){
            anagramas.remove(anagrama1);
        }else if(Arrays.equals(arrayAnagrama1, arrayAnagrama3)){
            anagramas.remove(anagrama1);
        }else if(Arrays.equals(arrayAnagrama2, arrayAnagrama3)){
            anagramas.remove(anagrama2);
        }
    }
}
