Introdução à Lógica de Programação com Java
Lista de Exercícios 01
Orientações
Desenvolva cada exercício em um programa Java separado.

Utilize somente:

variáveis;
tipos primitivos, como int e double;
entrada de dados com Scanner;
saída de dados com System.out.println;
operadores aritméticos: +, -, *, / e %;
conversão entre tipos, quando necessário.
Não utilize:

if, else ou operador ternário;
switch;
for, while ou do-while;
vetores, matrizes ou coleções;
métodos criados pelo aluno;
classes além da classe principal e do Scanner.
Não é necessário validar os valores informados pelo usuário.

Parte 1 — Variáveis e operações básicas
1. Antecessor e sucessor
Solicite ao usuário um número inteiro. Calcule e mostre:

o número antecessor;
o número informado;
o número sucessor.
2. Dobro, triplo e metade
Solicite ao usuário um número real. Calcule e mostre:

o dobro do número;
o triplo do número;
a metade do número.
3. Quatro operações
Solicite ao usuário dois números reais. Calcule e mostre:

a soma;
a subtração do primeiro pelo segundo;
a multiplicação;
a divisão do primeiro pelo segundo.
Considere que o segundo número sempre será diferente de zero.

4. Quadrado e cubo
Solicite ao usuário um número inteiro. Calcule e mostre:

o número elevado ao quadrado;
o número elevado ao cubo.
Para manter o exercício dentro do conteúdo estudado, realize os cálculos utilizando multiplicações.

5. Soma dos algarismos
Solicite ao usuário um número inteiro positivo de três algarismos.

Calcule e mostre a soma dos três algarismos.

Exemplo:

Número informado: 527
Soma dos algarismos: 14
Utilize divisão inteira e o operador de resto da divisão %.

6. Inversão de dois algarismos
Solicite ao usuário um número inteiro positivo de dois algarismos. Calcule e mostre o número com os algarismos invertidos.

Exemplo:

Número informado: 42
Número invertido: 24
Parte 2 — Médias e porcentagens
7. Média de três notas
Solicite ao usuário três notas reais. Calcule e mostre a média aritmética das notas.

Não é necessário informar se o aluno foi aprovado ou reprovado.

8. Média ponderada
Solicite ao usuário três notas. Considere os seguintes pesos:

primeira nota: peso 2;
segunda nota: peso 3;
terceira nota: peso 5.
Calcule e mostre a média ponderada.

A fórmula é:

media = (nota1 × 2 + nota2 × 3 + nota3 × 5) ÷ 10
9. Acréscimo percentual
Solicite ao usuário:

o valor de um produto;
o percentual de acréscimo.
Calcule e mostre:

o valor do acréscimo;
o valor final do produto.
Exemplo: um produto de R$ 100,00 com acréscimo de 15% terá valor final de R$ 115,00.

10. Desconto percentual
Solicite ao usuário:

o valor original de uma compra;
o percentual de desconto.
Calcule e mostre:

o valor do desconto;
o valor final da compra.
11. Comissão de venda
Solicite ao usuário:

o valor total vendido por um funcionário;
o percentual de comissão recebido.
Calcule e mostre o valor da comissão.

12. Reajuste salarial
Solicite ao usuário:

o salário atual de um funcionário;
o percentual de reajuste.
Calcule e mostre:

o valor do reajuste;
o novo salário.
Parte 3 — Geometria
13. Área e perímetro de um retângulo
Solicite ao usuário a largura e a altura de um retângulo. Calcule e mostre:

a área;
o perímetro.
Fórmulas:

area = largura × altura
perimetro = 2 × largura + 2 × altura
14. Área de um triângulo
Solicite ao usuário a base e a altura de um triângulo. Calcule e mostre sua área.

Fórmula:

area = base × altura ÷ 2
15. Área de um círculo
Solicite ao usuário o raio de um círculo. Calcule e mostre sua área.

Utilize 3.14159 como valor de π.

Fórmula:

area = π × raio × raio
16. Comprimento de uma circunferência
Solicite ao usuário o raio de uma circunferência. Calcule e mostre seu comprimento.

Utilize 3.14159 como valor de π.

Fórmula:

comprimento = 2 × π × raio
17. Área total de uma sala
Uma sala retangular possui uma porta, também retangular. Solicite ao usuário:

a largura da parede;
a altura da parede;
a largura da porta;
a altura da porta.
Calcule e mostre a área da parede que poderá ser pintada, desconsiderando a área ocupada pela porta.

Parte 4 — Conversões
18. Metros para centímetros e milímetros
Solicite ao usuário uma medida em metros. Converta e mostre essa medida em:

centímetros;
milímetros.
Considere:

1 metro = 100 centímetros
1 metro = 1000 milímetros
19. Quilômetros para metros
Solicite ao usuário uma distância em quilômetros. Converta e mostre a distância em metros.

Considere:

1 quilômetro = 1000 metros
20. Celsius para Fahrenheit
Solicite ao usuário uma temperatura em graus Celsius. Converta e mostre a temperatura em graus Fahrenheit.

