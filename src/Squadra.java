import java.util.ArrayList;
import java.util.List;

public class Squadra {
    private List<Calciatore> listaCalciatori = new ArrayList<>();
    private String allenatore;
    private String stadio;

    public Squadra(String allenatore, String stadio) {
        this.allenatore = allenatore;
        this.stadio = stadio;
    }

    public List<Calciatore> getListaCalciatori() {
        return listaCalciatori;
    }

    public void addCalciatore(Calciatore calciatore) {
        this.listaCalciatori.add(calciatore);
    }

    public String getAllenatore() {
        return allenatore;
    }

    public void setAllenatore(String allenatore) {
        this.allenatore = allenatore;
    }

    public String getStadio() {
        return stadio;
    }

    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Squadra{");
        sb.append("listaCalciatori=").append(listaCalciatori.size() + " ");
        sb.append(", allenatore='").append(allenatore).append('\'');
        sb.append(", stadio='").append(stadio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
