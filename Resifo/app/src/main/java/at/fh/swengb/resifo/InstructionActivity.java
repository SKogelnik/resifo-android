package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class InstructionActivity extends Activity{

    TextView instruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_page);

        instruction = (TextView)findViewById(R.id.instructionText);
        instruction.setText("Information f\u00FCr den Meldepflichtigen\n\n" +
                "1. Eine Anmeldung ist innerhalb von drei Tagen ab Beziehen der Unterkunft, eine Abmeldung" +
                "\ninnerhalb von drei Tagen vor oder nach Aufgabe der Unterkunft vorzunehmen.\n\n2." +
                "Bei der Anmeldung ben\u00F6tigen Sie folgende Dokumente:\n\n\u00D6ffentliche Urkunden, " +
                "aus denen Familien- oder Nach- und Vornamen, Familiennamen vorder ersten Eheschlie\u00DFung, " +
                "Geburtsdatum, Geburtsort und Staatsangeh\u00F6rigkeit des Unterkunftnehmers hervorgehen, " +
                "z. B. Reisepass und Geburtskunde;\n\nUnterkunftnehmer, die nicht die \u00F6sterreichische Staatsb\u00FCrgerschaft " +
                "besitzen (Fremde): Reisedokument (z. B. Reisepass);\n\nwenn an der bisherigen Unterkunft aus dem Hauptwohnsitz ein " +
                "\u201Eweiterer Wohnsitz\u201C wird, ist vor oder gleichzeitig mit Anmeldung des neuen Hauptwohnsitzes " +
                "eine Ummeldung des\nbisherigen Hauptwohnsitzes erforderlich.\n\n3. F\u00FCr den Inhalt des Meldezettels ist, " +
                "unabh\u00E4ngig davon, wer den Meldezettel ausf\u00FCllt, immer der Meldepflichtige verantwortlich. " +
                "Kontrollieren Sie daher bitte den Meldezettel auf Vollst\u00E4ndigkeit  und Richtigkeit der Eintragungen, " +
                "auch dann, wenn er von der Beh\u00F6rde ausgefertigt wird.\n\n4. Ihr Hauptwohnsitz ist an jener " +
                "Unterkunft begr\u00FCndet, an der Sie sich in der Absicht niedergelassen haben, diese zum Mittelpunkt Ihrer " +
                "Lebensbeziehungen zu machen; trifft diese sachliche Voraussetzung auf mehrere Wohnsitze zu, so haben Sie jenen als " +
                "Hauptwohnsitz zu bezeichnen, zu dem Sie das \u00FCberwiegende Naheverh\u00E4ltnis haben. " +
                "F\u00FCr den \u201EMittelpunkt der Lebensbeziehung\u201C sind vor allem folgende Bestimmungskriterien ma\u00DFgeblich: " +
                "Aufenthaltsdauer, Lage des Arbeitsplatzes oder der Ausbildungsst\u00E4tte, Ausgangspunkt des Weges zum " +
                "Arbeitsplatz oder zur Ausbildungsst\u00E4tte, Wohnsitz der \u00FCbrigen, insbesondere der minderj\u00E4hrigen " +
                "Familienangeh\u00F6rigen und der Ort, an dem sie ihrer Erwerbst\u00E4tigkeit nachgehen, ausgebildet werden " +
                "oder die Schule oder den Kindergarten besuchen, Funktionen in \u00F6ffentlichen und privaten K\u00F6rperschaften. " +
                "Der Hauptwohnsitz ist f\u00FCr die Eintragung in die \u201EW\u00E4hlerevidenz\u201C sowie f\u00FCr verschiedene " +
                "andere Rechtsbereiche (z. B. Kfz-Zulassung, waffenrechtliche Urkunden, Sozialhilfe) ma\u00DFgeblich.\n\n5. " +
                "Bedenken Sie bitte, dass eine \u00C4nderung des Hauptwohnsitzes oder eines weiteren Wohnsitzes auch noch weitere " +
                "Mitteilungspflichten (z. B. Kfz-Zulassung) begr\u00FCnden kann. \n\n"
        );
    }

    public void onUnderstand(View view) {
        Person pers = new Person();

        Intent intent = new Intent(this, InputOneActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        intent.putExtra("index","-1");
        startActivity(intent);
    }

}
