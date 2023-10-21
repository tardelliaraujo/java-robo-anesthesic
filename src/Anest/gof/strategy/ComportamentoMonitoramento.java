package Anest.gof.strategy;

public class ComportamentoMonitoramento implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Monitorando Paciente...");
    }
}
