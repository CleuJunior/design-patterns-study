
# O que é o padrão de design Template Method?

O padrão de projeto Template Method é um padrão comportamental que define o esqueleto de um algoritmo em uma classe base, 
permitindo que as subclasses substituam ou estendam partes do algoritmo sem alterar sua estrutura geral.

## Vantagens

- Reutilização de código: permite que o código seja compartilhado entre várias subclasses que implementam partes 
específicas do algoritmo;

- Redução de duplicação de código: evita a duplicação de código em várias subclasses que implementam partes semelhantes 
do algoritmo;

- Facilidade de manutenção: alterações no algoritmo podem ser feitas em uma única classe base e serão refletidas em todas 
as subclasses que o utilizam;

- Facilidade de extensão: novas subclasses podem ser adicionadas sem afetar o algoritmo existente, desde que implementem 
as partes necessárias do algoritmo.

## Desvantagens

- Complexidade: a criação de uma classe base abstrata para definir o esqueleto do algoritmo pode aumentar a complexidade 
do código;

- Restrição na ordem de execução: como o padrão define uma ordem fixa para a execução do algoritmo, pode ser difícil alterar 
essa ordem sem modificar a classe base;

- Maior tempo de desenvolvimento: a implementação do padrão pode levar mais tempo do que simplesmente escrever o código 
repetitivo em cada classe, especialmente para algoritmos simples.

## Quando usar

O padrão de projeto Template Method é útil quando se tem um algoritmo comum a várias classes, mas com algumas diferenças específicas em cada uma delas. Ele é particularmente útil quando:

- o algoritmo pode ser dividido em partes que são comuns a todas as subclasses e partes que são específicas de cada uma delas;
- as subclasses possuem um comportamento comum, mas diferem na implementação de certas partes do algoritmo.
