/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainClasses;

import java.io.Serializable;

/**
 *
 * @author 686623
 */
public class calculator implements Serializable
{
    
    String firstNum;
    String secondNum;
    String operator;
    
    public calculator(){
        
    }
    
    public calculator(String firstNum, String secondNUm, String operator){
        
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
        
    }

    public String getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(String firstNum) {
        this.firstNum = firstNum;
    }

    public String getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(String secondNum) {
        this.secondNum = secondNum;
    }
    
    
    
    public int calculate(String firstNum, String secondNum, String operator){
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        
        int result = 0;
        
        char typeOfoperation = operator.charAt(0);
        
       
        switch(typeOfoperation)
        {
            
            case '+' : result = num1+num2;
                break;
            case '-' : result = num1-num2;
                break;
            case '*': result = num1*num2;
                break;
            case '%': result = num1%num2;
                break;
        }
        return result;        
    }
  }
    
    
