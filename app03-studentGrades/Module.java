
/**
 * Write a description of class Modules here.
 *
 * @author (James Pjetri)
 * @version (01/11/2020)
 */

public class Module
{
    public String title;
    
    public String moduleCode;
    
    public int modulePercentage;

    /**
     * Constructor for objects of class Module.
     */
    public Module(String moduleName, String moduleID, int percentage)
    {
        title = moduleName;
        
        moduleCode = moduleID;
        
        modulePercentage = percentage;
        
        percentage = 0;
        
    }
    
    /**
     * Allows the user to print the module information.
     */
    public void printModules()
    {
        System.out.println("Title: " + title + " Module Code: " + moduleCode);
        System.out.println("Percentage: " + modulePercentage);
    }
}