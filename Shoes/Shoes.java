public class Shoes{
public static void main(String[] args){
String[] str = {"7L","7R","7L","8R","6R","7R","8R","6R"};

for(int i=0;i<str.length;i++){
int start = 0;
int end = arr.length-1;
while(start<end){
if(str[start].contains("L") && str[end].contains("R") || str[start].contains("R") && str[end].contains("L")&& (str[start].charAt(0)).equals(str[end].charAt(0)){
count++;
System.out.println("("+
start++;

}else{
end--;
} 

}

}
}
}