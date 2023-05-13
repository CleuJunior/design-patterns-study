
# O que é o padrão de design Builder?

O padrão de design Builder é um padrão de criação que permite construir objetos complexos passo a passo. Ele permite que 
você crie diferentes tipos e representações de um objeto, enquanto evita a complexidade de criar uma classe com muitos 
construtores e parâmetros.

O padrão Builder é geralmente utilizado quando é necessário criar objetos complexos com muitos campos, especialmente 
quando esses campos têm valores padrão diferente ou opcionais.

## Vantagens

- **Flexibilidade**: O padrão Builder permite que você crie diferentes tipos de objetos com o mesmo processo de construção;

- **Controle**: O padrão Builder oferece um controle mais granular sobre o processo de construção do objeto;

- **Legibilidade**: O padrão Builder torna o código mais legível e fácil de entender, pois cada etapa do processo de 
construção é explicitamente declarada no código.

## Desvantagens

- **Complexidade**: O padrão Builder pode adicionar complexidade ao código, especialmente quando há muitos campos no 
objeto sendo construído;

- **Custo**: O padrão Builder pode aumentar o custo de desenvolvimento, pois é necessário criar uma classe de construtor 
separada para cada tipo de objeto sendo construído;

- **Performance**: O padrão Builder pode ter impacto na performance do aplicativo, especialmente quando o objeto sendo 
construído é grande e complexo.

## Quando usar

O padrão Builder é mais adequado quando você precisa criar objetos complexos com muitos campos, especialmente quando 
esses campos têm valores padrão diferente ou opcionais. Ele também é útil quando você precisa criar diferentes tipos de 
objetos usando o mesmo processo de construção. O padrão Builder é geralmente usado em conjunto com o padrão de design 
Fluent Interface, que permite que você crie uma ‘interface’ mais legível para o processo de construção do objeto.

- **Criação de objetos imutáveis**: O padrão Builder é uma boa escolha quando você precisa criar objetos imutáveis com muitos 
campos, como objetos de transferência de dados (DTOs). Nesse caso, o construtor do objeto pode receber todos os campos 
como parâmetros, mas isso pode ser confuso e propenso a erros. Com o padrão Builder, você pode fornecer um conjunto de 
métodos para definir os campos do objeto, garantindo que eles sejam definidos corretamente e criando um objeto imutável 
no final do processo.

------------------------------------------------------------------------------------------------------------------------

- **Criação de objetos com valores padrão complexos**: Quando você precisa criar objetos com valores padrão complexos, o 
padrão Builder pode ser uma alternativa mais clara e segura do que o uso de construtores com muitos parâmetros. O processo 
de construção do objeto é dividido em etapas claras, permitindo que você verifique se todos os campos foram preenchidos 
corretamente antes de construir o objeto final.

------------------------------------------------------------------------------------------------------------------------

- **Criação de objetos que exigem validação de entrada**: O padrão Builder é útil quando você precisa validar a entrada do 
usuário antes de criar um objeto. Com o padrão Builder, você pode verificar a entrada do usuário em cada etapa do processo 
de construção e lançar uma exceção se algum valor for inválido. Isso ajuda a garantir que o objeto final seja criado 
corretamente e que os erros sejam detectados cedo no processo de construção.
