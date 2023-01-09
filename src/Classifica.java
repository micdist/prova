import java.util.HashMap;
import java.util.Map;

public class Classifica {
    //maps each team to its points
    Map<String,Integer> mappaClassifica = new HashMap<>();

    public Classifica(Map<String, Integer> mappaClassifica) {
        this.mappaClassifica = mappaClassifica;
    }

    public Map<String, Integer> getMappaClassifica() {
        return mappaClassifica;
    }

    public void addSquadra(Squadra squadra) {
        //complete code;
    }
}
