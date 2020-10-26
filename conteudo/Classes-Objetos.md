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
