package org.firstinspires.ftc.teamcode.auton;

import org.firstinspires.ftc.teamcode.auton.Robo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Projects.HWMapBasic;
@Autonomous
public class basic extends LinearOpMode{
    public HWMapBasic robot = new HWMapBasic();
    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        Robo robo = new Robo();
        robo.setDir(0,1);
        robo.setSpeed(0.5);

    }
    }

