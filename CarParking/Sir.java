import java.util.Arrays;
public class Sir{
public static void main (String[] args){

int arr[][] = {{1,0,1},{1,1,1},{1,1,1}};

int max  =0;
int newarr[] = new int[3];

for(int i=0;i<arr.length;i++){
int sum =0 ;
for(int j=0;j<arr[i].length;j++){
sum += arr[i][j];
}
if(max <= sum){
newarr[i]= sum;
max = sum;
}

}
//System.out.println(Arrays.toString(newarr));

for(int i=0;i<newarr.length;i++){
if(newarr[i] == max){
System.out.print(max); 
}
}

}
}