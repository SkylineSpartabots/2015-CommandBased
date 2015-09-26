
package org.usfirst.frc.team2976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2976.robot.Robot;
import org.usfirst.frc.team2976.robot.subsystems.PotentiometerSystem;

public class PotentiometerCommand extends Command {
	public static PotentiometerSystem pots = new PotentiometerSystem();

    public PotentiometerCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(pots);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("Potentiometer Value", pots.pot.get());
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
