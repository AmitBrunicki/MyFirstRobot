package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Storage extends SubsystemBase {

    private static final double SPEED = 0.5;
    private WPI_VictorSPX motor;
    private final DigitalInput limit;

    public Storage() {
        this.motor = new WPI_VictorSPX(RobotMap.CAN.STORAGE_VICTORASPX);
        this.limit = new DigitalInput(RobotMap.DIO.STORAGE_LIMIT);
    }

    public void on() {
        this.motor.set(SPEED);
    }

    public void stop() {
        this.motor.stopMotor();
    }

    public boolean getLimit() {
        return this.limit.get();
    }
}
