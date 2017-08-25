package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  L. Altbaum
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void shuttleRace() {
        bottomlefttotopright();
        toprighttobottomleft();
        bottomlefttotopright();
        toprighttobottomleft();
    }
    public void toprighttobottomleft() {
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void bottomlefttotopright() {
        turnLeft();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
}
}