import java.util.Scanner;

public class MenuInicial {
    private String informacoesJogo = "placeholder";
    private String Desenvolvedores = "Lucas Lopes de Oliveira e Alberto Bicalho.";



    public MenuInicial() {
    }

    public String mostrarMenu() {
        System.out.println("Seja bem vindo ao RandonsPlays! Seu jogo de perguntas e respostas!");
        boolean loopControl = true;
        Scanner readLine = new Scanner(System.in);
        String userInput;
        
        do {
            System.out.println("Por favor escolha uma opção:");
            System.out.println("1 - para iniciar a partida.");
            System.out.println("2 - para informações sobre o jogo.");
            System.out.println("3 - para descobrir quem desenvolveu o jogo.");
            System.out.println("4 - para sair do jogo.");
            System.out.print("Sua escolha: ");
            userInput = readLine.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("A partida será iniciada.");
                    loopControl = false;
                    break;
                case "2":
                    mostrarInfoJogo();
                    break;
                case "3":
                    mostrarDesenvolvedores();
                    break;
                case "4":
                    loopControl = false;
                    break;
                default:
                System.out.println("O valor digitado é inválido, por favor digite novamente.");
                    break;
            }
        } while (loopControl == true);
        return userInput;
    }

    public void mostrarInfoJogo() {
        System.out.println("\n" + this.informacoesJogo + "\n");
        System.out.println("Essas são as informações do jogo, retornando para o menu principal. \n");
    }

    public void mostrarDesenvolvedores() {
        System.out.println("\nOs desenvolvedores do programa são " + this.Desenvolvedores + "\n");
        System.out.println("Retornando para o menu principal... \n");
    }
}
