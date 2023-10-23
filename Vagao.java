public class Vagao {
    private int numero;
    private String tipo;
    private double capacidadeCarga;
    private double comprimentoTesteiras;
    private double comprimentoEngates;

    Vagao() {
        
    }

    public Vagao(int numero, String tipo, double capacidadeCarga, double comprimentoTesteiras, double comprimentoEngates) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoTesteiras = comprimentoTesteiras;
        this.comprimentoEngates = comprimentoEngates;
    }


    public int getNumero() {
        return this.numero;
    }
    public String getTipo() {
        return this.tipo;
    }
    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }
    public double getComprimentoTesteiras() {
        return this.comprimentoTesteiras;
    }
    public double getComprimentoEngates() {
        return this.comprimentoEngates;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public void setComprimentoTesteiras(double comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }
    public void setComprimentoEngates(double comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }

    public String toString() {
        String str = "";
        str += "Numero = " + this.numero;
        str += "\nTipo = " + this.tipo;
        str += "\nCapacidade de Carga = " + this.capacidadeCarga + "kg";
        str += "\nComprimeto das testeiras = " + this.comprimentoTesteiras + "m";
        str += "\nComprimento dos engates = " + this.comprimentoEngates + "m";
        return str;
    }
}
