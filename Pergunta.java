import java.util.ArrayList;

public class Pergunta {
    ArrayList<String> perguntas = new ArrayList<>();

    public ArrayList<String> getPerguntas() {
        return perguntas;
    }

    public void addPerguntas(String pergunta) {
        this.perguntas.add(pergunta);
    }

    public String getPergunta(int numPergunta) {
        return this.perguntas.get(numPergunta);
    }
}
