# O que é o padrão de design Observer ?

O padrão Observer é um padrão de projeto de software que é usado para implementar a comunicação entre objetos em um 
sistema. Ele define uma relação de um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os 
objetos dependentes são notificados e atualizados automaticamente.

## Vantagens

- Desacoplamento: o padrão Observer ajuda a manter o baixo acoplamento entre objetos, o que significa que as mudanças em 
um objeto não afetam diretamente outros objetos;

- Flexibilidade: o padrão Observer permite que os objetos observadores sejam adicionados ou removidos dinamicamente sem 
afetar a classe do objeto observado;

- Reutilização: o padrão Observer permite que objetos observadores sejam reutilizados em diferentes classes de objeto 
observado;

## Desvantagens

- Custo de desempenho: o padrão Observer pode ser custoso em termos de desempenho, especialmente quando há muitos 
objetos observadores;

- Complexidade: o padrão Observer pode adicionar complexidade ao código, especialmente se implementado de forma inadequada;

## Quando usar

- Quando você precisa notificar muitos objetos quando um objeto muda de estado;
- Quando você precisa manter um baixo acoplamento entre objetos;
- Quando você precisa adicionar ou remover objetos observadores dinamicamente.
