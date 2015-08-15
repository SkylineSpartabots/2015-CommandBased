package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public RobotDrive m_drive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.frontRightMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//RobotDrive.Method; with Method being Stop
    }
}

