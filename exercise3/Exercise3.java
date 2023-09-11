
/**
 *
 * @author Swethha
 */import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x");
        float x = obj.nextFloat();
        System.out.println("Enter y");
        float y = obj.nextFloat();
        System.out.println("Enter xSpeed");
        float xSpeed = obj.nextFloat();
        System.out.println("Enter ySpeed");
        float ySpeed = obj.nextFloat();
        Point pnt = new Point();
        pnt.setXY(x, y);
        System.out.println(pnt);
        MovablePoint movablePoint = new MovablePoint(xSpeed, ySpeed);
        movablePoint.setXY(x, y);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

class Point {

    float x, y;

    void Point(float x1, float y1) {
        x = x1;
        y = y1;
    }

    Point() {
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class MovablePoint extends Point {

    float xSpeed;
    float ySpeed;

    MovablePoint() {
    }

    MovablePoint(float x1speed, float y1speed) {
        xSpeed = x1speed;
        ySpeed = y1speed;
    }

    float getSpeedX() {
        return xSpeed;
    }

    void setSpeedX(float speedX) {
        this.xSpeed = speedX;
    }

    float getSpeedY() {
        return ySpeed;
    }

    void setSpeedY(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    float[] getSpeedXY() {
        return new float[]{xSpeed, ySpeed};
    }

    void setSpeed(float x, float y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
