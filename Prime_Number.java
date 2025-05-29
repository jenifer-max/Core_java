public class Prime_Number{
public static void main(String args[]){
int i,count=0,n1=3;
if(n1==0||n1==1){
System.out.println(n1+" is not a prime number");

}
else{
for(i=1;i<=n1;i++){
  if(n1%i==0){
   count=count+1;}
}

}
if(count==2){
System.out.println(n1+" is a prime number");}

}}
