import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author James Pjetri 
 * @version 01/11/2020
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken 
    private int credits;
    
    // Hold the grades of the student for each module
    private int module1points;
    private int module2points;
    private int module3points;
    private int module4points;
    
    // Hold the final mark
    private int totalPoints;
    
    // Holds what grade the students got
    private String grades;
    
    // Allows Student to communicate with student class
    private ArrayList<Course> courses;
    
    /**
     * Create a new student with a name and ID number
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
        
        //This will show what course the students are doing
        courses = new ArrayList<Course>();
    }

   
     /**
     * Return the full name of this student
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
   
    /**
     * this would make a new course 
     */
    public void enrollCourses(Course newCourse)
    {
        courses.add(newCourse);
    }
    
    
    /**
     * Return the student ID of this student
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's already credits
     */
    public void addCredits(int additionalPoints)
    {
        credits = additionalPoints;
    }

       public void inputgrades(int module1points , int module2points , int module3points , int module4points)
    {
        System.out.print(module1points + ", " + module2points + ", " + module3points + ", " + module4points);
    }

    /**
     * This will calculate the students grades
     */
    public void setGrades()
    {
        totalPoints = ((module1points + module2points + module3points + module4points) / 4);
        if(totalPoints <= 40)
        {
            grades = "F";
        }
        else if((totalPoints <= 49) && (totalPoints >= 41))
        {
            grades = "D";
        }
        else if((totalPoints >= 59) && (totalPoints >= 50))
        {
            grades = "C";
        }
        else if((totalPoints >= 69) && (totalPoints >= 60))
        {
            grades = "B";
        }
        else if((totalPoints >= 100) && (totalPoints >= 70))
        {
            grades = "A";
        }
    } 
   
    
    
    /**
     * Return the number of credit points this student has been awarded
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
    
    
    /**
     * This will print the studenst grades
     */
    public void printGrades()
    {
        System.out.print(name + "s " + grades + totalPoints);
    }
}


