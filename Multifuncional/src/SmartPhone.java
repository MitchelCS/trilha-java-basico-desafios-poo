// DispositivoMultifuncional.java
public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public static void main(String[] args) {
        SmartPhone dispositivo = new SmartPhone();

        // Testando ReprodutorMusical
        dispositivo.tocar();
        dispositivo.selecionarMusica("Don't stop believin");
        dispositivo.pausar();

        // Testando AparelhoTelefonico
        dispositivo.ligar("2199887654");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();

        // Testando NavegadorInternet
        dispositivo.exibirPagina("www.deutudocerto.com");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}
