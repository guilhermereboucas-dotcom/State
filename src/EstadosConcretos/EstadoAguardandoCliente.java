package EstadosConcretos;

import Base.Chamado;
import Base.EstadoChamado;

public class EstadoAguardandoCliente implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível iniciar um chamado em aguardo.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente em um chamado em aguardo.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Respondendo Cliente");
        chamado.setEstadoAtual(new EstadoEmAtendimento());
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado em aguardo");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Cancelando");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
