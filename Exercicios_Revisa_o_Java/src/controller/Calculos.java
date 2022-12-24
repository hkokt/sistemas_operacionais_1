package controller;

public class Calculos {

	public boolean situacao(double media, String feito) {
		boolean status = false;
		if (feito == "s" && media >= 6) {
			status = true;
		}
		if (feito == "n" && media < 6) {
			status = false;
		}
		return status;
	}

	public double primeiraMedia(String nomeAluno, double p1, double p2, double t) {
		double media = 0;
		media = (p1 * 0.35) + (p2 * 0.35) + (t * 0.30);
		return media;
	}

	public double mediaExame(String nomeAluno, double mediaAluno, double preExame, double notaExame) {
		double media = 0;
		double mediaPre = mediaAluno + preExame;
		if (mediaPre >= 6) {
			media = 6;
		} else {
			media = (mediaPre * 0.5) + (notaExame * 0.5);
			if (media >= 6) {
				media = 6;
			}
		}
		return media;
	}
}
