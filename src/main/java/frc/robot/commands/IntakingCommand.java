// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Intake;

public class IntakingCommand extends Command {
  /** Creates a new IntakeCommand. */
  Intake m_intake;
  double m_speed_intake;

  

  public IntakingCommand(Intake intake, double speed_intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_intake = intake;
    this.m_speed_intake = speed_intake;
    
   
    addRequirements(m_intake);
  }


  @Override
  public void initialize() {
  }

 
  @Override
  public void execute() 
  { 
     
     m_intake.setIntake(m_speed_intake);
   
}
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.mIntakeMotor.stopMotor();
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
