package com.oops.Exception_Handling;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c= a/b;//arithmetic exception

        //OR

//        to print as custom use try and catch
        try {
            System.out.println(divide(7.0f,0));     //OR       int c = a / b;

            //oR
            String name ="Sruthi";
            if(name.equals("Kunal")){
                throw new Custom_Exception("My custom exception is kunal");
            }

            //OR
//            throw new Exception("Just for fun");//catches normal exception

        } catch (ArithmeticException e) {  //or  catch(Exception e) //here exception is a main class which contains arithetic exception class also
            System.out.println(e.getMessage());

        }catch (Custom_Exception e) {  //here custom_exception constructor is called, that itself call main constructor using super().
            System.out.println(e.getMessage());

        } catch (Exception e) {  //or  catch(Exception e) //here exception is a main class which contains arithetic exception class also
            System.out.println("Normal Exception");

        } finally {
            System.out.println("No matter what happens ,this will always execute");
        }
    }



//if u use this function it may throw an ArithmeticException exception
    static Float divide (Float a, int b ) throws ArithmeticException{//have to declare the exception here as well --> throws for declaring , throw --> is for actually throwing the exception
        if(b==0){
            throw  new ArithmeticException("Please do not divide by Zero");//can pass message inside also

//            explicitly throwing
        }
        return a/b;
    }
}


