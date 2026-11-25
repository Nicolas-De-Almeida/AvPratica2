package pm_prova2;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Musculacao musculacao = new Musculacao("Nome1", 3, 4, 10, 5);

        Natacao natacao = new Natacao("Nome2", 3, 4, 10, 5);

        Spinning spinning = new Spinning("Nome3", 3, 4, 10, 5);

        Basico basico = new Basico("Basico", 6, 7);

        Premium premium = new Premium("Premium", 6, 7 );
