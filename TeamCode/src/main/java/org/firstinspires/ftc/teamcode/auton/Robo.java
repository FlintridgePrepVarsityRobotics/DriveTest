package org.firstinspires.ftc.teamcode.auton;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Projects.HWMapBasic;
class Robo extends LinearOpMode{
    public HWMapBasic robot = new HWMapBasic();
    int dirX = 0;
    int dirY = 0;
    double fRightMotorPower = 0;
    double bRightMotorPower = 0;
    double fLeftMotorPower = 0;
    double bLeftMotorPower = 0;
    double speed = 0;

    public void runOpMode() {
        while (!isStarted() && !isStopRequested()) {}
        robot.init(hardwareMap);
        while (opModeIsActive()) {
            Robo robo = new Robo();
            robo.setDir(0, 1);
            robo.setSpeed(0.5);
            sleep(500);
            robo.setDir(1, 0);
            sleep(500);
            robo.setSpeed(0);
        }



    }


    public Robo() {

    }

    public void update() {
        robot.fRightWheel.setPower(fRightMotorPower);
        robot.fLeftWheel.setPower(fLeftMotorPower);
        robot.bRightWheel.setPower(bRightMotorPower);
        robot.bLeftWheel.setPower(bLeftMotorPower);
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public void setPowers(double fr, double br, double fl, double bl) {
        fRightMotorPower = fr * speed;
        bRightMotorPower = br * speed;
        fLeftMotorPower = fl * speed;
        bLeftMotorPower = br * speed;
    }

    public void setDir(int x, int y) {
        dirX = x;
        dirY = y;
        updateDir();
    }

    public void updateDir() {
        if (dirX == 0 && dirY == 1) {
            setPowers(1, 1, 1, 1);
        } else if (dirX == 0 && dirY == -1) {
            setPowers(-1, -1, -1, -1);
        } else if (dirX == 1 && dirY == 0) {
            setPowers(-1, 1, 1, -1);
        } else if (dirX == -1 && dirY == 0) {
            setPowers(1, -1, -1, 1);
        } else if (dirX == 1 && dirY == 1) {
            setPowers(0, 1, 1, 0);
        } else if (dirX == -1 && dirY == -1) {
            setPowers(0, -1, -1, 0);
        }
        update();
    }
}
