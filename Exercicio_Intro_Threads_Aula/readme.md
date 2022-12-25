Para melhor visualização das técnicas em programação Java, considere o seguinte cenário:
É sabido que System.currentTimeMillis() retorna um long com o horário atual do sistema em milissegundos.
Criar uma classe Thread (controller.ThreadBuffer.java) que em 32768 iterações de um laço for, inclui um caracter (por iteração) em um StringBuffer.
Criar uma classe Thread (controller.ThreadString.java) que em 32768 iterações de um laço for, concatenar um caracter (por iteração) em um String.
A saída em console das 2 threads deve ser o tempo que se levou para concluir o laço (em ms).
Criar uma classe (view.Principal.java), cujo método main() instancie e inicialize as 2 threads.