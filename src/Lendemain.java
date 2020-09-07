
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nour
 * 
 */
public class Lendemain {
 
    private int i;
    private int jour;
    private ArrayList<Integer> mois;
    private int annee;
    
    
    
    public Lendemain ()
    {
        
      mois= new ArrayList<Integer>();
      i=0;
    
    
    }
    
    
    public void remplirMois()
    {
    
    for( i=1;i<=12;i++)    
{
    mois.add(i);
     

}
    
    }
    
    public void le_Lendemain()
    { 
    
    if(mois.get(1)==1 ||mois.get(3)==3 || mois.get(5) ==5 || mois.get(7)==7 || mois.get(8)==8 || mois.get(10)==10 || mois.get(12)==12)
    {
     
   if(jour==31)
    {
       
        jour=1;
      
    }
    
    }
     if(mois.get(4)==4 || mois.get(6)==6 || mois.get(9) ==9 || mois.get(11)==11)
    {
     
       if(jour==30)
        {
            
          jour=1;
         
        }
    
    }
    
    
    }
 
    public boolean isBissextile(int annee)
    {
       //cas ou annee est bissextile
        if (annee % 4 == 0 && annee % 100!=0 ) {
        return true;
    }

   
    if (annee % 400 == 0) {
        return true;
    }
     //cas ou annee n'est pas bissextile
  return false; 

}


}