/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.JustDrive;



/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ShootyBotDrive extends Subsystem {


  Spark leftMotor = new Spark(RobotMap.left_motor);
  Spark rightMotor = new Spark(RobotMap.right_motor);
  //2 sparks

  DifferentialDrive drivetrain = new DifferentialDrive(leftMotor, rightMotor);

  public void shootyBotDrive(double speed, double x, double turn){
    drivetrain.arcadeDrive(x*speed, turn*speed);
    //speed is going to be multiplier
    //output for the sparks
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new JustDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
