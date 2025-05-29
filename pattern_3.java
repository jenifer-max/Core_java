public class pattern_3{  
public static void main(String []args){  
  
  
    int i,j;  
    for(i=1;i<8;i++){ 
        for(j=1;j<=4;j++){
            if(i==j){  
                System.out.print(j);  
            }  
            else if(i>4 && j==8-i){  
                System.out.print(j);  
            }  
            else{  
               System.out.print(" ");  
            }  
        }  
        j=j-2;  
        while(j>0){ //this loop is used to print numbers  
            if(i==j){  
            System.out.print(j);  
            }  
            else if(i>4 && j==8-i){  
                System.out.print(j);  
            }  
            else{  
                System.out.print(" ");  
            }  
  
            j--;  
        }  
        System.out.println("");  
    }  
     }  
}  