package view;

import javax.swing.JOptionPane;

import controller.Calculos;

public class Principal {
	public static void main(String args[]) {
		Calculos calculo = new Calculos();

		String nome = "";
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double preP3 = 0;
		double media = 0;
		double t = 0;
		String resposta = "";
		String fez = "";
		double mediaFinal = 0;

		int opcaoTela = 0;
		while (opcaoTela != 9) {
			opcaoTela = Integer.parseInt(JOptionPane
					.showInputDialog("1- Primeira Média" + "\n2 - Situação" + "\nMédia Exame" + "\n0 - Sair"));
			switch (opcaoTela) {
				case 1:
					nome = JOptionPane.showInputDialog("Nome do aluno:");
					p1 = Double.parseDouble(JOptionPane.showInputDialog("Nota p1:"));
					p2 = Double.parseDouble(JOptionPane.showInputDialog("Nota p2:"));
					t = Double.parseDouble(JOptionPane.showInputDialog("Nota trabalho semestral:"));

					mediaFinal = calculo.primeiraMedia(nome, p1, p2, t);

					resposta = "A nota do aluno " + nome + " foi de " + mediaFinal;

					JOptionPane.showMessageDialog(null, resposta);
					break;

				case 2:
					nome = JOptionPane.showInputDialog("Nome do aluno:");
					media = Double.parseDouble(JOptionPane.showInputDialog("Média:"));
					fez = JOptionPane.showInputDialog("O aluno fez as avaliações?\n Sim/Não (s/n)");

					if (calculo.situacao(mediaFinal, fez)) {
						resposta = "O aluno " + nome + " está aprovado";
					} else {
						resposta = "O aluno " + nome + " está reprovado";
					}

					JOptionPane.showMessageDialog(null, resposta);
					break;

				case 3:
					nome = JOptionPane.showInputDialog("Nome do aluno:");
					media = Double.parseDouble(JOptionPane.showInputDialog("Média:"));
					preP3 = Double.parseDouble(JOptionPane.showInputDialog("Pré-p3:"));
					p3 = Double.parseDouble(JOptionPane.showInputDialog("Exame:"));

					mediaFinal = calculo.mediaExame(nome, preP3, media, p3);
					resposta = "Nome do aluno " + nome + "a media final do aluno é " + mediaFinal;

					JOptionPane.showMessageDialog(null, resposta);
					break;

				case 0:
					System.exit(0);
					break;
			}

		}

	}

}
