package pm_prova2;

public class Natacao extends Atividade implements CertificavelInterface, ControladorPresencaInterface{   
    private double profundidade;

    public Natacao (String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, double profundidade) { 
        super (nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal);
        this.profundidade = profundidade;
    }




    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}
