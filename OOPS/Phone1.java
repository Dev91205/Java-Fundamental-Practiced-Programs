package OOPS;

public class Phone1 {
    Battery b = new Battery(5000);
    Sim[] sims = new Sim[2];
    int count = 0;

    public void insertSim(Sim sim) {
        if (count < sims.length) {
            sims[count] = sim;
            count++;
        } else {
            System.out.println("Slots are filled");
        }
    }

    public Sim[] getSims() {
        return sims;
    }

    public Battery getBattery() {
        return b;
    }
}
