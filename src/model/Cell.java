package model;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Bach-Vu
 */
public class Cell extends JButton implements Serializable {

    private int x;
    private int y;
    private int value;

    public Cell(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = 0;
    }

    public int getToaDoX() {
        return x;
    }

    public void setToaDoX(int x) {
        this.x = x;
    }

    public int getToaDoY() {
        return y;
    }

    public void setToaDoY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.setText("" + value);
        this.setEnabled(false);
    }

    public void resetCell() {
        this.value = 0;
        this.setText("");
        this.setEnabled(true);
    }
}
