/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package culminatingcannon;

/**
 *
 * @author wipri9236
 */
public abstract class MathMethods {
    //Superclass math methods that will not actually be called to
    //Subclass decisionMaker will use the various math equations in this class
    //To reach an awnser and return that value
    
    
    /**
    * pre: xdisplacement and time
    * post: initial x velocity
    * Method to return the initial x velocity
    */
    public static double dxtOFv1x(double dx, double t){
        // DECLARE A CONSTANT SPEED VARIABLE
        double v1x;
        
        // CALCULATE FOR VELOCITY
        v1x = dx/t;
        
        // RETURN
        return v1x;
    }
    
    /**
    * pre: x displacement and initial x velocity
    * post: time
    * Method to return the time
    */
    public static double dxv1xOFt(double dx, double v1x){
        // DECLARE A DELTA TIME VARIABLE
        double t;
        
        // CALCULATE FOR DELTA TIME
        t = dx/v1x;
        
        // RETURN
        return t;
    }
    
    /**
    * pre: time and initial x velocity
    * post: x displacement
    * Method to return the x displacement
    */
    public static double tv1xOFdx(double t, double v1x){
        // DECLARE A DELTA DISPLACEMENT
        double dx;
        
        // CALCULATE FOR DELTA DISPLACEMENT
        dx = t*v1x;
        
        // RETURN
        return dx;
    }
    
    
    // THIS IS SECTION 1 FOR PROJECTILE MOTION
    // IT USES THE FORMULA d = v1*t + 1/2 * a * t *t

    /**
    * pre: initial y velocity, time, and acceleration
    * post: y displacement
    * Method to return the y displacement
    */
    public static double v1ytaOFdy(double v1y,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double dy;

        // CALCULATE FOR Δ DISPLACEMENT
        dy=v1y*t+0.5*a*Math.pow(t, 2);
        
        // RETURN
        return dy;
    }
    
    /**
    * pre: y displacement, time, and acceleration
    * post: initial y velocity
    * Method to return the initial y velocity
    */
    public static double dytaOFv1y(double dy,double t,double a){
        // DECLARE initial speed
        double v1y;

        // CALCULATE FOR initial speed
        v1y=(dy-(0.5*a*Math.pow(t, 2)))/t;
        
        // RETURN
        return v1y;
    }
    
    /**
    * pre: y displacement, time, and initial y velocity
    * post: acceleration
    * Method to return the acceleration
    */
    public static double dyv1ytOFa(double dy,double t,double v1y){
        // DECLARE ACCELERATION VARIABLE
        double a;

        // CALCULATE FOR initial speed
        a=(2*(dy-(v1y*t)))/Math.pow(t, 2);
        
        // RETURN
        return a;
    }
    
    /**
    * pre: y displacement, acceleration, and initial y velocity
    * post: time
    * Method to return the time
    */
    public static double dyv1yaOFt(double dy,double a,double v1y){
        // DECLARE ACCELERATION VARIABLE
        double t1, t2;
        double trueTime = 133742069; // set as wild number to verify for testing
        
        // CALCULATE FOR initial speed
        t1=(-2*v1y+Math.sqrt(Math.pow(2*v1y, 2)-4*(a*(-2*dy))))/2*a;
        t2=(-2*v1y-Math.sqrt(Math.pow(2*v1y, 2)-4*(a*(-2*dy))))/2*a;
        
        // CHECK WHICH ONE OF THE TIMES IS VALID AND SET THE TRUE TIME TO IT
        if(t1<0){
           trueTime=t1; 
        }
        else if(t2<0){
            trueTime=t2;
        }
        
        return trueTime;
    }
    
    // THIS IS SECTION 1 FOR PROJECTILE MOTION
    // IT USES THE FORMULA d = v2*t - 1/2 * a * t *t
    
    /**
    * pre: final y velocity, time, and acceleration
    * post: y displacement
    * Method to return the y displacement
    */
    public static double v2ytaOFdy(double v2y,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double dy;

        // CALCULATE FOR Δ DISPLACEMENT
        dy = v2y*t - (a*t*t)/2;
        
        // RETURN
        return dy;
    }
    
    /**
    * pre: y displacement, time, and acceleration
    * post: final y velocity
    * Method to return the final y velocity
    */
    public static double dytaOFv2y(double dy,double t,double a){
        // DECLARE FINAL VELOCITY VARIBALE
        double v2y;

        // CALCULATE FOR FINAL VELOCITY
        v2y = (dy+(a*t*t)/2)/t;
        
        // RETURN
        return v2y;
    }
    
