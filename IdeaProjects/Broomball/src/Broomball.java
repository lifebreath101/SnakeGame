import objectdraw.FilledOval;
import objectdraw.FilledRect;
import objectdraw.Location;
import objectdraw.WindowController;

import java.awt.*;

public class Broomball extends WindowController {

    private final int DUST_SIZE = 30;
    private final int BROOM_SIZE = 20;

    private final int DUST_X_COORD = 290;
    private final int DUST_Y_COORD = 195;
    private final int BROOM_X_COORD = 185;
    private final int BROOM_Y_COORD = 180;

    private FilledOval Broom;
    private FilledRect Dust;

    public void begin() {

        Broom = new FilledOval(BROOM_X_COORD, BROOM_Y_COORD, BROOM_SIZE, BROOM_SIZE, Color.BLACK , canvas );

        Dust = new FilledRect(DUST_X_COORD, DUST_Y_COORD, DUST_SIZE, DUST_SIZE, Color.ORANGE ,canvas);

        Broom.hide();

    }

    private boolean ifOnTop(FilledOval filledOval, FilledRect filledRect) {

        if(filledOval.getY() < filledRect.getY() && filledOval.overlaps(filledRect)) {

            return true;
        }
        else{return false;}
    }

    private boolean ifOnBottom(FilledOval filledOval, FilledRect filledRect) {

        if(filledOval.getY() > filledRect.getY() && filledOval.overlaps(filledRect)) {

            return true;
        }
        else{return false;}
    }

    private boolean ifOnLeft(FilledOval filledOval, FilledRect filledRect) {

        if(filledOval.getX() < filledRect.getX() && filledOval.overlaps(filledRect)) {

            return true;
        }
        else{return false;}
    }

    private boolean ifOnRight(FilledOval filledOval, FilledRect filledRect) {

        if(filledOval.getX() > filledRect.getX() && filledOval.overlaps(filledRect)) {

            return true;
        }
        else{return false;}
    }

    public void onMouseMove(Location point) {

        Broom.show();

        Broom.moveTo(point);
    }

    public void onMouseExit(Location point) {

        Broom.hide();

        Broom.moveTo(BROOM_X_COORD,BROOM_Y_COORD);
        Dust.moveTo(DUST_X_COORD, DUST_Y_COORD);

    }

    public void onMousePress(Location point) {

        Broom.moveTo(point);

        //the original thought was that statements in Onmousepress and Onmousedrag had to be the same
        //if (ifOnTop(Broom, Dust) == true && Broom.overlaps(Dust)) {

            //Dust.moveTo(Dust.getX(), Dust.getY() + 4);
        //}
    }

    public void onMouseDrag(Location point) {

        Broom.moveTo(point);

        if (ifOnLeft(Broom, Dust) == true && Broom.overlaps(Dust)) {

            Dust.moveTo(Dust.getX() + 4, Dust.getY());
        }

        if (ifOnRight(Broom, Dust) == true && Broom.overlaps(Dust)) {

            Dust.moveTo(Dust.getX() - 4, Dust.getY());
        }

        if (ifOnTop(Broom, Dust) == true && Broom.overlaps(Dust)) {

            Dust.moveTo(Dust.getX(), Dust.getY() + 4);
        }

        if (ifOnBottom(Broom, Dust) == true && Broom.overlaps(Dust)) {

            Dust.moveTo(Dust.getX(), Dust.getY() - 4);
        }


    }

    public static void main(String[] args) {

        new Broomball().startController(400, 400);

    }

}


//TODO: try to fix "edge cases"