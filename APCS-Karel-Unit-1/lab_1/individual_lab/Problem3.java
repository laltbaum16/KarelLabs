package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void giveCarlBeeper() {
        turnRight();
        move();
        move();
        move();
        putBeeper();
    }
    public void returnPosition() {
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void returnPosition2() {
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
    }
   
}