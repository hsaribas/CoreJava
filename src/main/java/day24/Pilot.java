package day24;

public class Pilot implements HondaAC, Engine, Security {

    @Override
    public void cool() {

        System.out.println("Pilot uses digital climate AC...");
    }

    @Override
    public void run() {

        System.out.println("AC runs perfect...");
    }
}
