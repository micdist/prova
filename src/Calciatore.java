public class Calciatore {
    private String nome;
    private String cognome;
    private int eta;
    private String ruolo;

    public Calciatore(String nome, String cognome, int eta, String ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calciatore{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append(", eta=").append(eta + " ");
        sb.append(", ruolo='").append(ruolo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
