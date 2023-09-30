public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorNaInternet navegar = new NavegadorNaInternet();

        reprodutor.selecionarMusica("Musica Ed Sheroon");
        reprodutor.tocar();
        reprodutor.pausarMusica();
        telefone.ligar(1231231231);
        telefone.atender();
        telefone.IniciarCorreioVoz();
        navegar.exibirPagina("www.classesIphone.com");
        navegar.adicionarNovaAba();
        navegar.atualizarPagina();
    }
}
