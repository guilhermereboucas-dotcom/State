package EstadosConcretos;

import Base.Chamado;
import Base.EstadoChamado;

public class EstadoEmAtendimento implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível atender um chamado em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Aguardando cliente...");
        chamado.setEstadoAtual(new EstadoAguardandoCliente());
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder um chamado em atendimento.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Resolvendo...");
        chamado.setEstadoAtual(new EstadoResolvido());
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Cancelando...");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
