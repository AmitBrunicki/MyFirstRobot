package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class intakeCommand extends CommandBase {

    private  final Intake intake;

    public intakeCommand(Intake intake) {
        this.intake = intake;
    }

    @Override
    public void execute() {
        this.intake.take();
    }

    @Override
    public void end(boolean interrupted) {
        this.intake.stop();
    }
}
