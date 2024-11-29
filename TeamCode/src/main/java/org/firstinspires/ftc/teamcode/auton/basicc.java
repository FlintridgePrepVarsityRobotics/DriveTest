package org.firstinspires.ftc.teamcode.auton;

import org.firstinspires.ftc.teamcode.auton.Robo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Projects.HWMapBasic;
@Autonomous
public class basicc extends LinearOpMode{
    public HWMapBasic robot = new HWMapBasic();
    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        robot.fRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.bLeftWheel.setPower(0.2);
        sleep(2000);
        robot.fRightWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(-0.2);
        robot.bLeftWheel.setPower(-0.2);
        sleep(850);
        robot.fRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.bLeftWheel.setPower(0.2);
        sleep(3750);
        robot.fRightWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(-0.2);
        robot.bLeftWheel.setPower(-0.2);
        sleep(850);
        robot.fRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.bLeftWheel.setPower(0.2);
        sleep(2500);
        robot.fRightWheel.setPower(-0.2);
        robot.bRightWheel.setPower(-0.2);
        robot.fLeftWheel.setPower(0.2);
        robot.bLeftWheel.setPower(0.2);
        sleep(850);
        robot.fRightWheel.setPower(0.2);
        robot.fLeftWheel.setPower(0.2);
        robot.bRightWheel.setPower(0.2);
        robot.bLeftWheel.setPower(0.2);
        sleep(1000);
    }
}

