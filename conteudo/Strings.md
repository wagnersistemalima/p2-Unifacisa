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

* Verifica se uma String está ou não vazia, que baseia-se se sua String possui tamanho = 0 //              nome.isEmpty()  retorna true ou false

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
		System.out.println(nome.isEmpty());

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
## O que acontece toda vez que uma String é modificada?

* Sempre que uma String precisa ser modificada é utilizado mais espaço em memória para que uma nova String seja criada contendo a nova versão dela.

## Explique qual a diferença entre criar uma String das seguintes formas:

* String nome = "Wagner";

* String nome = new String("Wagner");

* Quando criamos uma String por meio do operador new, o compilador Java cria um novo objeto e o armazena no espaço de heap reservado para a JVM. Cada String criada
dessa maneira apontará para uma região de memória diferente com seu próprio endereço, já utilizando a String literal, o Java tentará economizar memória, verificando se já existe um objeto com aquele mesmo conteúdo criado. Em caso positivo, ele reaproveita aquele objeto, atribuindo seu endereço de memória à variável.

## Como a classe StringBuilder pode ajudar a tornar este código mais eficiente?

*  String nome = "Wagner";

*   nome += " Lima";

*   nome += " Braga";	
  
  ```
	  	String nome = "Wagner";
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" Lima Braga.");
		System.out.println(sb);       //  Wagner de Lima braga
  ```


## Explique como funciona o String pool.

* O Java utiliza um mecanismo chamado String interning, colocando as Strings num pool para tentar armazenar apenas uma cópia de cada sequência de caracteres em memória. Em tese, o programa usaria menos memória e seria mais eficiente em decorrência dessa otimização. Quando o Java encontra literais String no código, ele retorna sempre uma mesma instância de String, que aponta para uma entrada no pool interno da JVM. Sendo assim, é bem possível usar o operador == para comparar duas variáveis que recebem literais String, mas não podemos confiar no operador de comparação quando não sabemos como a String foi criada.
