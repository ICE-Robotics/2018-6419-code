package org.usfirst.frc.team6419.robot;

import edu.wpi.first.wpilibj.DriverStation.Alliance;

public class ScaleInformation {
	private static char SWITCH_LOCATION = ' ';
	private static  char SCALE_LOCATION = ' ';
	public static char OPPONENT_SWITCH_LOCATION = ' ';
	public static int POSITION;
	public static Alliance alliance;
	
	
	
	
	public static Alliance getAlliance() {
		return alliance;
	}




	public static void setAlliance(Alliance alliance) {
		ScaleInformation.alliance = alliance;
	}




	public static int getPOSITION() {
		return POSITION;
	}




	public static void setPOSITION(int pOSITION) {
		POSITION = pOSITION;
	}




	public static char getSWITCH_LOCATION() {
		return SWITCH_LOCATION;
	}

	
	
	
	public static void setSWITCH_LOCATION(char sWITCH_LOCATION) {
		SWITCH_LOCATION = sWITCH_LOCATION;
	}
	public static char getSCALE_LOCATION() {
		return SCALE_LOCATION;
	}
	public static void setSCALE_LOCATION(char sCALE_LOCATION) {
		SCALE_LOCATION = sCALE_LOCATION;
	}
	public static char getOPPONENT_SWITCH_LOCATION() {
		return OPPONENT_SWITCH_LOCATION;
	}
	public static void setOPPONENT_SWITCH_LOCATION(char oPPONENT_SWITCH_LOCATION) {
		OPPONENT_SWITCH_LOCATION = oPPONENT_SWITCH_LOCATION;
	}

	
	
	

	
	
	
	
	
	
	
}
