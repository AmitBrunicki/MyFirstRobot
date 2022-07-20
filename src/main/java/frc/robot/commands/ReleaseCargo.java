package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;

public class ReleaseCargo extends CommandBase {

    private Storage storage;
    private Shooter shooter;

    public ReleaseCargo(Shooter shooter, Storage storage) {
        this.shooter = shooter;
        this.storage = storage;
    }

    @Override
    public void execute() {
        this.storage.on();
        this.shooter.shoot();
    }

    @Override
    public void end(boolean interrupted) {
        this.shooter.stop();
        this.storage.stop();
    }
}
