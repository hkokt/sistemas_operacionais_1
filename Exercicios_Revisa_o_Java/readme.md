Exercícios Revisão Java
1) Considere o critério de avaliação da disciplina Sistemas Operacionais I, dado abaixo.
A partir dele, faça uma aplicação em Java, no Eclipse, onde deve se fazer uma classe Calculos.java, no package controller:
- A classe Calculos.java deve ter um método denominado primeiraMedia que deverá receber como parâmetros o nome do aluno (String) e as notas P1, P2 e T (Double), dando como retorno a média calculada (Double).
- Ainda na classe Calculos.java, deve ter um método situacao, que deve receber a média do aluno (double) e se já fez os exames (boolean).
- Se ainda não fez o exame, a situação poderá ser Aprovado, Exame ou Reprovado;
- Se já fez o exame, a situação poderá ser Aprovado ou Reprovado;
- Por fim, criar, na classe Calculos.java, um método mediaExame, que deverá receber o nome do Aluno (String), a media do aluno (Double), a nota de Pré-Exame (Double) e a nota do Exame* (Double) e retornar a média final com exame.
A aplicação deve ter uma classe Principal.java, no package view, que, no main deve ter um JOptionPane que faça o usuário escolher: (1- Primeira Média, 2 - Situação, 3 – Média Exame, 0 - Sair). Instanciar a classe Calculos.java.
Fazer um Switch .. Case e, para cada opção, chamar o método relacionado, ler os dados com JOptionPane, passar os dados para os métodos e exibir, também por JOptionPane a saída do método.