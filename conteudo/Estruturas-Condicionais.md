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
