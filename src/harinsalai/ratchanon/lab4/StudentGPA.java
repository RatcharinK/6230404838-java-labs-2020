package harinsalai.ratchanon.lab4;

import java.util.Scanner;

public class StudentGPA {
    static int MAX_NUMBER_OF_COURSES = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSES];
    static int[] term = new int[MAX_NUMBER_OF_COURSES];
    static String[] courseName = new String[MAX_NUMBER_OF_COURSES];
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSES];
    static String[] grade = new String[MAX_NUMBER_OF_COURSES];
    static int numberOfCourses = 0;

    public static void main(String[] args) {
        inputGrades();
        showGPA();
    }

    //create scanner
    static Scanner inputscanner = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);

    public static void inputGrades() {
        System.out.println("Enter grades of student (year term course_number credit grade)" +
                            "\nFinish when enter year with 0");
        while (true) {
            int getYear = inputscanner.nextInt();
            if (getYear == 0) {
                break;
            }

            int getTerm = inputscanner.nextInt();
            String getCoursename = inputscanner.next();
            int getCoursecredit = inputscanner.nextInt();
            String getGrade = inputscanner.next();
            for (int i = numberOfCourses-1 ; i < numberOfCourses; i++) {
                year[numberOfCourses] = getYear;
                term[numberOfCourses] = getTerm;
                courseName[numberOfCourses] = getCoursename;
                courseCredit[numberOfCourses] = getCoursecredit;
                grade[numberOfCourses] = getGrade;

            }
            numberOfCourses++;
        }
    }

    public static void showGPA() {
        while (true) {
            System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, 't' for GPA for specific term or 'q' to exit");
            String command = scan.nextLine();
            if (command.equals("q")) {
                System.exit(0);
            } else if (command.equals("o")) {
                seeAllcourses();
            } else if (command.equals("a")) {
                accumulatedGPA();
            } else if (command.equals("t")) {
                seeSpecificterm();
            }
        }
    }

    static void seeAllcourses() {
        System.out.println("year  term  course_number  credit  grade");
        for (int i = 0; i < numberOfCourses; i++) {

            System.out.println(year[i] + " " + term[i] + " " + courseName[i] + " " + courseCredit[i] + " " + grade[i]);
        }
    }

    static void accumulatedGPA() {
        double summation = 0;
        double summation_credit = 0;
        double numGrade = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            if (grade[i].equals("A")) {
                numGrade = 4;
            } else if (grade[i].equals("B+")) {
                numGrade = 3.5;
            } else if (grade[i].equals("B")) {
                numGrade = 3;
            } else if (grade[i].equals("C+")) {
                numGrade = 2.5;
            } else if (grade[i].equals("C")) {
                numGrade = 2;
            } else if (grade[i].equals("D+")) {
                numGrade = 1.5;
            } else if (grade[i].equals("D")) {
                numGrade = 1;
            } else if (grade[i].equals("F")) {
                numGrade = 0;
            }
            summation += numGrade * courseCredit[i];
            summation_credit += courseCredit[i];
        }
        double gpaaccumulated = summation / summation_credit;
        System.out.println("Accumulated GPA is " + gpaaccumulated);
    }

    static void seeSpecificterm() {
        System.out.println("Enter which year and term do you want to see GPA");
        int seeYear = scan.nextInt();
        int seeTerm = scan.nextInt();
        double summation = 0;
        double summation_credit = 0;
        double numGrade = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            if (seeYear == year[i] && seeTerm == term[i]) {
                if (grade[i].equals("A")) {
                    numGrade = 4;
                } else if (grade[i].equals("B+")) {
                    numGrade = 3.5;
                } else if (grade[i].equals("B")) {
                    numGrade = 3;
                } else if (grade[i].equals("C+")) {
                    numGrade = 2.5;
                } else if (grade[i].equals("C")) {
                    numGrade = 2;
                } else if (grade[i].equals("D+")) {
                    numGrade = 1.5;
                } else if (grade[i].equals("D")) {
                    numGrade = 1;
                } else if (grade[i].equals("F")) {
                    numGrade = 0;
                }
                summation += numGrade * courseCredit[i];
                summation_credit += courseCredit[i];
            }
        }
        double gpaspecaccumulated = summation / summation_credit;
        System.out.println("Accumulated GPA is " + gpaspecaccumulated);
    }
}


