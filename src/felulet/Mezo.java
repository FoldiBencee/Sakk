package felulet;

import javax.swing.*;
import java.awt.*;

public class Mezo extends JButton {

    private int x;
    private int y;
    private  int ertek;

    public Mezo(int x, int y, int ertek) {
        this.x = x;
        this.y = y;
        this.ertek = ertek;


        this.frissit();
    }

    public void frissit()
    {
        if ((this.x + this.y) % 2 ==0)
        {
            this.setBackground(Color.decode("#FFFFFF"));
        }
        else
        {
            this.setBackground(Color.decode("#8B4513"));
        }


        String fajlNev = "img/ures.png";
        switch (this.ertek)
        {
            case 11:fajlNev ="logika/feherGyalog.png"; break;
            case 12:fajlNev ="logika/feherBastya.png"; break;
            case 13:fajlNev ="logika/feherHuszar.png"; break;
            case 14:fajlNev ="logika/feherFuto.png"; break;
            case 15:fajlNev ="logika/feherVezer.png"; break;
            case 16:fajlNev ="logika/feherKiraly.png"; break;
            case 21:fajlNev ="loga/feketeGyalog.png"; break;
            case 22:fajlNev ="logika/feketeBastya.png"; break;
            case 23:fajlNev ="logika/feketeHuszar.png"; break;
            case 24:fajlNev ="logika/feketeFuto.png"; break;
            case 25:fajlNev ="logika/feketeVezer.png"; break;
            case 26:fajlNev ="logika/feketeKiraly.png"; break;



        }

        Image img = new ImageIcon(fajlNev).getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(img));

        this.revalidate();
        this.repaint();
    }

}
