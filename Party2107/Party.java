
public class Party{
public static void main(String[] args){
int[] E ={7,0,5,1,3};
int[] Ex ={1,2,1,3,4};
int pres = 0;
int hr = 5;
int max = 0;
for(int i=0;i<hr;i++){
pres = pres + (E[i]-Ex[i]);
if(max < pres){
max = pres;
}
}
System.out.print(max);
}
}