Fórmula:

fahrenheit = celsius × 9 ÷ 5 + 32
Utilize números reais no cálculo para evitar problemas com a divisão inteira.

21. Fahrenheit para Celsius
Solicite ao usuário uma temperatura em graus Fahrenheit. Converta e mostre a temperatura em graus Celsius.

Fórmula:

celsius = (fahrenheit - 32) × 5 ÷ 9
22. Velocidade em metros por segundo
Solicite ao usuário uma velocidade em quilômetros por hora. Converta e mostre a velocidade em metros por segundo.

Fórmula:

velocidadeEmMetrosPorSegundo = velocidadeEmQuilometrosPorHora ÷ 3.6
Parte 5 — Situações cotidianas
23. Divisão de uma conta
Solicite ao usuário:

o valor total de uma conta;
a quantidade de pessoas que dividirão a conta.
Calcule e mostre quanto cada pessoa deverá pagar.

Considere que a quantidade de pessoas sempre será maior que zero.

24. Conta com gorjeta
Solicite ao usuário:

o valor consumido em um restaurante;
o percentual de gorjeta.
Calcule e mostre:

o valor da gorjeta;
o valor total da conta;
o valor que cada pessoa deverá pagar, considerando que a conta será dividida igualmente entre quatro pessoas.
25. Consumo médio de combustível
Solicite ao usuário:

a distância percorrida por um veículo, em quilômetros;
a quantidade de combustível consumida, em litros.
Calcule e mostre o consumo médio do veículo em quilômetros por litro.

Fórmula:

consumoMedio = distanciaPercorrida ÷ litrosConsumidos
26. Custo de uma viagem
Solicite ao usuário:

a distância da viagem em quilômetros;
o consumo médio do veículo em quilômetros por litro;
o preço do litro do combustível.
Calcule e mostre:

a quantidade estimada de combustível necessária;
o custo estimado da viagem.
27. Tempo de viagem
Solicite ao usuário:

a distância de uma viagem em quilômetros;
a velocidade média em quilômetros por hora.
Calcule e mostre o tempo estimado da viagem em horas.

Fórmula:

tempo = distancia ÷ velocidade
28. Salário por horas trabalhadas
Solicite ao usuário:

a quantidade de horas trabalhadas no mês;
o valor recebido por hora.
Calcule e mostre o salário bruto do funcionário.

29. Compra de combustível
Solicite ao usuário:

o preço do litro do combustível;
o valor que será utilizado para abastecer.
Calcule e mostre quantos litros de combustível poderão ser comprados.

30. Quantidade de carne para churrasco
Solicite ao usuário:

a quantidade de homens;
a quantidade de mulheres;
a quantidade de crianças.
Considere o seguinte consumo médio:

Homem: 400 gramas
Mulher: 320 gramas
Criança: 200 gramas
Calcule e mostre:

a quantidade total de carne em gramas;
a quantidade total de carne em quilogramas.
Parte 6 — Divisão inteira e resto da divisão
31. Conversão de minutos
Solicite ao usuário uma quantidade inteira de minutos. Calcule e mostre:

a quantidade de horas completas;
a quantidade de minutos restantes.
Exemplo:

Minutos informados: 135
Horas: 2
Minutos restantes: 15
32. Conversão de segundos
Solicite ao usuário uma quantidade inteira de segundos. Calcule e mostre o tempo no formato:

horas:minutos:segundos
Exemplo:

Segundos informados: 3725
Resultado: 1:2:5
Utilize divisão inteira e o operador %.

33. Conversão de dias
Solicite ao usuário uma quantidade inteira de dias. Calcule e mostre:

a quantidade de semanas completas;
a quantidade de dias restantes.
Considere que uma semana possui sete dias.

34. Idade aproximada em dias
Solicite ao usuário:

a quantidade de anos completos;
a quantidade de meses completos;
a quantidade de dias adicionais.
Calcule a idade aproximada da pessoa em dias.

Considere:

1 ano = 365 dias
1 mês = 30 dias
35. Distribuição de itens
Solicite ao usuário:

a quantidade total de itens;
a quantidade de pessoas.
Calcule e mostre:

quantos itens cada pessoa receberá;
quantos itens restarão sem distribuição.
Considere que a quantidade de pessoas será maior que zero.

36. Decomposição de um valor em cédulas
Solicite ao usuário um valor inteiro em reais. Calcule quantas cédulas de cada valor seriam necessárias para representar o valor informado.

Utilize cédulas de:

R$ 100
R$ 50
R$ 20
R$ 10
R$ 5
R$ 2
R$ 1
Exemplo:

Valor informado: R$ 187

Cédulas de R$ 100: 1
Cédulas de R$ 50: 1
Cédulas de R$ 20: 1
Cédulas de R$ 10: 1
Cédulas de R$ 5: 1
Cédulas de R$ 2: 1
Cédulas de R$ 1: 0
Resolva utilizando somente divisões inteiras e o operador de resto da divisão.