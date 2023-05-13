package Calc ;
import java.lang.* ;

public class CalcFunctions {

    public static double handleOp(double doub1, double doub2, String operator){
        double outcome = 0;

        if(operator.equals("*") ){
            outcome = multiplyFunc(doub1, doub2) ;
        }
        else if(operator.equals("/") ){
            outcome = divideFunc(doub1, doub2);
        }
        else if(operator.equals("+") ){
            outcome = additionFunc(doub1, doub2) ;
        }
        else if(operator.equals("-") ){
            outcome = subtractionFunc(doub1, doub2) ;
        }
        else if(operator.equals("^") ){
            outcome = exponentFunc(doub1, doub2) ;
        }
        else{
            outcome = doub1 ;
        }
        return outcome ;
    }

    private static double multiplyFunc(double d1, double d2){
        return ( d1 * d2 ) ;
    }

    private static double divideFunc(double d1, double d2 ){
        return ( d1 / d2) ;
    }

    private static double additionFunc(double d1, double d2){
        return ( d1 + d2 );
    }

    private static double subtractionFunc(double d1, double d2){
        return ( d1 - d2 ) ;
    }

    private static double exponentFunc(double d1, double d2){
        return Math.pow(d1, d2);
    }

    public static double sqrtFunc(double d1 ){
        return(Math.sqrt(d1) ) ;
    }

}