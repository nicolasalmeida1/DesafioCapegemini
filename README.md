# DesafioCapegemini

Para os desafios propostos, procurei utilizar a tecnologia Java para a resolução, visto que seria um diferencial. Essa foi a minha primeira experiência com Java, então provavelmente eu posso ter utilizado alguns comandos ```if``` e ```else``` a mais por desconhecer de algumas funcionalidades 😅

Os arquivos se encontram em ConsoleApp/src

## Desafio "Escada"
Esse desafio consiste em imprimir uma "escada" de asteriscos com os degraus sendo um número ```n``` informado pelo usuário.

Procurei fazer essa "escada" da maneira proposta no exercício, considerando os espaços, para isso, armazenei as informações em uma lista e realizei um loop para imprimir as informações dos itens (inclusive os espaços)

## Desafio da senha
O segundo desafio realizado foi o desafio da senha, onde essa senha:
* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Primeiramente o programa solicita a senha e faz uma varredura para verificar se a senha possui os requisitos e também informa quais requisitos estão faltando na senha.

Para realizar esse desafio procurei seguir a lógica de looping e condicionais, acredito que com mais conhecimento em métodos Java poderia facilmente deixar o código um pouco mais "limpo"

## Desafio Anagrama
Terceiro e último desafio, de longe o mais difícil

Para executá-lo necessita apenas a entrada do usuário com uma palavra e ele fará uma varredura para identificar anagrama e palíndromo

Utilizei ```StringBuffer(palavra).reverse().toString()``` para obter a palavra em questão ao contrário e substrings para mapear e limitar as casas para a comparação, tenho ciência de que ele não está funcionando 100% mas de qualquer forma fiquei feliz com a evolução e o quão próximo cheguei
