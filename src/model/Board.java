package model;



import java.io.Serializable;

/**
 *
 * @author Bach-Vu
 */
public class Board implements Serializable {
    
    private Cell note;
    private Cell[][] matrix;
    private int value;

    public Board(Cell note, Cell[][] matrix, int value) {
        this.note = note;
        this.matrix = matrix;
        this.value = value;
    }

    public Cell getNote() {
        return note;
    }

    public void setNote(Cell note) {
        this.note = note;
    }

    public Cell[][] getNoteMap() {
        return matrix;
    }

    public void setNoteMap(Cell[][] matrix) {
        this.matrix = matrix;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
