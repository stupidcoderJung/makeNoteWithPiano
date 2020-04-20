package entity.note;

import java.util.LinkedList;

/**
 * SheetMusic(악보)
 *   - Sheet Music consisits of bars, clef, key signature, time signature, writer and title
 */
public class SheetMusic {
    private String title;
    private NoteWriter writer;
    private TimeSigature timeSigature;
    private Clef clef;
    private LinkedList<MusicBar> barLinkedList;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NoteWriter getWriter() {
        return writer;
    }

    public void setWriter(NoteWriter writer) {
        this.writer = writer;
    }

    public TimeSigature getTimeSigature() {
        return timeSigature;
    }

    public void setTimeSigature(TimeSigature timeSigature) {
        this.timeSigature = timeSigature;
    }

    public Clef getClef() {
        return clef;
    }

    public void setClef(Integer clef) {
        this.clef = clef;
    }

    public LinkedList<MusicBar> getBarLinkedList() {
        return barLinkedList;
    }

    public void setBarLinkedList(LinkedList<MusicBar> barLinkedList) {
        this.barLinkedList = barLinkedList;
    }
}
