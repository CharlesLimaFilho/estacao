import java.util.ArrayList;

public class Recursos {
    private ArrayList<Trem> listaTrem;
    private ArrayList<Locomotiva> listaLocomotiva;
    private ArrayList<Vagao> listaVagao;

    public Recursos() {
        listaTrem = new ArrayList<Trem>();
        listaLocomotiva = new ArrayList<Locomotiva>();
        listaVagao = new ArrayList<Vagao>();
    }

    public Trem mostrarTrem() {
        for (Trem item : listaTrem) {
            return item;
        }
        return null;
    }
    public Locomotiva mostrarLocomotiva() {
        for (Locomotiva item : listaLocomotiva) {
            return item;
        }
        return null;
    }
    public Vagao mostrarVagao() {
        for (Vagao item : listaVagao) {
            return item;
        }
        return null;
    }

    public void adicionarListaTrem(Trem trem) {
        if (listaTrem.contains(trem) != true) {
            listaTrem.add(trem);
            System.out.println("Trem adicionado");
        } else {
            System.out.println("O trem ja esta contido");
        }
    }

    public void adicionarListaLocomotiva(Locomotiva locomotiva) {
        if (listaLocomotiva.contains(locomotiva) != true) {
            listaLocomotiva.add(locomotiva);
            System.out.println("Locomotiva adicionada");
        } else {
            System.out.println("A locomotiva ja esta contida");
        }
    }
    public void adicionarListaVagao(Vagao vagao) {
        if (listaVagao.contains(vagao) != true) {
            listaVagao.add(vagao);
            System.out.println("Vagao adicionado");
        } else {
            System.out.println("O vagao ja esta contido");
        }
    }

    public void removerListaTrem(Trem trem) {
        listaTrem.remove(trem);
        System.out.println("Trem removido");
    }
    public void removerListaLocomotiva(Locomotiva locomotiva) {
        listaLocomotiva.remove(locomotiva);
        System.out.println("Locomotiva removida");
    }
    public void removerListaVagao(Vagao vagao) {
        listaVagao.remove(vagao);
        System.out.println("Vagao removido");
    }

    public String toString() {
        String str = "";
        str += "\nTrens: \n";
        for (Trem item : listaTrem) {
            str += item;
        }
        str += "\n\nLocomotivas da linha: \n";
        for (Locomotiva item : listaLocomotiva) {
            str += item;
        }
        str += "\n\nVagoes da linha: \n";
        for (Vagao item : listaVagao) {
            str += item;
        }
        str += "\n";
        return str;
    }
}
