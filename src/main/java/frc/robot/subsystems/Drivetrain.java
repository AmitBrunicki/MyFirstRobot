package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {

    private final MotorControllerGroup left;
    private final MotorControllerGroup right;

    public Drivetrain() {
        this.left = new MotorControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_1),
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_2));
        this.right = new MotorControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_1),
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_2));
        this.right.setInverted(true);
    }

    public void setRight(double value) {
        this.right.set(value);
    }

    public void setLeft(double value) {
        this.left.set(value);
    }

    public void stopMotors(){
        this.left.stopMotor();
        this.right.stopMotor();
    }

}
