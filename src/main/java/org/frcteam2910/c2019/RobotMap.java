package org.frcteam2910.c2019;

public class RobotMap {

    public static final int GRABBER_TOP_MOTOR = 5;
    public static final int GRABBER_BOTTOM_MOTOR = 6;

    public static final int ARM_MOTOR_A = 7;
    public static final int ARM_MOTOR_B = 8;
    // Currently both are temporary and literally magic numbers afaik

    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 3;
    public static final double DRIVETRAIN_FRONT_LEFT_ANGLE_OFFSET = Math.toRadians(18.1);
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 0;
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 1;

    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 0;
    public static final double DRIVETRAIN_FRONT_RIGHT_ANGLE_OFFSET = Math.toRadians(199.05);
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 1;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 2;
    
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 1;
    public static final double DRIVETRAIN_BACK_LEFT_ANGLE_OFFSET = Math.toRadians(283.292);
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 2;
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 4;

    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 2;
    public static final double DRIVETRAIN_BACK_RIGHT_ANGLE_OFFSET = Math.toRadians(231.978);
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 3;
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 2;
}