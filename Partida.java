import java.util.Random;
import java.util.Scanner;

public class Partida {
    
    Personagens silvio = new Personagens("Silvio Santos", true, 100, "Dinheiro, Fama e Carisma");
    Personagens guerreiro = new Personagens("Guerreiro", true, 100, "Força, Brutalidade e Magia");
    Personagens aluno = new Personagens("Aluno Acadêmico", true, 100, "Inteligência, Sono e Força de Vontade");
    Personagens mago = new Personagens("Mago Implacável", true, 100, "Poder, Força e Resistência");
    Personagens estrategista = new Personagens("Mestre Estratégico", true, 100, "Inteligência, Conhecimento e Paciência");

    public Partida() {
    }

    public void cadastrarJogador(Jogador jogador) {
        Scanner readLine = new Scanner(System.in);

        if (jogador.getNome().equals("jogador1")) {
            System.out.println("\nPara começar vamos cadastrar os jogadores.");
        }

        System.out.println("\n" + jogador.getNome() + ", por favor insira seus dados a seguir.");

        System.out.print("Insira seu nome: ");
        jogador.setNome(readLine.nextLine());

        System.out.print("Agora, digite seu apelido: ");
        jogador.setApelido(readLine.nextLine());

        System.out.print("Digite seu e-mail: ");
        jogador.setEmail(readLine.nextLine());

        System.out.print("Por ultimo, digite seu telefone: ");
        jogador.setTelefone(readLine.nextLine());

        System.out.println("\n" + jogador.getNome() + ", seus dados são: " + "Apelido: " + jogador.getApelido() + ", E-mail: " + jogador.getEmail() + " e Telefone: " + jogador.getTelefone() + ".\n");
    }

    public void escolherPersonagem(Jogador jogador) {

        Scanner readLine = new Scanner(System.in);
        String userInput;
        boolean loopControl = true;
        System.out.println("\nHora de escolher os personagens, os personagens disponíveis são:\n");

        if (silvio.getStatus() == true) {
            System.out.println("Personagem: " + silvio.getNome() + ", Habilidades: " + silvio.getHabilidades());
        }
        if (guerreiro.getStatus() == true) {
            System.out.println("Personagem: " + guerreiro.getNome() + ", Habilidades: " + guerreiro.getHabilidades());
        }
        if (aluno.getStatus() == true) {
            System.out.println("Personagem: " + aluno.getNome() + ", Habilidades: " + aluno.getHabilidades());
        }
        if (mago.getStatus() == true) {
            System.out.println("Personagem: " + mago.getNome() + ", Habilidades: " + mago.getHabilidades());
        }
        if (estrategista.getStatus() == true) {
            System.out.println("Personagem: " + estrategista.getNome() + ", Habilidades: " + estrategista.getHabilidades());
        }

        System.out.print("\nDigite o nome do personagem para escolher: ");

        do {
            userInput = readLine.nextLine().toLowerCase();

            switch (userInput) {
                case "silvio santos":
                    silvio.setStatus(false);
                    System.out.println(silvio.getStatus());
                    jogador.setPersonageEscolhido(userInput);
                    loopControl = false;
                    break;
                case "guerreiro":
                    guerreiro.setStatus(false);
                    jogador.setPersonageEscolhido(userInput);
                    loopControl = false;
                    break;
                case "aluno academico":
                    aluno.setStatus(false);
                    jogador.setPersonageEscolhido(userInput);
                    loopControl = false;
                    break;
                case "mago":
                    mago.setStatus(false);
                    jogador.setPersonageEscolhido(userInput);
                    loopControl = false;
                    break;
                case "estrategista":
                    estrategista.setStatus(false);
                    jogador.setPersonageEscolhido(userInput);
                    loopControl = false;
                    break;
                default:
                    System.out.print("Personagem inválido, tente novamente: ");
            }
        } while (loopControl == true);

        System.out.println("\nO jogador " + jogador.getNome() + " escolheu o personagem " + userInput.toUpperCase() + ".\n");

    }

    public void iniciarPartida(Jogador jogador1, Jogador jogador2) {
    }

    public void exibirPergunta() {

    }

}
