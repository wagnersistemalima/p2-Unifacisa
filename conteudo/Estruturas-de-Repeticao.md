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
