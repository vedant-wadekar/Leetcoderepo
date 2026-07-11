//searh minimum numbaer in an arr[] and aar[][]
import java.util.Arrays;
public class Searcfor{
public static void main(String[] args){
int arr[] = {2,3,4,1,5,6,7};
int aar[][] ={{4,3,4,3,2},{3,3,1,5,3,23,5,5,3},{34,4,6,6,3,2,1}};
System.out.println(small(arr));
int []ans = smallest(aar);
System.out.println(Arrays.toString(ans));
}

public static String small(int arr[]){
int min = arr[0];
int minidx = Integer.MIN_VALUE;
System.out.println(minidx);
for(int i=0;i<arr.length;i++){
if(arr[i] < min){
min = arr[i];
minidx = i;
}
}
return min+" "+minidx;
}


public static int[] smallest(int aar[][]){
int min=aar[0][0];
int minrow =0;
int mincol =0;
for(int i = 0;i<aar.length;i++){
for(int j = 0;j<aar[i].length;j++){
if(aar[i][j] < min){
min = aar[i][j];
minrow = i;
mincol = j;
}
}
}
//return ((min*100)+minidx);
return new int[]{minrow,mincol};
}
}

