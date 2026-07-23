public class Student{
public static void main(String[] args){
//int[][] arr={{60,70,80},{40,50,60},{30,40,50}};
//int[][] arr={{55,60,45,50},{20,30,40,50}};
int[][] arr={{10,20,30,40,50}};
int count = 0;
int avg;
int sum;
for(int i=0;i<arr.length;i++){
avg =0;
sum =0;
for(int j=0;j<arr[i].length;j++){
sum = sum + arr[i][j];
}
avg = sum/arr[i].length;
if(avg >= 50){
count++;
}
}
System.out.print(count);
}
}