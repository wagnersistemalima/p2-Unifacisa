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

