package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {

    private final Shooter shooter;

    public Shoot(Shooter shooter) {
        this.shooter = shooter;
    }

    @Override
    public void execute() {
        this.shooter.shoot();
    }

    @Override
    public void end(boolean interrupted) {
        this.shooter.stop();
    }
}
