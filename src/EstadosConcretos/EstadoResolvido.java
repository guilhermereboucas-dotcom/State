package EstadosConcretos;

import Base.Chamado;
import Base.EstadoChamado;

public class EstadoResolvido implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível atender um chamado resolvido.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente em um chamado resolvido.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder cliente em um chamado resolvido.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado resolvido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Não é possível cancelar um chamado resolvido.");
    }
}
