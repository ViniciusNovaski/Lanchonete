package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.cozinha.atendente.Atendente;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionar lanche natural no hamburguer pelo balcão");
    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionar suco no balcao");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche() {
        System.out.println("Prepara o hamburguer");
    }
    public void prepararVitamina() {
        System.out.println("Prepara o suco !");
    }
    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionar pão, salada, ovo e carne .");
    }
    public void lavarIngredientes() {
        System.out.println("Lavar ingredientes");
    }
    public void baterVitaminaLiquidificador() {
        System.out.println("Bater vitamina no liquidificador");
    }
    public void fritarIngredientesLanche() {
        System.out.println("FRritando carne, ovo para o hamburguer");
    }
    void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
