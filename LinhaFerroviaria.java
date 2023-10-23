public class LinhaFerroviaria {
    private int numero;
    private double comprimentoLinha;
    private String descricaoLinha;
    private Recursos recursos;

    LinhaFerroviaria() {

    }

    public LinhaFerroviaria(int numero, double comprimentoLinha, String descricaoLinha, Recursos recursos) {
        this.numero = numero;
        this.comprimentoLinha = comprimentoLinha;
        this.descricaoLinha = descricaoLinha;
        this.recursos = recursos;
    }

    public int getNumero() {
        return this.numero;
    }
    public double getComprimentoLinha() {
        return this.comprimentoLinha;
    }
    public String getDescricaoLinha() {
        return this.descricaoLinha;
    }
    public Recursos getRecursos() {
        return this.recursos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setComprimentoLinha(double comprimentoLinha) {
        this.comprimentoLinha = comprimentoLinha;
    }
    public void setDescricaoLinha(String descricaoLinha) {
        this.descricaoLinha = descricaoLinha;
    }
    public void setRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public String toString() {
        String str = "";
        str += "\nNumero = " + this.numero;
        str += "\nComprimento da linha = " + this.comprimentoLinha + " m";
        str += "\nDescricao da linha = " + this.descricaoLinha;
        str += "\nRecursos: \n" + this.recursos;
        return str;
    }
}
