// Your includes go here
#include <iostream>

const char * isLeapYear(int year)
{
    // Complete this function
    
    if(year%100 ==0){
        if(year%400==0){
            return "Leap year";
            }else{
                return "Not a leap year";
                }    
    }else if(year%4 == 0){
        return "Leap year";      
    }else{
        return "Not a leap year";              
    }
    
}