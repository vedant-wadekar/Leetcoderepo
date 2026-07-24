public class Example{
public static void main(String[] args){
int[][] arr = {{1,1,1},{1,1,1},{1,1,1}};
int max =0;
int result = 0;

for(int i=0;i<arr.length;i++){
int count =0;
for(int j=0;j<arr[i].length;j++){
if(arr[i][j] == 1){
count++;
}
}
if(max < count){
max = count;
result = i;

}
}
System.out.print(result+1);

}
}