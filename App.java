public class App {
    public static void main(String[] args) {

        MenuInicial menu = new MenuInicial();

        if (menu.mostrarMenu().equals("1")) {
            Partida novaPartida = new Partida();

            Jogador jogador1 = new Jogador("Jogador 1", null, null, null);
            novaPartida.cadastrarJogador(jogador1);

            Jogador jogador2 = new Jogador("Jogador 2", null, null, null);
            novaPartida.cadastrarJogador(jogador2);

            novaPartida.escolherPersonagem(jogador1);
            novaPartida.escolherPersonagem(jogador2);

            novaPartida.iniciarPartida(jogador1, jogador2);
               
        } else {
            System.out.println("Finalizando o programa...");
        }
    }
}