    /**
    * pre: y displacement, final y velocity, and acceleration
    * post: time
    * Method to return the time
    */
    public static double dyv2yaOFt(double dy,double v2y,double a){
        // DECLARE FINAL VELOCITY VARIBALE
        double t1, t2, trueTime = 0;

        // CALCULATE FOR FINAL VELOCITY
        t1 = (-v2y + Math.sqrt(v2y*v2y - 4*(-a/2)*(-dy)))/2*(-a);
        t2 = (-v2y + Math.sqrt(v2y*v2y - 4*(-a/2)*(-dy)))/2*(-a);
        
        // CHECK WHICH ONE OF THE TIMES IS VALID AND SET THE TRUE TIME TO IT
        if(t1<0){
           trueTime=t1; 
        }
        else if(t2<0){
            trueTime=t2;
        }
        
        return trueTime;
    }
    
    /**
    * pre: y displacement, final y velocity, and time
    * post: acceleration
    * Method to return the acceleration
    */
    public static double dyv2ytOFa(double dy,double v2y,double t){
        // DECLARE ACCELERATION VARIABLE
        double a;

        // CALCULATE FOR initial speed
        a=(-2)*(dy-v2y*t)/(t*t);
        
        // RETURN
        return a;
    }
    
    //Method to solve for the final velocity given the initial velocity, acceleration, and time
    //Uses the formula v2=v1+at
    
    /**
    * pre: initial y velocity, acceleration, and time
    * post: final y velocity
    * Method to return the final y velocity
    */
    public static double v1yatOFv2y(double v1y, double a, double t){
        //Variable to be solved for
        double v2y;
        //Formula to solve for variable
        v2y = v1y+(a*t);
        //Return value
        return v2y;
    }
    
    //Method to solve for the initial velocity given the final velocity, acceleration, and time
    //Uses the formula v1=v2-at
    
    /**
    * pre: final y velocity, acceleration, and time
    * post: initial y velocity
    * Method to return the initial y velocity
    */
    public static double v2yatOFv1y(double v2y, double a, double t){
        //Variable to be solved for
        double v1y;
        //Formula to solve for variable
        v1y = v2y-(a*t);
        //Return value
        return v1y;
    }
    
    //Method to solve for the acceleration given the initial velocity, final velocity, and time
    //Uses the formula a=(v2-v1)/t
    
    /**
    * pre: initial y velocity, final y velocity, and time
    * post: acceleration
    * Method to return the acceleration
    */
    public static double v1yv2ytOFa(double v1y, double v2y, double t){
        //Variable to be solved for
        double a;
        //Formula to solve for variable
        a=(v2y-v1y)/t;
        //Return value
        return a;
    }
    
    //Method to solve for the time given the initial velocity, final velocity, and acceleration
    //Uses the formula t=(v2-v1)/a
    
    /**
    * pre: initial y velocity, final y velocity, and acceleration
    * post: time
    * Method to return the time
    */
    public static double v1yv2yaOFt(double v1y, double v2y, double a){
        //Variable to be solved for
        double t;
        //Formula to solve for variable
        t=(v2y-v1y)/a;
        //Return value
        return t;
    }
    
    //Method to solve for the final velocity given the initial velocity, acceleration, and displacement
    //Uses the formula v2= square root(v1*v1+2ad)
    
    /**
    * pre: initial y velocity, acceleration, and y displacement
    * post: final y velocity
    * Method to return the final y velocity
    */
    public static double v1yadyOFv2y(double v1y, double a, double dy){
        //Variable to be solved for
        double v2y;
        //Formula to solve for variable
        v2y=Math.sqrt( (v1y*v1y) + (2*a*dy) );
        //Return value
        return v2y;
    }
    
    //Method to solve for the initial velocity given the final velocity, acceleration, and displacement
    //Uses the formula v1= square root(v2*v2-2ad)
    
    /**
    * pre: final y velocity, acceleration, and y displacement
    * post: initial y velocity
    * Method to return the initial y velocity
    */
    public static double v2yadyOFv1y(double v2y, double a, double dy){
        //Variable to be solved for
        double v1y;
        //Formula to solve for variable
        v1y=Math.sqrt( (v2y*v2y) - (2*a*dy) );
        //Return value
        return v1y;
    }
    
    //Method to solve for the acceleration given the initial velocity, final velocity, and displacement
    //Uses the formula a = (v2*v2-v1*v1)/2d
    
    /**
    * pre: initial y velocity, final y velocity, and y displacement
    * post: acceleration
    * Method to return the acceleration
    */
    public static double v1yv2ydyOFa(double v1y, double v2y, double dy){
        //Variable to be solved for
        double a;
        //Formula to solve for variable
        a=((v2y*v2y)-(v1y*v1y))/(2*dy);
        //Return value
        return a;
    }
    
    //Method to solve for the displacement given the initial velocity, final velocity, and acceleration
    //Uses the formula d = (v2*v2-v1*v1)/2a
    
    /**
    * pre: initial y velocity, final y velocity, and acceleration
    * post: y displacement
    * Method to return the y displacement
    */
    public static double v1yv2yaOFdy(double v1y, double v2y, double a){
        //Variable to be solved for
        double dy;
        //Formula to solve for variable
        dy=((v2y*v2y)-(v1y*v1y))/(2*a);
        //Return value
        return dy;
    }
    
