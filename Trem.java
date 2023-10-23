import java.util.ArrayList;

public class Trem {
    private String prefixo;
    private String dataFormacao;
    private Locomotiva locomotiva;
    private Vagao vagao;
    private String posicao;
    private ArrayList<Vagao> vagoesAdicionais;

    Trem() {

    }

    public Trem(String prefixo, String dataFormacao, Locomotiva locomotiva, Vagao vagao, String posicao) {
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao;
        this.locomotiva = locomotiva;
        this.vagao = vagao;
        this.posicao = posicao;
        vagoesAdicionais = new ArrayList<Vagao>();
    }

    public String getPrefixo() {
        return this.prefixo;
    }
    public String getDataFormacao() {
        return this.dataFormacao;
    }
    public Locomotiva getLocomotiva() {
        return this.locomotiva;
    }
    public Vagao getVagao() {
        return this.vagao;
    }
    public String getPosicao() {
        return this.posicao;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }
    public void setVagao(Vagao vagao) {
        this.vagao = vagao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void adicionarVagao(Vagao vagao) {
        if (vagoesAdicionais.size() < 150) {
            if (vagoesAdicionais.contains(vagao) != true) {
                vagoesAdicionais.add(vagao);
                System.out.println("Vagao adicionado ao trem");
            } else {
                System.out.println("Vagao ja esta contido no trem");
            }
        } else {
            System.out.println("Capacidade maxima atingida");
        }
    }

    public void removerVagao(Vagao vagao) {
        vagoesAdicionais.remove(vagao);
        System.out.println("Vagao removido do trem");
    }

    public String toString() {
        String str = "";
        str += "Prefixo =  " + this.prefixo;
        str += "\nData de Formacao = " + this.dataFormacao;
        str += "\n\nLocomotiva do trem: \n" + this.locomotiva;
        str += "\n\nVagao do trem: " + this.vagao + "\n";
        return str;
    }
}
