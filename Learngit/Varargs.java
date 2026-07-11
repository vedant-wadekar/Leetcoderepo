public class Varargs{
public static void meth(int... v){
for(int a : v){
System.out.println(a);
}
}

public static void main(String[] args){
int arr[] = {1,2,43,4,6,7,9,8};
meth(arr);
}
}
