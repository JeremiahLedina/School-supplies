public class RegistrationForm {
	public static void main(String[] args) {
		
		
//Top details
int studentNumber = 20240535, semester = 2, scheme = 1, schoolYearStart = 2024, schoolYearEnd = 2025, studentYear = 1, totalUnits = 27;


//School Year Variables
int DD = 8, MM = 1;

//Subjects
int CP2 = 103, WST = 107, TCC = 108, CA = 121, CWTS2 = 122, EBFA = 2;

String TCW = "003", PLE = "001";

//Units
int TCWUnit = 3, PLEUnit = 3, CWTS2Unit = 3, EBFAUnit = 2, CP2Unit = 5, WSTUnit = 5, TCCUnit = 3, CAUnit =3;

//Schedule
String CP2Time = "5PM-9PM/5PM-7PM", TCCTime = "4:30PM-8:30PM", CATime = "11:00AM-3:00PM", TCWTime = "11:00AM-3:00PM", EBFATime = "10:00AM-1:00pm";


   System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t=UNIVERSITY OF CALOOCAN CITY=\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t     REGISTRATION FORM");
   System.out.println("\n                                                                                                                                                                                                                CAMPUS: South - Main Campus");
   System.out.println("=============================================================================================================================================================================================================================================");
   System.out.println(" STUDENT #:                                                                                                     SCHOOL YEAR:                                                                                            DATE:");
   System.out.println("  "+ studentNumber +"-S                                                                                                     "+schoolYearStart+"-"+schoolYearEnd+"                                                                                                "+"0"+MM+"/0"+DD+"/"+schoolYearEnd);
   System.out.println(" NAME:                                                                                                           SEMESTER:                                                                                              SCHEME:");
   System.out.println("  BORLONGAN, GIANNA JEAN LORENZO                                                                                   "+semester+"ND                                                                                                     "+scheme);
   System.out.println(" COURSE/YEAR/SECTION:\n  BSCS "+semester+"ST-A-SOUTH");
   
System.out.println("=============================================================================================================================================================================================================================================");
System.out.println("=============================================================================================================================================================================================================================================");
System.out.println
("   SUBJECT     UNIT  DESCRIPTION                                                                                     TIME               DAY       ROOM                    PROFESSOR                                         ");
System.out.println
("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
System.out.println
("CC "+CP2+"          "+CP2Unit+"    COMPUTER PROGRAMMING 2                                                                          "+CP2Time+"    M/TH      MULTIMEDIA ROOM-S       VICTORIA, EFREN PANGILINAN                        ");
System.out.println
("CC "+WST+"          "+WSTUnit+"    WEB SYSTEM AND TECHNOLOGIES                                                                                                  ROOM 208                                        ");
System.out.println
("CC "+TCC+"          "+TCCUnit+"    TECHNICAL COMPUTER CONCEPTS                                                                     "+TCCTime+"       T        CSD LECTURE ROOM 1-S    VILLANUEVA, ALDRIN M.                        ");
System.out.println
("CSM "+CA+"         "+CAUnit+"    COLLEGE ALGEBRA                                                                                 "+CATime+"      T                                DE GUZMAN, RENATO S.                        ");
System.out.println
("GEC "+TCW+"         "+TCWUnit+"    THE CONTEMPORARY WORLD                                                                          "+TCWTime+"      M        CSD LECTURE ROOM 1-S    ALBERTO, LORENZO R.                        ");
System.out.println
("LIT "+PLE+"         "+PLEUnit+"    PHIILIPPINE LITERATURE IN ENGLISH                                                                                            ROOM 208                                        ");
System.out.println
("NSTP "+CWTS2+"        "+CWTS2Unit+"    CIVIC WELFARE TRAINING SERVICES 2                                                                                            ROOM 208                                        ");
System.out.println
("PATHFIT "+EBFA+"       "+EBFAUnit+"    EXERCISES-BASED FITNESS ACTIVITIES                                                              "+EBFATime+"      W        COURT-S                 FABILLAR, CYNTHIA  F.   ");
System.out.println
("\n\n\n\n\n\n");
System.out.println
("         TOTAL: 27   ");
System.out.println
("            RECOMMENDING APPROVAL: _________________________________________  ");
System.out.println
("                                            PROGRAM HEAD/CHAIR/COOR.    ");
System.out.println("=============================================================================================================================================================================================================================================");





	}
}