
# O que é o padrão de design Strategy?

O padrão de design Strategy é um padrão de design comportamental que permite que você defina uma família de algoritmos, coloque cada um deles em uma classe separada e torne os algoritmos intercambiáveis dentro dessa família. O padrão de design Strategy permite que os algoritmos variem independentemente dos clientes que os usam.

## Vantagens do padrão de design Strategy

- Os algoritmos podem ser trocados facilmente sem modificar o cliente que os utiliza. Isso torna o padrão de design Strategy muito útil para sistemas que precisam suportar múltiplas variações de um algoritmo.

- O padrão de design Strategy promove o princípio da responsabilidade única, onde cada classe é responsável por apenas uma tarefa específica. Isso torna o código mais fácil de entender, manter e estender.

## Desvantagens do padrão de design Strategy

- A implementação do padrão de design Strategy pode aumentar a complexidade do código, especialmente se houver muitas classes de estratégia. Isso pode tornar o código mais difícil de entender e manter.

- A introdução de classes de estratégia adicionais pode levar a uma sobrecarga de memória, já que cada classe de estratégia precisa de uma instância separada.