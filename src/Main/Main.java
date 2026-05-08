package Main;
import Base.Chamado;
import EstadosConcretos.EstadoAberto;

public class Main {
    public static void main(String[] args) {

        System.out.println("------PASSO 1------");
        System.out.println("Criando primeiro chamado...");
        Chamado chamado = new Chamado("XRBR", "NACIONAL", "Jorge", new EstadoAberto());
        System.out.println("------PASSO 2------");
        chamado.resolver();
        System.out.println("------PASSO 3------");
        chamado.iniciarAtendimento();
        System.out.println("------PASSO 4------");
        chamado.aguardarCliente();
        System.out.println("------PASSO 5------");
        chamado.resolver();
        System.out.println("------PASSO 6------");
        chamado.responderCliente();
        System.out.println("------PASSO 7------");
        chamado.resolver();
        System.out.println("------PASSO 8------");
        chamado.cancelar();
        System.out.println("------PASSO 9------");
        System.out.println("Criando segundo chamado...");
        Chamado novoChamado = new Chamado("XRUS", "INTERNACIONAL", "Maria", new EstadoAberto());
        System.out.println("------PASSO 10------");
        novoChamado.cancelar();
        System.out.println("------PASSO 11------");
        novoChamado.iniciarAtendimento();

    }
}