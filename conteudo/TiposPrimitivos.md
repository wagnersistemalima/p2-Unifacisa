## Tipos :dragon_face: primitivos em Java 

Descrição | Tipo | Tamanho | Valores | Valor padrão | Intervalo
---|---|---|---|---|---  
1| tipos numéricos inteiros | byte | 8 bits | 0 | -128 a 127
2| tipos numéricos inteitos | short| 16 bits| 0 | -32768 a 32767
3| tipos numéricos inteitos | int  | 32 bits| 0 | -2147483648 a 2147483647
4| tipos numéricos inteitos | long | 64 bits| 0L| -9223372036854770000 a 9223372036854770000                                        
5| tipos numéricos com ponto flutuante | float| 32 bits| 0.0f | -1,4024E-37 a 3,4028E+38
6| tipos numéricos com ponto flutuante | double| 64 bits| 0.0 | -4,94E-307 a 1,79E+308
7| um caractere Unicode | char| 16 bits| '\u0000' | '\u0000' a '\uFFFF'
8| valor verdade | boolean| 1 bit| false | {false, true}

String - cadeia de caracteres (palavras ou textos)

Um bit pode armazenar 2 valores possíveis (0 ou 1)
## Cada bit = 2 possibilidades
8 bits:
2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 = 28 = 256 possibilidades

## Operadores aritméticos

Descrição|Operador|Significado
---|---|---
1| + | Adição
2| -| Subtração
3| * | Multiplicação
4| / | Divisão
5| % | resto da divisão("mod")

## Precedência: 
1º lugar: * / %
2º lugar: + -

## Operadores comparativos

 Descrição| Operador | Significado
 |---|---|---
1| > | maior
2| < | menor
3| >= | maior ou igual
4| <= | menor ou igual
5| == | igual
6| != | diferente

## Operadores lógicos

Descrição| Operador| Significado
|---|---|---
1| && | E
2| II | OU  
3| ! | DIFERENTE

## Operadores de atribuição cumulativa

Descrição| Operador| Significado
|---|---|---
1| a += b;|a = a + b;
2| a -= b;|a = a - b;
3| a *= b;|a = a * b;  
4| a /= b; | a = a / b;
5| a %= b; | a = a % b;

## Expressão condicional ternária
### Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

Sintaxe:

( condição ) ? valor_se_verdadeiro : valor_se_falso;

