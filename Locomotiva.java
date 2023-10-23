public class Locomotiva {
    private int numero;
    private double capacidadeTracao;
    private double comprimento;

    Locomotiva() {

    }

    public Locomotiva(int numero, double capacidadeTracao, double comprimento) {
        this.numero = numero;
        this.capacidadeTracao = capacidadeTracao;
        this.comprimento = comprimento;
    }

    public int getNumero() {
        return this.numero;
    }
    public double getCapacidadeTracao() {
        return this.capacidadeTracao;
    }
    public double getComprimento() {
        return this.comprimento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCapacidadeTracao(double capacidadeTracao) {
        this.capacidadeTracao = capacidadeTracao;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String toString() {
        String str = "";
        str += "Numero = " + this.numero;
        str += "\nCapacidade de Tracao = " + this.capacidadeTracao;
        str += "\nComprimento = " + this.comprimento + " m";
        return str;
    }
}
