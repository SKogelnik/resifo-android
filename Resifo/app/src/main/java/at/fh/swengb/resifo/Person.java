package at.fh.swengb.resifo;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{

    //Person
    String nachname;
    String vorname;
    String oldNachname;
    String geburtsdatum; //DATE(?)
    String geburtsort;
    String geschlecht;
    String religion;
    String nation;
    String zmr;

    //Reisedokument
    Integer dokNummer;
    Date ausstellDat;
    String ausstelBeh;

    //Unterkunft
    String strasse;
    Integer hausnr;
    Integer plz;
    String ort;


    public Person() {

    }

    public String getGeburtsort() {
        return geburtsort;
    }

    public void setGeburtsort(String geburtsort) {
        this.geburtsort = geburtsort;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getOldNachname() {
        return oldNachname;
    }

    public void setOldNachname(String frauenname) {
        this.oldNachname = frauenname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getZmr() {
        return zmr;
    }

    public void setZmr(String zmr) {
        this.zmr = zmr;
    }

    public Integer getDokNummer() {
        return dokNummer;
    }

    public void setDokNummer(Integer dokNummer) {
        this.dokNummer = dokNummer;
    }

    public Date getAusstellDat() {
        return ausstellDat;
    }

    public void setAusstellDat(Date ausstellDat) {
        this.ausstellDat = ausstellDat;
    }

    public String getAusstelBeh() {
        return ausstelBeh;
    }

    public void setAusstelBeh(String ausstelBeh) {
        this.ausstelBeh = ausstelBeh;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Integer getHausnr() {
        return hausnr;
    }

    public void setHausnr(Integer hausnr) {
        this.hausnr = hausnr;
    }

    public Integer getPlz() {
        return plz;
    }

    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
