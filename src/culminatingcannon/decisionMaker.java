/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package culminatingcannon;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class decisionMaker extends MathMethods{ 

    //Declare private variables
    private double v1, v1x, v1y, v2, v2y, dx,
     dy, t, a, theta1, theta2;
    private double awnser;
    private int num;
    private String unknown, megaString;
    String[] varNameArray = {"v1","v1x","v1y","v2","v2y","dx","dy","t","a","theta1","theta2"};
    
    //Constructor to set variable values from user input
    public decisionMaker(String unknownVar, int numVar, String varName, double[] varValue){
        
        //Set values for variables
        num = numVar;
        unknown = unknownVar;
        megaString = varName;
        
        //Set variable values *Ensure that values input by user go in this order in array
        v1 = varValue[0];
        v1x = varValue[1];
        v1y = varValue[2];
        v2 = varValue[3];
        v2y = varValue[4];
        dx = varValue[5];
        dy = varValue[6];
        t = varValue[7];
        a = varValue[8];
        theta1 = varValue[9];
        theta2 = varValue[10];
    } 
    
    /**
    * pre: void
    * post: answer
    * Method to determine which math method to run in superclass to get answer
    */
    public double decisionStatements() {
        //Method to check the users unknown variable and to decide which case to run
        //Megastring name contains all the known variables the user has in alphabetical order
        //Switch statements in each unknown go through every possibility as given in superclass
        
        //Check if the unknown variable is the initial velocity
        if(unknown == "v1"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method in superclass
                case "theta1v1y": awnser = oppThetaOFhyp(v1y,theta1);
                break;
                case "theta1v1x": awnser = adjThetaOFhyp(v1x,theta1);
                break;
                case "v1xv1y": awnser = pythagFORHypotenuse(v1x,v1y);
                break;
            }
        }
        
        //Check if the unknown variable is the initial x velocity
        else if(unknown == "v1x"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dxt": awnser = dxtOFv1x(dx,t) ;
                break;
                case "theta1v1y": awnser = oppThetaOFadj(v1y,theta1);
                break;
                case "theta2v2y": awnser = oppThetaOFadj(v2y,theta2);
                break;
                case "v1v1y": awnser = pythagFORSidelength(v1,v1y);
                break;
            }
        }
        
        //Check if the unknown variable is the initial y velocity
        else if(unknown == "v1y"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "adyt": awnser = dytaOFv1y(dy,t,a);
                break;
                case "atv2y": awnser =v2yatOFv1y(v2y,a,t);
                break;
                case "adyv2y": awnser=v2yadyOFv1y(v2y,a,dy);
                break;
                case "dytv2y": awnser=v2ydytOFv1y(v2y,dy,t);
                break;
                case "theta1v1x": awnser = adjThetaOFopp(v1x,theta1);
                break;
                case "v1v1x": awnser = pythagFORSidelength(v1,v1x);
                break;
            }
        }
        
        //Check if the unknown variable is the final velocity
        else if(unknown == "v2"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "theta2v2y": awnser = oppThetaOFhyp(v2y,theta2);
                break;
                case "theta2v1x": awnser = adjThetaOFhyp(v1x,theta2);
                break;
                case "v1xv2y": awnser = pythagFORHypotenuse(v1x,v2y);
                break;
            }
        }
        
        //Check if the unknown variable is the final y velocity
        else if(unknown == "v2y"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "adyt": awnser =dytaOFv2y(dy,t,a);
                break;
                case "atv1y": awnser =v1yatOFv2y(v1y,a,t);
                break;
                case "adyv1y": awnser =v1yadyOFv2y(v1y,a,dy);
                break;
                case "dytv1y": awnser=v1ydytOFv2y(v1y,dy,t);
                break;
                case "theta2v1x": awnser = adjThetaOFopp(v1x,theta2);
                break;
                case "v1xv2": awnser = pythagFORSidelength(v2,v1x);
                break;
            }
        }
        
        //Check if the unknown variable is the x displacement
        else if(unknown == "dx"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "tv1x": awnser = tv1xOFdx(t,v1x);
                break;
            }
        }
        
        //Check if the unknown variable is the y displacement
        else if(unknown == "dy"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "atv1y": awnser=v1ytaOFdy(v1y,t,a);
                break;
                case "atv2y": awnser=v2ytaOFdy(v2y,t,a);
                break;
                case "av1yv2y": awnser=v1yv2yaOFdy(v1y,v2y,a);
                break;
                case "tv1yv2y": awnser=v1yv2ytOFdy(v1y,v2y,t);
                break;
            }
        }
        
        //Check if the unknown variable is the time
        else if(unknown == "t"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dxv1x": awnser=dxv1xOFt(dx,v1x);
                break;
                case "adyv1y": awnser=dyv1yaOFt(dy,a,v1y);
                break;
                case "adyv2y": awnser=dyv2yaOFt(dy,v2y,a);
                break;
                case "av1yv2y": awnser=v1yv2yaOFt(v1y,v2y,a);
                break;
                case "dyv1yv2y": awnser=v1yv2ydyOFt(v1y,v2y,dy);
                break;
            }
        }
        
        //Check if the unknown variable is the acceleration
        else if(unknown == "a"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "dytv1y": awnser=dyv1ytOFa(dy,t,v1y);
                break;
                case "dytv2y": awnser=dyv2ytOFa(dy,v2y,t);
                break;
                case "tv1yv2y": awnser=v1yv2ytOFa(v1y,v2y,t);
                break;
                case "dyv1yv2y": awnser=v1yv2ydyOFa(v1y,v2y,dy);
                break;
            }
        }
        
        //Check if the unknown variable is the initial angle
        else if(unknown == "theta1"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "v1xv1y": awnser=oppAdjOFtheta(v1x,v1y);
                break;
                case "v1yv1": awnser = oppHypOFtheta(v1y,v1);
                break;
                case "v1xv1": awnser = adjThetaOFhyp(v1x,v1);
                break;
            }
        }
        
        //Check if the unknown variable is the final angle
        else if(unknown == "theta2"){
            //Using switch statement, determine which case is to be run to solve for unknown
            switch(megaString){
                //For the case of any equation, run corresponding method
                case "v1xv2y": awnser=oppAdjOFtheta(v1x,v2y);
                break;
                case "v2yv2": awnser = oppHypOFtheta(v2y,v2);
                break;
                case "v1xv2": awnser = adjThetaOFhyp(v1x,v2);
                break;
            }
        }

        //Return the final awnser
        return awnser;
    }
}
