# Strategy
## Objetivo
Definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
## Motivação
Um algoritmo usa dados dos quais os clientes não deveriam ter conhecimento. Use o padrão strategy para evitar a exposição das estruturas de dados complexas, específicas do algoritmo.
## Aplicabilidade
Muitas classes relacionadas diferem somente no seu comportamento. As estratégias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos.
Você necessita de variantes de um algoritmo. Por exemplo, pode definir algoritmos que refletem diferentes soluções de compromisso entre espaço/tempo.
Uma classe define muitos comportamentos e aparecem em suas operações como múltiplos comandos condicionais da linguagem. Em vez de usar muitos comandos condicionais, mova os ramos condicionais relacionados para sua própria classe strategy.
## Estrutura 
![Strategy](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoStrategy/PadraoStrategy1.jpg)
## Participantes
Strategy: É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. O Contexto usa essa interface para chamar uma das subclasses ConcreteStrategy ou um dos algoritmos definidos.
ConcreteStrategy: A classe concreta que herda da Strategy abstrata está definida como as subclasses ConcreteStrategyA, ConcreteStrategyB e ConcreteStrategyA no diagrama da figura 1.
Context: É aquele que vai acessar um dos algoritmos das subclasses de interface Strategy.

## Exemplo de implmentação
https://github.com/gustavokiyatake/Strategy/tree/main/Strategy-Pattern/src
