package pm_prova2;

public class Basico extends Plano implements ControladorPresencaInterface {
    private StatusPlano status;
    public Basico(String nome, double valorMensal, int quantidadeMaximaAtividades) {
        super(nome, valorMensal, quantidadeMaximaAtividades);
        this.status = StatusPlano.ATIVO;
    }

    @Override
    public abstract void exibirDetalhes();

    @Override
    public abstract boolean permiteAtividadeColetiva();
}
