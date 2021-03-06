package client.View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Trung Hoang
 */
public class JPanelClock extends javax.swing.JPanel {

    private Timer Clock;
    private int Time = 0;
    private int H;
    private int M;
    private int S;
    private JLabel jLabelClock;

    /** Creates new form JPanelClock */
    public JPanelClock() {
        super();





        jLabelClock = new JLabel();

        Clock = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Time++;
                H = Time / 3600;
                M = (Time - (3600 * H)) / 60;
                S = (Time - (3600 * H) - (60 * M));
                String hh = String.valueOf(H);
                if (H < 10) {
                    hh = "0" + String.valueOf(H);
                }
                String mm = String.valueOf(M);
                if (M < 10) {
                    mm = "0" + String.valueOf(M);
                }
                String ss = String.valueOf(S);
                if (S < 10) {
                    ss = "0" + String.valueOf(S);
                }
                jLabelClock.setText(hh + " : " + mm + " : " + ss);
            }
        });

        jLabelClock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock.setForeground(new java.awt.Color(91,58,58));
        jLabelClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //jLabelClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clock.png")));
        jLabelClock.setToolTipText("");
        jLabelClock.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Time", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 51, 51))); // NOI18N
        jLabelClock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        // this.setBackground(Color.LIGHT_GRAY);

        javax.swing.GroupLayout jPanelClockLayout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanelClockLayout);
        jPanelClockLayout.setHorizontalGroup(
                jPanelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanelClockLayout.createSequentialGroup().addContainerGap().addComponent(jLabelClock, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE).addContainerGap(187, Short.MAX_VALUE)));
        jPanelClockLayout.setVerticalGroup(
                jPanelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanelClockLayout.createSequentialGroup().addContainerGap().addComponent(jLabelClock, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE).addContainerGap()));

        this.setSize(241, 64);
        this.add(jLabelClock);
    }

    public void start(int time) {
        this.Time = time - 1;
        Clock.start();
    }

    public int pause() {
        Clock.stop();
      
        return this.Time;
    }

    public int stop() {
        Clock.stop();
        jLabelClock.setText("00 : 00 : 00");
        return this.Time;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
