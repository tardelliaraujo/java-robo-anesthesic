package Anest.gof;

import Anest.gof.strategy.*;

public class test {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento propofol = new ComportamentoPropofol();
        Comportamento monitoramento = new ComportamentoMonitoramento();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(propofol);
        robo.mover();
        robo.setComportamento(monitoramento);
        robo.mover();



    }
}
