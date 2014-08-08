

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package Cal3;
/**
 *
 * @author Konoha
 */
public class Singleton {
   
    boolean calc=false;
    
    public void setCalc(){
        calc= true;
    }
    
    public boolean SingletonCalc(){
        return calc;
    }
            
}
