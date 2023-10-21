package Anest.gof.strategy;

public class ComportamentoPropofol implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Injetando propofol lentamente...");
    }
}

