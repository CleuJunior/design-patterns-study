# O que é o padrão de design Chain of Responsibility?

O padrão de design Chain of Responsibility é um padrão comportamental que permite que uma solicitação seja passada por 
uma cadeia de objetos, onde cada objeto na cadeia tem a oportunidade de processar a solicitação ou passá-la adiante para 
o próximo objeto na cadeia.

Esse padrão é útil quando há múltiplos objetos que podem lidar com uma solicitação, mas é desconhecido qual objeto 
exatamente conseguirá lidar com ela. A cadeia de objetos é construída de tal forma que a solicitação percorre cada 
objeto até que seja tratada ou até que a cadeia, seja completamente percorrida sem encontrar um objeto capaz de lidar 
com ela.

## Vantagens

- **Desacoplamento**:O padrão Chain of Responsibility promove o desacoplamento entre o remetente da solicitação e os 
objetos que a processam. O remetente não precisa conhecer os detalhes de implementação dos objetos na cadeia, aumentando 
a flexibilidade e a manutenibilidade do código.;

- **Adicionando novos objetos na cadeia**: O padrão facilita a adição de novos objetos na cadeia. É possível estender a 
cadeia existente adicionando novos objetos sem afetar o código existente, desde que o novo objeto concorde com a 
interface comum da cadeia;

- **Flexibilidade na manipulação de solicitações**: Cada objeto na cadeia consegue manipular a solicitação de 
forma personalizada. Isso permite diferentes combinações e ordens de processamento de solicitações, tornando o padrão 
Chain of Responsibility altamente flexível.

## Desvantagens

- **Risco de solicitações não serem tratadas**: se a cadeia não for configurada corretamente ou se nenhum objeto na 
cadeia conseguir lidar com a solicitação, pode ocorrer o risco de a solicitação não ser tratada. É importante projetar 
cuidadosamente a cadeia e garantir que todas as possibilidades sejam consideradas;

- **Possibilidade de impacto no desempenho**: Dependendo do número de objetos na cadeia e da complexidade do processamento 
de cada objeto, pode haver um impacto no desempenho do sistema. É importante considerar a eficiência e otimização ao 
usar o padrão Chain of Responsibility.

## Quando usar

O padrão Chain of Responsibility é adequado nas seguintes situações:

- Quando há múltiplos objetos que podem lidar com uma solicitação e a escolha do objeto exato só pode ser feita em tempo de execução.
- Quando o conjunto de objetos capazes de lidar com a solicitação e a ordem de processamento podem variar dinamicamente.
- Quando é necessário evitar o acoplamento entre o remetente da solicitação e os objetos que a processam.
- Quando se deseja permitir que diferentes combinações e configurações de objetos lidem com solicitações de forma flexível.

O padrão Chain of Responsibility é comumente usado em cenários como tratamento de eventos, pipelines de processamento, 
validação de entrada e manipulação de solicitações em frameworks web.