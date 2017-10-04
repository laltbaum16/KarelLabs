package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void carpetRooms(){
        positionFirstRoom();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
    }
        public void faceEast() {
        if(facingWest() == true) {
            turnLeft();
            turnLeft();
        }
        else 
        {
            if(facingNorth() == true) {
                turnRight();}
                else {
                    turnLeft();
                }
            }
    }
    public void checkRoom() {
        faceEast();
        if(frontIsClear() == false) {
            turnLeft();
            if(frontIsClear() == false) {
                turnLeft();
                if(frontIsClear() == false) {
                    turnLeft();
                    putBeeper();
                    reposition();
                }
            }
        }

        else {
            reposition();
        }
    }
    public void reposition(){
        faceEast();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void positionFirstRoom(){
         move();
         turnLeft();
         move();
    }
}
