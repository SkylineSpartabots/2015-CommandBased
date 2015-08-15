package org.usfirst.frc.team2976.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//map for pwm channels 1 - 10
    public static final int
    	//RobotDrive(int frontLeftMotor, int rearLeftMotor, int frontRightMotor, int rearRightMotor)
             frontLeftMotor 	= 4, //PWM 4
             rearLeftMotor 		= 2, //PWM 2
             frontRightMotor 	= 3, //PWM 3
             rearRightMotor 	= 1; //PWM 1
 }
