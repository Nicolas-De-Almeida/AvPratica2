package pm_prova2;

public class Premium extends Plano {
    private StatusPlano status;
    public Premium(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status)
        this.status = StatusPlano.ATIVO;
    }

    @Override
    public abstract void exibirDetalhes();

    @Override
    public abstract boolean permiteAtividadeColetiva();
}
