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
    String familienstand;
    String nation;
    String zmr;

    //Reisedokument
    String dokNummer;
    String ausstellDat;
    String ausstellBeh;

    //Unterkunft
    String strasse;
    String hausnr;
    String plz;
    String ort;


    public Person() {

    }

    public String getFamilienstand() {
        return familienstand;
    }

    public void setFamilienstand(String familienstand) {
        this.familienstand = familienstand;
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

    public String getDokNummer() {
        return dokNummer;
    }

    public void setDokNummer(String dokNummer) {
        this.dokNummer = dokNummer;
    }

    public String getAusstellDat() {
        return ausstellDat;
    }

    public void setAusstellDat(String ausstellDat) {
        this.ausstellDat = ausstellDat;
    }

    public String getAusstellBeh() {
        return ausstellBeh;
    }

    public void setAusstellBeh(String ausstellBeh) {
        this.ausstellBeh = ausstellBeh;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
