
package culminatingcannon;

//Import decimal format
import java.text.DecimalFormat;

/**
 *
 * @author wipri9236
 */
public class CulminatingCannon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Decimal Format to give awnser to two decimal places
        DecimalFormat x = new DecimalFormat("##.##");

        //Declare variables
        int numVar = 0;
        double v1, v1x, v1y, v2, v2y, dx, dy, t, a, theta1, theta2, solution;
        String unknownVar = "", varName = "";
        
        //Array holding the users variable values with each index corresponding to a specific variable
        double[] varValue = new double[numVar];
        

        //Create a new decisionmaker object called awnser
        //Input the users unknown and known variables, the number of variables, and the value of all of them
        decisionMaker awnser = new decisionMaker(unknownVar, numVar, varName, varValue);
        
        //Find the users unknown variable and store in solution variable
        solution = awnser.decisionStatements();
        
        //Output the users solution
        System.out.println(x.format(solution));
                
    }
    

}
