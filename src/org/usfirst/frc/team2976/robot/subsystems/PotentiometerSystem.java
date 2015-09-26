package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.OI;
import org.usfirst.frc.team2976.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 *
 */
public class PotentiometerSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Potentiometer pot = new AnalogPotentiometer(OI.PotentiometerInput, 360, 0);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//RobotDrive.Method; with Method being Stop
    }
}

