import java.util.ArrayList;

public class Alternativa {
    
    private ArrayList<String> alternativas = new ArrayList<>();

    public ArrayList<String> getAlternativas() {
        return alternativas;
    }

    public void addAlternativa(String alternativa) {
        this.alternativas.add(alternativa);
    }

    public String getAlternativa(int numAlternativa) {
        return this.alternativas.get(numAlternativa);
    }
}