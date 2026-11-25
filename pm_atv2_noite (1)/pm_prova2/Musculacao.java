package pm_prova2;
public class Musculacao extends Atividade {
    private int qnt_aparelhos;

    public Musculacao (String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, int qnt_aparelhos) { 
        super (nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal);
        this.qnt_aparelhos = qnt_aparelhos;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Duracao: " + this.getDuracaoAula());
        System.out.println("Quantidade Maxima: " + this.getQuantidadeMaximaParticipantes());
        System.out.println("Valor: " + this.getValorMensal());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Quantidade Aparelhos: " + this.getQnt_aparelhos());
    }

    public abstract boolean atividadeColetiva();





    public int getQnt_aparelhos() {
        return qnt_aparelhos;
    }

    public void setQnt_aparelhos(int qnt_aparelhos) {
        this.qnt_aparelhos = qnt_aparelhos;
    }




    @Override
    public double calcularValorFinal() {
        return this.getValor();
    }
}