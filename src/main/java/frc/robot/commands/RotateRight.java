package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class RotateRight extends CommandBase {

    private final Drivetrain drivetrain;
    private final double speed = -0.5;

    public RotateRight(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    @Override
    public void execute() {
        this.drivetrain.setRight(this.speed);
        this.drivetrain.setLeft(Math.abs(this.speed));
    }

    @Override
    public void end(boolean interrupted) {
        this.drivetrain.stopMotors();
    }
}
