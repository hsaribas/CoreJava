package day24;

public class Accord implements HondaAC, Engine, Security {

    @Override
    public void cool() {

        System.out.println("Accord uses digital AC...");
    }

    @Override
    public void run() {

        System.out.println("AC runs good in Accord...");
    }
}
