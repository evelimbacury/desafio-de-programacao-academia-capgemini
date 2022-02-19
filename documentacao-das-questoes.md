# 📃 Documentação das Questões
Aqui está documentada a explicação de cada questão e como o programa lida com cada uma delas.


## Questão 1 - A Escada de Asterísticos
Nesta questão o usuário deve fornecer um número para ser a base e e altura da escada e o programa vai mostrar a escada montada.
O valor proposto pelo desafio é **6**.

O programa deve mostrar de entrada:
```
n = 6
```
E de saída:
```
     *
    **
   ***
  ****
 *****
******
```
No algoritmo construído o usuário pode entrar com qualquer valor inteiro que a escada será construida.

Se o usuário entrar com zero ou um valor negativo o programa irá imprimir a mensagem "Você entrou com um valor inválido! Por favor insira outro valor."

Ex:

Entrada:
  ```
  n = 0
  ```
Saída:
  ```
  Você entrou com um valor inválido! Por favor insira outro valor.
  ```
  
## Questão 2 - Verificação de Senha Forte
Nesta questão o usuário deve fornecer uma senha e o programa verifica se a senha atende aos requisitos de senha forte que são: 
  - possuir no mínimo 6 dígitos;
  - possuir ao menos uma letra maúscula;
  - possuir ao menos uma letra minúscula; 
  - possuir ao menos um número;
  - possuir ao menos um caracter especial (!@#$%^&*()-+);

O desafio nos pede para ajudar Débora, que deseja construir uma senha forte. Ela entrou com o valor "**Ya3**" e deseja verificar se essa é uma senha forte.
 
 Entrada:
  ```
  Ya3
  ```
O programa identifica que ainda faltam 3 digitos para atingir o primeiro requisisto.
 
 Saída: 
  ```
  3
  ```
Se ela cumprir o primeiro requisito então o programa vai verificar se a senha inserida atende aos outros, e contará quantos não foram atingidos.

Ex:
 
 Entrada: 
  ```
  Yabcde
  ```
 Saída: 
  ```
  2 
  ```
_(falta ter um número e um caractere especial)_.

Se a senha atender todos os requisitos o programa retornará 0 e a mensagem "A senha é forte!"

Ex: 
 
 Entrada: 
  ```
  Ya3&ab
  ```
 Saída: 
  ```
  0. A senha é forte!
  ```


## Questão 3 - Verificação de Anagramas
Nesta questão o usuário deve fornecer uma palavra e o programa vai verificar quantos anagramas existem nela.
O desafio propõe duas palavras: **ovo** e **ifailuhkqq**.

Entrada:
  ```
  ovo
  ```
O programa vai verificar quantos anagramas existem, se possuir mais de um anagrama com as mesmas letras o programa o retira do vetor de anagramas. 

Nesse exemplo o programa vai identificar que, além do anagrama "o", existem dois anagramas com letras iguais "ov" e "vo". Para que não ocupem espaço no vetor, o programa verifica se os dois são iguais após organizá-los em ordem alfabetica e exclue do vetor o primeiro anagrama da ordem. Então em vez de imprimir 3 (o, ov,vo) irá imprimir 2 (o, vo).
 
 Saída:
  ```
  2
  ```
O mesmo acontece com a segunda proposta "ifailuhkqq". 

 Entrada:
  ```
  ifailuhkqq
  ```
São encontrados os anagramas "i", "ifa","fai" e "q", como "ifa" e "fai" possuem as mesmas letra o programa irá excluir a primeira e imprimirá 3 (i, ifa, q).
  ```
  3
  ```