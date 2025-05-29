 public class pattern_2  
{    
     public static void main(String[] args){    
    int i,j;    
    for(i=1;i<=4;i++){
      for(j=1;j<=4;j++){   
          if(i==j)    
             System.out.print("*");    
            else    
           System.out.print("0");    
      }    
      j--;    
       System.out.print("*");    
      while(j>=1){// this loop is used to print * in a line    
          if(i==j)    
           System.out.print("*");    
          else    
           System.out.print("0");    
          j--;    
      }    
    System.out.println("");    
  }    
         }    
}    