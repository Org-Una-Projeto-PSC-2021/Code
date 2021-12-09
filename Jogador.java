public class Jogador {
    private String nome;
    private String apelido;
    private String email;
    private String telefone; 
    private String personagemEscolhido;

    public Jogador(String nome, String apelido, String email, String telefone) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getPersonageEscolhido() {
        return this.personagemEscolhido;
    }

    public void setPersonageEscolhido(String personagemEscolhido) {
        this.personagemEscolhido = personagemEscolhido;
    }

}
