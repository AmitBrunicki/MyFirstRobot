package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Storage;

public class StorageCommand extends CommandBase {

    private final Storage storage;

    public StorageCommand(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        this.storage.on();
    }

    @Override
    public void end(boolean interrupted) {
        this.storage.stop();
    }
}
