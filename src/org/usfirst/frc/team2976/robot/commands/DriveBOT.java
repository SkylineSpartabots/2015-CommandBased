package org.usfirst.frc.team2976.robot.commands;

import org.usfirst.frc.team2976.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2976.robot.subsystems.JoyStickTank;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class DriveBOT extends Command {
	public static DriveTrain drivetrain = new DriveTrain();
	public static JoyStickTank joysticktank = new JoyStickTank();

    public DriveBOT() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drivetrain);
    	requires(joysticktank);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	drivetrain.m_drive.tankDrive(joysticktank.LeftTankJS, joysticktank.RightTankJS);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
