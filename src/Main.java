import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;


public class Main {
    private final static String TAG = Main.class.getSimpleName();
    public static void main(String[] args) {
        String who = "";
        System.out.println("Hello world! @" + who);


        //read txt file and buffers it into a String
        String content = " ";
        try {
             content = new String(Files.readAllBytes(Paths.get("listaFarlocca.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String esito = " ";
        if (!content.trim().isEmpty()){
            esito = content;
        } else {
            esito = "stringa vuota";
        }
        //System.out.println(esito);


        //extracts calciatore with eol
        String calciatoriEstratti[] = esito.split("\\r?\\n");
        for (String calciatore : calciatoriEstratti){
            System.out.println(calciatore);
        }

        List<Calciatore> listaCalciatori  = new ArrayList<>();
        /*try{
            for (int i=0; i< calciatoriEstratti.length; i++){
                String calciatoreStringa = calciatoriEstratti.
            }
        }*/



    }
}