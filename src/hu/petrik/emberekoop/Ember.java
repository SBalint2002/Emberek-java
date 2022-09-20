package hu.petrik.emberekoop;

import java.time.LocalDate;
import java.time.Period;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv(){
        return Integer.parseInt(szulDatum.split("-")[0]);
    }

    public int getSzuletesiHonap(){
        return Integer.parseInt(szulDatum.split("-")[1]);
    }

    public int getSzuletesiNap(){
        return Integer.parseInt(szulDatum.split("-")[2]);
    }

    public int getEletkor(){
        LocalDate maiDatum = LocalDate.now();
        if (maiDatum.getMonthValue()<=this.getSzuletesiHonap()){
            return maiDatum.getYear() - this.getSzuletesiEv() - 1;

        } else if (maiDatum.getDayOfMonth()>=this.getSzuletesiNap() && maiDatum.getMonthValue()==this.getSzuletesiHonap()){
            return maiDatum.getYear() - this.getSzuletesiEv();

        }else {
            return maiDatum.getYear() - this.getSzuletesiEv();
        }
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s (%s) %20s %10s %10s %10s", this.nev, this.szulDatum, this.getEletkor(), this.szulHely, this.getSzuletesiEv(), this.getSzuletesiHonap(), this.getSzuletesiNap());
    }
}
