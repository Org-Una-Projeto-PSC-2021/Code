import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Partida {

    private int firstPlayer;
    private ArrayList<Personagens> personagensCriados = new ArrayList<>(Arrays.asList(new Personagens("Silvio Santos", true, 100, "Dinheiro, Fama e Carisma"), new Personagens("Guerreiro", true, 100, "Força, Brutalidade e Magia"), new Personagens("Aluno Acadêmico", true, 100, "Inteligência, Sono e Força de Vontade"), new Personagens("Mago Implacável", true, 100, "Poder, Força e Resistência"), new Personagens("Estrategista", true, 100, "Inteligência, Conhecimento e Paciência")));

    private Pergunta criarPerguntas = new Pergunta();
    private Alternativa criarAlternativas = new Alternativa();

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

        for (int i = 0; i < personagensCriados.size(); i++) {
            if(personagensCriados.get(i).getStatus() == true) {
                System.out.println("Personagem: " + personagensCriados.get(i).getNome() + ", Habilidades: " + personagensCriados.get(i).getHabilidades());
            }
        }

        System.out.print("\nDigite o nome do personagem para escolher: ");

        do {
            userInput = readLine.nextLine().toLowerCase();

            switch (userInput) {
                case "silvio santos":
                    personagensCriados.get(0).setStatus(false);
                    jogador.setPersonageEscolhido(0);
                    loopControl = false;
                    break;
                case "guerreiro":
                    personagensCriados.get(1).setStatus(false);
                    jogador.setPersonageEscolhido(1);
                    loopControl = false;
                    break;
                case "aluno academico":
                    personagensCriados.get(2).setStatus(false);
                    jogador.setPersonageEscolhido(2);
                    loopControl = false;
                    break;
                case "mago implacavel":
                    personagensCriados.get(3).setStatus(false);
                    jogador.setPersonageEscolhido(3);
                    loopControl = false;
                    break;
                case "estrategista":
                    personagensCriados.get(4).setStatus(false);
                    jogador.setPersonageEscolhido(4);
                    loopControl = false;
                    break;
                default:
                    System.out.print("Personagem inválido, tente novamente: ");
            }
        } while (loopControl == true);

        System.out.println("\nO jogador " + jogador.getNome() + " escolheu o personagem " + userInput.toUpperCase() + ".\n");

    }

    public void iniciarPartida(Jogador jogador1, Jogador jogador2) {

        Random generator = new Random();
        String userAnswer;
        Scanner readLine = new Scanner(System.in);
        Boolean loopControl = true;
        int perguntaEscolhida = generator.nextInt(13);
        int checkPlayer1Life = 100;
        int checkPlayer2Life = 100;

        criarPerguntas.addPerguntas("Quando o Brasil foi descoberto? ");
        criarAlternativas.addAlternativa("1500");
        criarPerguntas.addPerguntas("Qual a obra de arte mais famosa do mundo? ");
        criarAlternativas.addAlternativa("Monalisa");
        criarPerguntas.addPerguntas("Qual a capital da Rússia?");
        criarAlternativas.addAlternativa("Moscou");
        criarPerguntas.addPerguntas("Qual o símbolo do chumbo na tabela periódica?");
        criarAlternativas.addAlternativa("Pb");
        criarPerguntas.addPerguntas("Em qual região fica localizado o Espírito Santo?");
        criarAlternativas.addAlternativa("Sudeste");
        criarPerguntas.addPerguntas("As margens de qual rio Pedro 1º proclamou a independência do Brasil?");
        criarAlternativas.addAlternativa("Rio Ipiranga");
        criarPerguntas.addPerguntas("Qual a obra mais famosa de Van Gogh?");
        criarAlternativas.addAlternativa("O comedor de batatas");
        criarPerguntas.addPerguntas("Em que ano o Michael Jackson morreu?");
        criarAlternativas.addAlternativa("2009");
        criarPerguntas.addPerguntas("Qual é a décima sexta letra do alfabeto?");
        criarAlternativas.addAlternativa("P");
        criarPerguntas.addPerguntas("Qual é o nome do macho da cabra?");
        criarAlternativas.addAlternativa("Bode");
        criarPerguntas.addPerguntas("Você tem 36 laranjas e joga um terço fora, com quantas você fica?");
        criarAlternativas.addAlternativa("24");
        criarPerguntas.addPerguntas("Em qual país fica Machu Picchu?");
        criarAlternativas.addAlternativa("Peru");
        criarPerguntas.addPerguntas("Qual é o nome do maior osso do corpo humano?");
        criarAlternativas.addAlternativa("Fêmur");
        criarPerguntas.addPerguntas("Quantos dias tem um ano bissexto?");
        criarAlternativas.addAlternativa("366");
        
        System.out.println("Iremos utilizar seu apelido a partir de agora.");
        System.out.println("\nAgora iremos começar o jogo!");
        System.out.println("\nEscolhendo qual jogador começa...");

        if (generator.nextInt(1) == 1) {
            firstPlayer = 1;
            System.out.println("\nO jogador " + jogador1.getApelido() + " irá começar primeiro!! \n");
            System.out.println("\nA pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
            System.out.print("Digite sua resposta: ");
            userAnswer = readLine.nextLine();
            checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador1.getPersonageEscolhido()));

        }else {
            firstPlayer = 2;
            System.out.println("\nO jogador " + jogador2.getApelido() + " irá começar primeiro!!");
            System.out.println("\nA pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
            System.out.print("Digite sua resposta: ");
            userAnswer = readLine.nextLine();
            checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador2.getPersonageEscolhido()));
        }


        if (firstPlayer == 1) {
    
            while (loopControl) {
                perguntaEscolhida = generator.nextInt(13);
                System.out.println("\nAgora é a vez do jogador " + jogador1.getApelido());
                System.out.println("A próxima pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
                System.out.print("Digite sua resposta: ");
                userAnswer = readLine.nextLine();
                checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador1.getPersonageEscolhido()));
    
                System.out.println("\nAgora é a vez do jogador " + jogador2.getApelido());
                System.out.println("A próxima pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
                System.out.print("Digite sua resposta: ");
                userAnswer = readLine.nextLine();
                checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador2.getPersonageEscolhido()));

                checkPlayer1Life = personagensCriados.get(jogador1.getPersonageEscolhido()).getVida();
                checkPlayer2Life = personagensCriados.get(jogador2.getPersonageEscolhido()).getVida();
                
                if (checkPlayer1Life == 0 || checkPlayer2Life == 0) {
                    loopControl = false;
                }
            }
            
        }else {

            while (loopControl) {
                perguntaEscolhida = generator.nextInt(13);
                System.out.println("\nAgora é a vez do jogador " + jogador1.getApelido());
                System.out.println("\nA próxima pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
                System.out.print("Digite sua resposta: ");
                userAnswer = readLine.nextLine();
                checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador1.getPersonageEscolhido()));  
    
                System.out.println("\nAgora é a vez do jogador " + jogador2.getApelido());
                System.out.println("\nA próxima pergunta é: " + criarPerguntas.getPergunta(perguntaEscolhida) + "\n");
                System.out.print("Digite sua resposta: ");
                userAnswer = readLine.nextLine();
                checarResposta(userAnswer, perguntaEscolhida, personagensCriados.get(jogador2.getPersonageEscolhido()));
                
                checkPlayer1Life = personagensCriados.get(jogador1.getPersonageEscolhido()).getVida();
                checkPlayer2Life = personagensCriados.get(jogador2.getPersonageEscolhido()).getVida();

                if (checkPlayer1Life == 0 || checkPlayer2Life == 0) {
                    loopControl = false;
                }
            }
        } 

        if (checkPlayer1Life > 0 && checkPlayer2Life <= 0) {
            System.out.println("\nParabens!! O jogador " + jogador1.getApelido() + " ganhou a partida!!\n");
        }else {
            System.out.println("\nParabens!! O jogador " + jogador2.getApelido() + " ganhou a partida!!\n");
        }
    }

    public void checarResposta(String resposta, int perguntaEscolhida, Personagens personagem) {

        if (resposta.equals(criarAlternativas.getAlternativa(perguntaEscolhida).toString())) {
            System.out.println("\nParabéns! Você acertou!!\n");
            System.out.println("\nA resposta correta era " + criarAlternativas.getAlternativa(perguntaEscolhida) + "\n");
        }else {
            int calcularVida;
            System.out.println("Que pena! Você errou.");  
            System.out.println("\nA resposta correta era " + criarAlternativas.getAlternativa(perguntaEscolhida) + "\n");
            calcularVida = personagem.getVida() - 10;
            personagem.setVida(calcularVida); 
            System.out.println("A vida do personagem " + personagem.getNome() + " agora é " + personagem.getVida());   
        }
    }
}

