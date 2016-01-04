package investigate.java.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java program to demonstrate how to remove object form List and differnece
 * between Iterator's remove() method and Colection's remove() method in Java
 *
 * @author http://javarevisited.blogspot.com
*/
public class ObjectRemovalTest {
 
   public static void main(String args[]) {
     
      List markets = new ArrayList();
    
      StockExchange TSE = new StockExchange(){
        
           @Override
           public boolean isClosed() {
               return true;
           }         
      };
    
      StockExchange HKSE = new StockExchange(){

           @Override
           public boolean isClosed() {
               return true;
           }         
      };
     
      StockExchange NYSE = new StockExchange(){

           @Override
           public boolean isClosed() {
               return false;
           }         
      };
     
      markets.add(TSE);
      markets.add(HKSE);
      markets.add(NYSE);
    
    
      Iterator<StockExchange> itr = markets.iterator();
    
      while(itr.hasNext()){
          StockExchange exchange = itr.next();
          if(!exchange.isClosed()){
             // markets.remove(exchange); //Use itr.remove() method
        	  itr.remove();
          }
      }
      System.out.println(markets.size());
          
   }    
 
}

interface StockExchange{
   public boolean isClosed();
}