    //Method to solve for the displacement given the initial velocity, final velocity, and time
    //Uses the formula d=((v2+v1)/2)*t 
    
    /**
    * pre: initial y velocity, final y velocity, and time
    * post: y displacement
    * Method to return the y displacement
    */
    public static double v1yv2ytOFdy(double v1y, double v2y, double t){
        //Variable to be solved for
        double dy;
        //Formula to solve for variable
        dy=((v2y+v1y)/2)*t;
        //Return value
        return dy;
    }
    
    //Method to solve for the time given the initial velocity, final velocity, and displacement
    //Uses the formula t=2d/v2+v1
    
    /**
    * pre: initial y velocity, final y velocity, and y displacement
    * post: time
    * Method to return the time
    */
    public static double v1yv2ydyOFt(double v1y, double v2y, double dy){
        //Variable to be solved for
        double t;
        //Formula to solve for variable
        t=(2*dy)/(v2y+v1y);
        //Return value
        return t;
    }
    
    //Method to solve for the final velocity given the initial velocity, displacement, and time
    //Uses the formula v2=2d/t-v1
    
    /**
    * pre: initial y velocity, time, and y displacement
    * post: final y velocity
    * Method to return the final y velocity
    */
    public static double v1ydytOFv2y(double v1y, double dy, double t){
        //Variable to be solved for
        double v2y;
        //Formula to solve for variable
        v2y=((2*dy)/t)-v1y;
        //Return value
        return v2y;
    }
    
    //Method to solve for the initial velocity given the final velocity, displacement, and time
    //Uses the formula v1=2d/t-v2
    
    /**
    * pre: final y velocity, time, and y displacement
    * post: initial y velocity
    * Method to return the initial y velocity
    */
    public static double v2ydytOFv1y(double v2y, double dy, double t){
        //Variable to be solved for
        double v1y;
        //Formula to solve for variable
        v1y=((2*dy)/t)-v2y;
        //Return value
        return v1y;
    }

    
    
    
    // BELOW IS USE OF TRIGNOMETRY EQUATIONS

    /**
    * pre: opposite side, adjacent side
    * post: theta
    * Method to return the angle using tan
    */
    public static double oppAdjOFtheta(double v1x, double v1y){
        return Math.toDegrees(Math.atan(v1y/v1x)); 
    }


    // JUST USE ANGLE SUM OF A TRIANGLE THEOREM IF YOU NEED TO GET THE ADJ ANGLE IN ANY OF THE NEXT FUNCTIONS
    
    /**
    * pre: opposite side, theta
    * post: adjacent
    * Method to return the adjacent side
    */
    public static double oppThetaOFadj(double opp, double theta){
        return oppAdjOFtheta(opp, 90-theta);
    }
    

    /**
    * pre: adjacent side, theta
    * post: opposite side
    * Method to return the opposite side using tan
    */
    public static double adjThetaOFopp(double adj, double theta){
        // RETURN THE y component of the right angle triangle 
        return adj * Math.tan(Math.toRadians(theta));
    }
    
    //USING SIN
    
    /**
    * pre: opposite side, hypotenuse
    * post: theta
    * Method to return the angle using sin
    */
    public static double oppHypOFtheta(double opp, double hyp){
        return Math.toDegrees(Math.asin(opp/hyp));
    }
    //USING SIN
    
    /**
    * pre: opposite side, theta
    * post: hypotenuse
    * Method to return the hypotenuse using sine
    */
    public static double oppThetaOFhyp(double opp, double theta){
        return opp*Math.sin(Math.toRadians(theta));
    }
    
    // USING COS
    
    /**
    * pre: adjacent side, hypotenuse
    * post: theta
    * Method to return the angle using cose
    */
    public static double adjHypOFtheta(double adj, double hyp){
        return Math.toDegrees(Math.acos(adj/hyp));
    }
    
    // USING COS
    
    /**
    * pre: adjacent side, theta
    * post: hypotenuse
    * Method to return the hypotenuse using sine
    */
    public static double adjThetaOFhyp(double adj, double theta){
        return adj*Math.sin(Math.toRadians(theta));
    }
    
    
    // TWO METHODS BELOW ONLY DEAL WITH THE PYTHAGOREAN THEOREM
    
    /**
    * pre: opposite side, adjacent side
    * post: hypotenuse
    * Method to return the hypotenuse using pythagorean theorem
    */
    public static double pythagFORHypotenuse(double adj, double opp){
        return Math.sqrt((adj*adj)+(opp*opp)); // using pythagoras' theorem to obtain the hypotenuse
        //Make sure to include theta1 in the final velocity

    }
    
    /**
    * pre: hypotenuse, and either the adjacent or opposite side
    * post: the other side length
    * Method to return either the adjacent or opposite side using pythagorean theorem
    */
    public static double pythagFORSidelength(double hypotenuse, double sidelength){
        return Math.sqrt((hypotenuse*hypotenuse)-(sidelength*sidelength)); // return the missing sidelength
    }
}
