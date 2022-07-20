package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {

    private final double speed = 0.5;
    private WPI_VictorSPX motor;


    public Intake() {
        this.motor = new WPI_VictorSPX(RobotMap.CAN.INTAKE_VICTORASPX);
    }

    public void take() {
        this.motor.set(this.speed);
    }

    public void stop() {
        this.motor.stopMotor();
    }
}
