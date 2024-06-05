package chrisgiordino;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class ChrisGiordino extends Robot {
    int turnDirection = 1;

    public void run(){

        //setup
        
        //handle spawn randomness

        while(true){

            turnRight(360);

        }

       

        }
 
    public void onScannedRobot(ScannedRobotEvent e){
        double lockOn = getHeading() + e.getBearing() - getRadarHeading();
        turnRight(lockOn);

        fire(1);
        ahead(e.getDistance() + 10);
        fire(600/e.getDistance());
    }


    public void onHitRobot(HitRobotEvent e){
        double lock = getHeading() + e.getBearing() - getRadarHeading();
        turnRight(lock);

        ahead(10);

        fire(90);
    }
}