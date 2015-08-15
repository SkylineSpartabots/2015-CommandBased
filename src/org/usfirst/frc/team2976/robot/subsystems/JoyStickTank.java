package org.usfirst.frc.team2976.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class JoyStickTank extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Joystick LeftJoyStick = new Joystick(1);
	Joystick RightJoyStick = new Joystick(2);
	
	public double LeftTankJS = LeftJoyStick.getY();
	public double RightTankJS = RightJoyStick.getY();
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

