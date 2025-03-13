/**
 * KIT107 Assignment 1
 *
 * PostCode Finder -- Driver
 *
 * @author J. Dermoudy
 * @version 3/3/2025
 * 
 * This file is COMPLETE.
 * 
 */


public class AssigOne125
{
    /*
     * main() -- entry point
     *
     * @param args -- command line arguments
     */
    public static void main(String []args)
    {
        PostCodes pc;    // the organiser object
        
        pc=new PostCodes();    // initialise the PostCodes object
        
        pc.configure();     // get the user's preferences for printing
        pc.printTable();    // do the printing
    }
}
