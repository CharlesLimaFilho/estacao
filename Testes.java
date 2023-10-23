public class Testes {
    public static void main(String[] args) {
        EstacaoFerroviaria est1 = new EstacaoFerroviaria("Estacao 1", "Primeira estacao");
        EstacaoFerroviaria est2 = new EstacaoFerroviaria("Estacao 2", "Segunda estacao");

        Vagao v1 = new Vagao(27, "Carvao", 100, 10, 15);
        Vagao v2 = new Vagao(17, "Pessoas", 40, 1, 2);

        Locomotiva l1 = new Locomotiva(02, 40, 70);
        Locomotiva l2 = new Locomotiva(10, 2, 7);

        Trem t1 = new Trem("1LNAO", "10/02/1993", l1, v1, "Estacao 1");
        Trem t2 = new Trem("2NAOP", "20/05/1999", null, null, "Estacao 2");


        Recursos r1 = new Recursos();
        Recursos r2 = new Recursos();
        Recursos r3 = new Recursos();


        LinhaFerroviaria ln1 = new LinhaFerroviaria(1, 100, "Linha 1", r1);
        LinhaFerroviaria ln2 = new LinhaFerroviaria(2, 500, "Linha 2", r2);
        LinhaFerroviaria ln3 = new LinhaFerroviaria(3, 1000, "Linha 3", r3);

        
        r1.adicionarListaLocomotiva(l2);
        r1.adicionarListaVagao(v2);
        r1.adicionarListaTrem(t1);
        r2.adicionarListaTrem(t2);
        

        est1.adicionarListaLinha(ln1);
        est1.adicionarListaLinha(ln3);
        est2.adicionarListaLinha(ln2);

        System.out.println(t1);

        System.out.println(est1 + "\n\n");
        System.out.println(est2 + "\n\n");

        est1.moverTrem(est2, t1);
        System.out.println("\nApos passar o trem: \n");

        System.out.println(est1 + "\n\n");

        System.out.println(est2);
        r2.removerListaTrem(t1);
    }
}
