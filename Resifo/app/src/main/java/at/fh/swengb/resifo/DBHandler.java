package at.fh.swengb.resifo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by fabian on 03.02.17.
 */

public class DBHandler extends SQLiteOpenHelper {


    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "database";
    // ID
    private static final String KEY_ID = "id";

    // rows
    private static final String VORNAME = "vorname";
    private static final String NACHNAME = "nachname";
    private static final String NACHNAMEALT = "nachnamealt";
    private static final String GEBURTSTDATUM ="geburtsdatum";
    private static final String GEBURTSORT ="geburtsort";
    private static final String GESCHLECHT ="geschlecht";
    private static final String RELIGION ="religion";
    private static final String FAMILIENSTAND = "familienstand";
    private static final String NATION = "nation";
    private static final String ZMR = "zmr";

    private static final String DOKNUMMER = "dokumentnummer";
    private static final String AUSSTELLDATUM ="ausstelldatum";
    private static final String AUSSTELLBEHOERDE ="ausstellbehoerde";

    private static final String STRASSE = "strasse";
    private static final String HAUSNUMMER = "hausnummer";
    private static final String PLZ = "postleitzahl";
    private static final String ORT = "ort";


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DATABASE_TABLE ="CREATE TABLE "+DATABASE_NAME+"("+KEY_ID+" INTEGER PRIMARY KEY,"
                +VORNAME+" TEXT,"
                +NACHNAME+" TEXT,"
                +NACHNAMEALT+" TEXT,"
                +GEBURTSTDATUM+" TEXT,"
                +GEBURTSORT+" TEXT,"
                +GESCHLECHT+" TEXT,"
                +RELIGION+" TEXT,"
                +FAMILIENSTAND+" TEXT,"
                +NATION+" TEXT,"
                +ZMR+" TEXT,"
                +DOKNUMMER+" TEXT,"
                +AUSSTELLDATUM+" TEXT,"
                +AUSSTELLBEHOERDE+" TEXT,"
                +STRASSE+" TEXT,"
                +HAUSNUMMER+" TEXT,"
                +PLZ+" TEXT,"
                +ORT+" TEXT"
                +")";


        db.execSQL(CREATE_DATABASE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        // Creating tables again
        onCreate(db);

    }
    //insert
    public void addTable(Person person) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(VORNAME, person.getVorname());
        values.put(NACHNAME,person.getNachname());
        values.put(NACHNAMEALT,person.getOldNachname());
        values.put(GEBURTSTDATUM,person.getGeburtsdatum());
        values.put(GEBURTSORT, person.getGeburtsort());
        values.put(GESCHLECHT, person.getGeschlecht());
        values.put(RELIGION, person.getReligion());
        values.put(FAMILIENSTAND, person.getFamilienstand());
        values.put(NATION, person.getNation());
        values.put(ZMR, person.getZmr());
        values.put(DOKNUMMER, person.getDokNummer());
        values.put(AUSSTELLDATUM, person.getAusstellDat());
        values.put(AUSSTELLBEHOERDE, person.getAusstellBeh());
        values.put(STRASSE, person.getStrasse());
        values.put(HAUSNUMMER, person.getHausnr());
        values.put(PLZ, person.getPlz());
        values.put(ORT, person.getOrt());

        // Inserting Row
        db.insert(DATABASE_NAME, null, values);
        // Closing database connection
        db.close();
    }
    /*
    //READ
    public Person getPerson(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DATABASE_NAME, new String[] { KEY_ID,
                        VORNAME, NACHNAME, ZMR }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        Person contact = new Person(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
// return shop
        return contact;
    }
*/
    // Deleting a person
    public void deletePerson(Person person) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DATABASE_NAME, KEY_ID + " = ?",
                new String[] { String.valueOf(person.getDokNummer()), });
        db.close();
    }


    // Getting All Persons
    public List<Person> getAllPersons() {
        List personList = new ArrayList<>();
// Select All Query
        String selectQuery = "SELECT "+KEY_ID+","+VORNAME+","+NACHNAME+" FROM " + DATABASE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                List list= new ArrayList();
                list.add(Integer.parseInt(cursor.getString(0)));
                list.add(cursor.getString(1));
                list.add(cursor.getString(2));
// Adding contact to list
                personList.add(list);
            } while (cursor.moveToNext());
        }
// return contact list
        return personList;
    }



}
