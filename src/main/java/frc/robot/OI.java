package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;


public class OI /* GEVALD */ {

    private final XboxController xboxController = new XboxController(-1);

    public OI(Shooter shooter, Intake intake, Drivetrain drivetrain, Storage storage) {

        JoystickButton rightBumper = new JoystickButton(xboxController, XboxController.Button.kRightBumper.value);
        JoystickButton leftBumper = new JoystickButton(xboxController, XboxController.Button.kLeftBumper.value);
        JoystickButton A = new JoystickButton(xboxController, XboxController.Button.kA.value);
        JoystickButton B = new JoystickButton(xboxController, XboxController.Button.kB.value);
        JoystickButton X = new JoystickButton(xboxController, XboxController.Button.kX.value);
        JoystickButton Y = new JoystickButton(xboxController, XboxController.Button.kY.value);

        rightBumper.whileHeld(new ReleaseCargo(shooter, storage));
        leftBumper.whileHeld(new IntakeCargo(intake, storage, shooter));
        A.whileHeld(new DriveBackward(drivetrain));
        B.whileHeld(new RotateRight(drivetrain));
        Y.whileHeld(new DriveForward(drivetrain));
        X.whileHeld(new RotateLeft(drivetrain));


    }
}
