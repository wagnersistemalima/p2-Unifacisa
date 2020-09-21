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

## Estrutura condicional:
* É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição
* Sintaxe da estrutura condicional simples.

```
if ( <condição> ) {      // se a condição for verdadeira, executa o bloco de comandos, se for falsa pula o bloco de comandos
    <comando 1>
     <comando 2>
}
```
* Composta:
```
if ( <condição> ) {     // se a condição for verdadeira, executa só o bloco if.
   <comando 1>
   <comando 2>
}
else {                        // se a condição for falsa, executa só o bloco else
   <comando 3>
   <comando 4>
}
```
* Encadeamento de estruturas condicionais
```
if ( condição 1 ) {
   comando 1
   comando 2
}
else if ( condição 2 ) {
   comando 3
   comando 4
}
else if ( condição 3 ) {
   comando 5
   comando 6
}
else {
  comando 7
  comando 8
}
```
## Sintaxe opcional: estrutura switch-case
* Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.
```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       String dia;
       switch (x) {
      case 1:
           dia = "domingo";
           break;
      case 2:
           dia = "segunda";
           break;
      case 3:
          dia = "terca";
          break;
      case 4:
          dia = "quarta";
          break;
      case 5:
          dia = "quinta";
          break;
       case 6:
          dia = "sexta";
          break;
      case 7:
          dia = "sabado";
          break;
       default:
          dia = "valor invalido";
          break;
    }
    System.out.println("Dia da semana: " + dia);
    sc.close();
  }
}
```
## Expressão condicional ternária
* Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

* Sintaxe:
* ( condição ) ? valor_se_verdadeiro : valor_se_falso
```
 double preco = 34.5;
 double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```
## Estrutura repetitiva "enquanto" (while)
* É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
* Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.
* Sintaxe / regra
```
while ( condição ) {                             // Se a condição for verdadeira ele executa e volta
    comando 1                                    // Se for falsa ele pula fora
    comando 2
}
```
## Estrutura repetitiva (for)
* É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
* Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
* Essa estrutura é ótima para se fazer uma repetição baseada em uma contagem: (progressiva ou regressiva)
```
for ( início ; condição ; incremento) {          // inicio: Executa somente na primeira vez
      comando 1                                            // condição: Se for verdadeira, executa e volta, se falsa pula fora
      comando 2                                            // incremento: Executa toda vez depois de voltar
}
```
## Estrutura repetitiva "faça-enquanto" do (while)
* Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
* O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
* Sintaxe / regra
```
do {                                          // se a condição for verdadeira ele volta, se for falsa pula fora.
   comando 1
   comando 2
} while ( condição );

```

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

## Resumo sobre Encapsulamento

* Encapsulamento é o processo de esconder todos os detalhes de um objeto que não contribuem para as suas características essenciais.

* Uma vez que o objeto é encapsulado, seus detalhes de implementação não são mais imediatamente acessíveis. Ao invés disso, eles são empacotados e são somente indiretamente acessíveis através da interface do objeto.

* Os Benefícios do Encapsulamento:

* Modularidade: o código-fonte para um objeto pode ser escrito e mantido independentemente do código-fonte de outros objetos (desacoplamento). Além disso, como não dependem de outros objetos, cada objeto pode ser utilizado livremente no sistema. Por exemplo, você pode dar sua bicicleta a alguém e mesmo assim ela funcionará.O objeto bicicleta deve ser independente dos objetos que a utilizam (objetos ciclistas).

* Ocultação de informações: um objeto possui uma interface pública que outros objetos podem utilizar para comunicarem-se com ele. Mas o objeto pode manter informações privadas e métodos podem ser modificados em qualquer momento sem afetar os outros objetos que dependem dele. Por exemplo, você não precisa de entender o funcionamento interno do mecanismo de marchas da sua bicicleta para utilizá-lo.

## Modificadores de acesso:

* private: o membro só pode ser acessado na própia classe

* (nada): o membro só pode ser acessado nas classes do mesmo pacote

* protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes

* public: o membro é acessado por todas as classes(ao menos que ele resida em modulo diferente que não exporte o pacote onde ele está)

## Resumo sobre String:

*  string não é um tipo de dado, ou um tipo primitivo, mas sim uma classe. E suas variáveis são, na verdade, objetos dessa classe. Os objetos desta classe são imutáveis, ou seja, uma vez instanciados não podemos mudar o que está guardado dentro do objeto String.

* Objetos Strings podem ser instanciadas usando new construtor da classe, ou por meio de uma string literal. String literal é qualquer sequência de
caracteres que estiver entre aspas (").

```
String nome = new String("Wagner Lima");   // usando construtor da classe

String nome1 = "Wagner Braga";            // usando string literal.
```
* Instanciar uma String sem a palavra reservada new, o Java tentará economizar memória, verificando se já existe um objeto com aquele mesmo conteúdo criado. Em caso positivo, ele reaproveita aquele objeto, atribuindo seu endereço de memória à variável. Por outro lado, sempre que uma String for criada usando explicitamente a palavra reservada new, então independente de já haver um objeto String com aquele conteúdo criado, a JVM criará um novo objeto.

*  Possibilidades oferecidas pela classe String podemos destacar algumas como:

* Tamanho da String; nome.length();  retorna 11

* Converter para maiúsuculas ou minúsculas;  nome.toUpperCase();   /  nome.toLowerCase();

* Fazer comparações que incluem verificações; nome.equals(nome1);   false

* Extrair um caracter específico da string; nome.substring(1, 11); / recorta a primeira letra W deixando ate a posicao 11.

* Achar um índice da string, inclusive recursivamente (de trás para frente); nome.indexOf("a"); retorna a posição do a=1 / nome.lastIndexOf("a"); retorna a posição a=10
de traz para frente.

* Substituir uma parte da string ou ela completamente; nome.replace("W", "V");  Vagner Lima. ou nome.replace("Wagner", "Marina"); Marina Lima

```
package application;

public class Program {

	public static void main(String[] args) {
		
		String nome = new String("Wagner Lima");
		String nome1 = "Wagner Braga";
		System.out.println(nome1);
		
		System.out.println(nome.length());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.equals(nome1));
		System.out.println(nome.substring(1, nome.length()));
		System.out.println(nome.indexOf("a"));
		System.out.println(nome.lastIndexOf("a"));
		System.out.println(nome.replace("W", "V"));
		System.out.println(nome.replace("Wagner", "Marina"));

	}

}
```

## String pool

*  A região de memória especial em que Strings são armazenadas pela JVM

### Concatenação

* Concatenação nada mais é do que juntar strings numa só. Isto pode ser feito de duas formas: uma usando o método concat() da classe String ou usando o sinal
de adição (+) como operador de concatenação. De uma forma mais simples, podemos usar o + para juntar várias strings ao mesmo tempo.

## StringBuilder

* Se você precisar economizar espaço de memória, StringBuilder é a solução. Objetos de StringBuilder são mutáveis, e nesse caso, sempre que você alterar um StringBuilder, nenhum objeto adicional precisa ser criado.

```
package application;

public class Program {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("estou ");
		builder.append("concatenando ");
		builder.append("strings");
		System.out.println(builder.toString());  // estou concatenando strings

	}

}

```
