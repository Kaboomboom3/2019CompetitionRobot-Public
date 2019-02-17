package org.frcteam2910.c2019;

public class RobotMap {

    public static final int GRABBER_TOP_MOTOR = 5;
    public static final int GRABBER_BOTTOM_MOTOR = 6;

    public static final int ARM_MOTOR_A = 7;
    public static final int ARM_MOTOR_B = 8;
    // Currently both are temporary and literally magic numbers afaik

    public static final int CLIMBER_SOLENOID_MODULE = 0;
    public static final int CLIMBER_SOLENOID_CHANNEL = 1;

    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 4;
    public static final double DRIVETRAIN_FRONT_LEFT_ANGLE_OFFSET = Math.toRadians(-223.0 + 180.0);
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 0;
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 10;

    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 7;
    public static final double DRIVETRAIN_FRONT_RIGHT_ANGLE_OFFSET = Math.toRadians(-5.1);
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 3;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 6;
    
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 5;
    public static final double DRIVETRAIN_BACK_LEFT_ANGLE_OFFSET = Math.toRadians(-357.0 + 180.0);
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 1;
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 9;

    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 6;
    public static final double DRIVETRAIN_BACK_RIGHT_ANGLE_OFFSET = Math.toRadians(-280.0);
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 2;
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 7;
}
