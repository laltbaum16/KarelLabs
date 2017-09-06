package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        drawH();
        repositionToE();
        drawE();
        repositionToL();
        drawL();
        repositionToL();
        drawL();
        drawO();
    }
    public void drawH(){
        drawVerticalLine();
        turnAroundGoDown2();
        draw4Horizontal();
        goDown2TurnAround();
        drawVerticalLine();
}
public void drawE(){
        drawVerticalLine();
        turnRight();
        draw3Horizontal();
        turnRight();
        move();
        move();
        turnRight();
        putBeeper();
        draw3Horizontal();
        turnLeft();
        move();
        move();
        turnLeft();
        draw3Horizontal();
}
public void drawL(){
        
}
public void drawO(){
        
}
public void draw3Horizontal(){
        move();
        putBeeper();
        move();
        putBeeper();
}
public void repositionToE(){
       turnRight();
       move();
       move();
       turnRight();
       move();
       move();
       move();
       move();
       turnLeft();
       turnLeft();
}
public void repositionToL(){
       move();
       move();
       turnLeft();
}
public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
}
public void turnAroundGoDown2(){
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
}
public void draw4Horizontal(){
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
}
public void goDown2TurnAround(){
        turnRight();
        move();
        move();
        turnLeft();
        turnLeft();
}
public void drawVerticalLine(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
}
}