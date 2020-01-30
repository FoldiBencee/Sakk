package felulet;

import logika.SakkTabla;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SakkFelulet extends JFrame {

    private Container foAblak;
    private  JPanel pnljatekTabla;
    private SakkTabla tabla;

    public SakkFelulet()
    {
        this.tabla = new SakkTabla();
        this.initComponents();
        sakkTablaMegjelenit();
    }

    private  void initComponents()
    {
            this.setTitle("Sakk 1.0");
           // this.setUndecorated(true);
          //  this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);



            int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            this.setSize(1024,768);
            this.setSize(width,height);



            this.setAlwaysOnTop(true);
            this.setLocationRelativeTo(null);

            this.foAblak = this.getContentPane();
            this.foAblak.setLayout(new BorderLayout(10,10));

        this.pnljatekTabla = new JPanel();
        this.pnljatekTabla.setLayout(new GridLayout(9,9));

        this.foAblak.add(BorderLayout.CENTER,this.pnljatekTabla);

            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);


    }

    private void  sakkTablaMegjelenit()
    {
        this.pnljatekTabla.removeAll();
        this.pnljatekTabla.add( new JLabel());
        for (int i = 0; i < 8; i++) {
            JLabel hivatkozasABC = new JLabel();
            hivatkozasABC.setText(String.format("%s.", (char)(i+65)));
            hivatkozasABC.setHorizontalAlignment((SwingConstants.CENTER));
            hivatkozasABC.setVerticalAlignment((SwingConstants.CENTER));
            this.pnljatekTabla.add(hivatkozasABC);
        }


        for (int i = 0; i < 8; i++) {
            JLabel hivatkozas123 = new JLabel();
            hivatkozas123.setText(String.format("%d.", (8-i)));
            hivatkozas123.setHorizontalAlignment(SwingConstants.CENTER);
            hivatkozas123.setVerticalAlignment(SwingConstants.CENTER);
            this.pnljatekTabla.add(hivatkozas123);


            for (int j = 0; j < 8; j++) {
                Mezo m = new Mezo(i,j,tabla.getErtek(i,j));

                this.pnljatekTabla.add(m);
            }
        }
        this.revalidate();
        this.repaint();
    }




}
