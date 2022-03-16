// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import frc.robot.Constants.kIntake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final CANSparkMax intakeMotor = new CANSparkMax(kIntake.INTAKE_MOTOR, MotorType.kBrushless);

  public Intake() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void intake() {
    intakeMotor.set(kIntake.INTAKE_SPEED);
  }

  public void eject() {
    intakeMotor.set(kIntake.EJECT_SPEED);
  }
}
