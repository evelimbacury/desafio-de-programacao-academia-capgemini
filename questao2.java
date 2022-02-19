import java.util.Scanner;

/**
 * Questão 2 resolvida - Desafio de Código - Academia Capgemini
 * Autora: Evelim Bacury Rocha
 */
public class questao2{
    public static void main(String[] args) {
        String senha;

        Scanner in = new Scanner(System.in);
        senha = in.next();

        verificarSenha(senha);
    }

    /**
     * Este método verifica se a senha tem 6 digitos,
     * letra maiúscula e minuscula, digito e caracter especial 
     * e mostra ao usuário quantos requisitos faltam
     * para alcançar uma senha forte.
     */
    public static void verificarSenha(String senha){
        char [] caracteres = new char[senha.length()];
        
        char [] caracterEspecial = {'!','@','#','$','%','^','&','*','(',')','-','+'};
        
        boolean temMaiusculo = false;
        boolean temMinusculo = false;
        boolean temDigito = false;
        boolean temCaracterEspecial = false;
        
        int pontosSenhaFraca = 0;

        if(senha.length()<6){
            System.out.println(6-senha.length());
        }else{
            for(int i = 0; i < senha.length(); i++) {
                caracteres[i] = senha.charAt(i);
                if(Character.isLetter(caracteres[i])){
                    if(Character.isUpperCase(caracteres[i])){
                        temMaiusculo = true;
                    }
                    if(Character.isLowerCase(caracteres[i])){
                        temMinusculo = true;
                    }
                }
                if(Character.isDigit(caracteres[i])){
                    temDigito = true;
                }
                for(int j = 0; j<caracterEspecial.length;j++){
                    if(caracteres[i] == caracterEspecial[j]){
                        temCaracterEspecial = true;
                    }
                }
            }
            if(temMaiusculo == false){
                pontosSenhaFraca ++;
            }
            if(temMinusculo == false){
                pontosSenhaFraca ++;
            }
            if(temDigito == false){
                pontosSenhaFraca ++;
            }
            if(temCaracterEspecial == false){
                pontosSenhaFraca ++;
            }

            if(pontosSenhaFraca == 0){
                System.out.println(pontosSenhaFraca + ". A senha é forte!");
            }else{
                System.out.println(pontosSenhaFraca);
            }
        }
    }
}