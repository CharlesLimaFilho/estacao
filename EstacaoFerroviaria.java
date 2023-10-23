import java.util.ArrayList;

public class EstacaoFerroviaria {
    private String sigla;
    private String descricao;
    private ArrayList<LinhaFerroviaria> listaLinha;

    EstacaoFerroviaria() {
        
    }

    public EstacaoFerroviaria(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        listaLinha = new ArrayList<LinhaFerroviaria>();
    }

    public String getSigla() {
        return this.sigla;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public LinhaFerroviaria getListaLinha() {
        for (LinhaFerroviaria item : listaLinha) {
            return item;
        }
        return null;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarListaLinha(LinhaFerroviaria linha) { 
        if (listaLinha.contains(linha) != true) {
            listaLinha.add(linha);
            System.out.println("Linha adicionada");
        } else {
            System.out.println("A estacao ja contem essa linha");
        }
    }

    public void moverTrem(EstacaoFerroviaria est2, Trem trem) {
        if (est2.getSigla() != this.sigla) {
            getListaLinha().getRecursos().removerListaTrem(trem);
            est2.getListaLinha().getRecursos().adicionarListaTrem(trem);
        }
    }

    public String toString() {
        String str = "";
        str += "Sigla = " + this.sigla;
        str += "\nDescricao = " + this.descricao;
        str += "\nLinhas: \n";
        for (LinhaFerroviaria item : listaLinha) {
            str += item;
            str += "\n";
        }
        return str;
    }
}