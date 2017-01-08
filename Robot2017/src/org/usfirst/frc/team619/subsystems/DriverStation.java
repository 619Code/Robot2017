package org.usfirst.frc.team619.subsystems;

import org.usfirst.frc.team619.hardware.Gamepad;

/**
 *
 * @author CaRobotics
 */
public class DriverStation {
    protected Gamepad leftController, rightController;

    public DriverStation(){
        leftController = new Gamepad(1);
        rightController = new Gamepad(2);
    }

    public DriverStation(int leftJoystickID, int rightJoystickID){
        leftController = new Gamepad(leftJoystickID);
        rightController = new Gamepad(rightJoystickID);
    }

    public Gamepad getLeftJoystick() {
        return leftController;
    }

    public Gamepad getRightJoystick() {
        return rightController;
    }
}
