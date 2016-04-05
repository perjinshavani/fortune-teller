/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import java.util.ArrayList;

/*
 *
 * @author perjin
 */
public class Translator {
    
  
        private ArrayList<Ord> ordLista;
            
        public Translator(){
            
   
        ordLista = new ArrayList();
        
        ordLista.add(new Ord("stor","en löneförhöjning","springa"));
        ordLista.add(new Ord("liten","en lönesänkning","ljuga"));
        ordLista.add(new Ord("stark","en fotboja","flyga"));
        ordLista.add(new Ord("svag","en katt","se"));
        ordLista.add(new Ord("mjuk","en hund","vara"));
        ordLista.add(new Ord("hård","ett hus","äta"));
        ordLista.add(new Ord("snabb","ett barn","mäta"));
        ordLista.add(new Ord("svag","en katt","se"));
        ordLista.add(new Ord("vacker","ett elstängsel","gå"));
        ordLista.add(new Ord("ljus","en dator","röra"));
        ordLista.add(new Ord("mörk","ett golv","resa"));
    }
    public String getTranslation(int calculateA, int calculateB, int calculateC, int calculateD,int calculateE) {
       return "Din framtid är "+adjektiv(calculateA) +
               ".Du borde sluta "+ verb(calculateB)+"." + 
               " Vi ser att du snart kommer att skaffa "+substantiv(calculateC)+
               ".Snart kommer du vilja " +verb(calculateD)+", "+
               "men då är det viktigt att du är "+adjektiv(calculateE)+".";
    }

    public String adjektiv(int number){
        if(number >= 0 && number <= 9){
            return ordLista.get(number).getAdjektiv();
        }
        return "";
    }
     public String verb(int number){
        if(number >= 0 && number <= 9){
            return ordLista.get(number).getVerb();
        }
        return "";
    }
      public String substantiv(int number){
        if(number >= 0 && number <= 9){
            return ordLista.get(number).getSubstantiv();
        }
        return "";
    }


    }





    

