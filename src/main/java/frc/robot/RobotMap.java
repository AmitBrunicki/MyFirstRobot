package frc.robot;

public class RobotMap {
    public interface CAN {
        int DRIVETRAIN_LEFT_TALON_1 = -1;
        int DRIVETRAIN_LEFT_TALON_2 = -1;
        int DRIVETRAIN_RIGHT_TALON_1 = -1;
        int DRIVETRAIN_RIGHT_TALON_2 = -1;
        int SHOOTER_VICTORSPX_1 = -1;
        int SHOOTER_VICTORSPX_2 = -1;
        int INTAKE_VICTORASPX = -1;
        int STORAGE_VICTORASPX = -1;
    }

    public interface DIO {
        int SHOOTER_LIMIT = -1;
        int STORAGE_LIMIT = -1;
    }
}
