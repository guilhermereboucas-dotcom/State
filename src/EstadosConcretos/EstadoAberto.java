package EstadosConcretos;

import Base.Chamado;
import Base.EstadoChamado;

public class EstadoAberto implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Iniciando atendimento...");
        chamado.setEstadoAtual(new EstadoEmAtendimento());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente em um chamado aberto.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder cliente em um chamado aberto.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado aberto.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Cancelando...");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
