package entity.note.example.jinglebells;

import entity.note.Clef;
import entity.note.NoteWriter;
import entity.note.SheetMusic;

public class Jinglebells extends SheetMusic {

    private Jinglebells(){
        setTitle("징글벨");
        setClef(Clef.Gclef);
        setWriter(new NoteWriter("PierPont"));


    }
}
