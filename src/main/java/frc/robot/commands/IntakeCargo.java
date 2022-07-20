package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;

public class IntakeCargo extends SequentialCommandGroup {

    public IntakeCargo(Intake intake, Storage storage, Shooter shooter) {
        addCommands(
                new ParallelCommandGroup(new intakeCommand(intake), new StorageCommand(storage)).withInterrupt(storage::getLimit),
                new ParallelCommandGroup(new Shoot(shooter), new StorageCommand(storage)).withInterrupt(shooter::getLimit)
        );
    }
}
