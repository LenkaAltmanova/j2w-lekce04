package cz.czechitas.java2webapps.lekce4.entity;

public class Ucastnik {
    private String jmeno;
    private String prijmeni;
    private String bydliste;
    private String profilovyObrazek;

    public Ucastnik() {
    }
    public Ucastnik(String jmeno, String prijmeni, String bydliste, String profilovyObrazek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.bydliste = bydliste;
        this.profilovyObrazek = profilovyObrazek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }

    public String getProfilovyObrazek() {
        return profilovyObrazek;
    }

    public void setProfilovyObrazek(String profilovyObrazek) {
        this.profilovyObrazek = profilovyObrazek;
    }
}
