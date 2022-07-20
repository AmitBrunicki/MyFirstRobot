package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveForward extends CommandBase {

    private final Drivetrain drivetrain;
    private final double speed = 0.5;

    public DriveForward(Drivetrain drivetrain){
        this.drivetrain = drivetrain;
    }

    @Override
    public void execute() {
        this.drivetrain.setLeft(this.speed);
        this.drivetrain.setRight(this.speed);
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stopMotors();
    }
}
