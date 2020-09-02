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

## Precedência 
Ordem| Operador
---|---
1º lugar|  * / %
2º lugar|  + -

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

## Classe

### É um tipo estruturado que pode conter (membros):

 * Atributos (dados / campos)
 * Métodos (funções / operações)
 
###  A classe também pode prover muitos outros recursos, tais como:

 * Construtores
 * Sobrecarga
 * Encapsulamento
 * Herança
 * Polimorfismo
 
 ### Construtor
 
 * O construtor determina que ações devem ser executadas quando da criação de um objeto é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno. A classe pode ter um construtor padrão, sem argumento, e também um construtor personalizado com argumento.
 
 ### Objeto
 
 * São caracterizados por atributos e métodos, onde os atributos são propriedades do objeto, e os métodos são as ações que um objeto pode realizar. Os objetos são características definidas pelas classes. Neles é permitido instanciar objetos da classe para inicializar os atributos e invocar os métodos.
 
 ```
 package entities;
 
public class Conta {                   // Conta é uma classe

      private String titular;
      private Integer numero;
      private Double saldo;
      
      public Conta() {                             // construtor padrao
      
      }
      
      public Conta(String titular, Integer numero, Double saldo) {          // construtor personalizado
              this.titular = titular;
              this.numero = numero;
              this.saldo = saldo;
      } 
}

Aplicação:

       String titular = "Eduardo";
       int numero = 1020;
       double saldo = 300.0;
       
       Conta conta = new Conta(titular, numero, saldo);                          
 
 ```
* Na memoria a variavel conta vai apontar para o objeto, que é composto por treis atributos

variavel conta ---->  [titular] [numero] [saldo]
