package pm_prova2;

public class Spinning extends Atividade implements ControladorPresencaInterface {
    private int qnt_bicicletas;
    public Spinning (String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, int qnt_bicicletas) { 
        super (nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal);
        this.qnt_bicicletas = qnt_bicicletas;
    }
}