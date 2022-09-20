package hu.petrik.emberekoop;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", szulDatum='" + szulDatum + '\'' +
                ", szulHely='" + szulHely + '\'' +
                '}';
    }
}
