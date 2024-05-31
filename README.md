# ULBRA_POO_AP2_exercicios
Resolução de exercícios da disciplina de POO, na ULBRA. Pode ser executada no Reptl [aqui](https://replit.com/@GeovaniLopesLop/ULBRAPOOAP2exercicios) (neessita login e executar um Fork do projeto).

## Interface
A classe principal evoca a classe abstrata OptionScreen que apenas simula uma interface tosca de opções via classe Scanner e um bloco switch-case. Alguns métodos foram modularizados na classe GeneralUtilities para evitar redundância de solicitações iterativas de inpúts e alguns testes.

## Exercício 1, lançamento de dados
A classe Dice possui a constante (de uso privado) "HIGHER_SIDE" definido como 6 segundo exige o exercício. O método de classe privado roll() sorteia um lado conforme o valor máximo do dado, supondo valores sequenciais, através da classe ThreadLocalRandom, conforme orientado [nessa discussão](https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java) do StackOverflow.
Por fim, o método rollThriceSixSideDiceAndSum() exibe três sorteios pela chamada iterativa do método roll e exibe também a soma dos valores sorteados.

## Exercício 2, 12% no preço
A classe PriceSetter atender ao que é pedido pela definição de constante e a função exigida.

## Exercício 3, sorteio de senha
A classe Passkey usa as classes ArrayList e StringBuilder para construir a senha. O randomizador foi adaptado pelo método randomInteger da classe GeneralUtilities.

## Exercício 4, invertedor e removedor de espaços
Atendido pela classe PhraseTrimmerInverter pelo seu uso das classes ArrayList e StringBuilder em iterações invertidas e condicionais.

## Exercício 5, detector de conteúdo impróprio
Atendido pela classe ContentDetector, usa o teste isWordsInPhrase() de GeneralUtilities para checagem. Este método itera condicionalmente sobre uma string com base num array de strings como filtro.

## Exercício 6, invertedor e removedor de espaços
Atendido pela classe CharacterHider, usa simplesmente os métodos substring() e length da classe String para retornar a todo o input, exceto o último caracter pelo comando "input.substring(0, input.length()-1)".

## Exercícios 7 e 8, cálculo de potência e conversão de medida de ângulo
Atendidos pela classe Calculator por métodos separados que aplicam os métodos exigidos da classe Math.
