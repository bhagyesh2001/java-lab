
import java.util.Scanner;
public class Matrix{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number of rows and columns of the marrix");
int rows=scanner.nextint();
int columns=scanner.nextint();

int[][]matrix1=new int[rows][columns];
int[][]matrix2=new int[rows][columns];
int[][]sumMatrix=new int[rows][columns];
System.out.println("ener the elemenrs of the 1st matrix");
for(int i=0;i<rows;i++){
for(int j=0; j<columns;j++){
matrix1[i][j]=scanner.nextint();
}
}
for(int i=0;i<rows;i++){
for(int j=0; j<columns;j++){
matrix2[i][j]=scanner.nextint();
}
}
for(int i=0;i<rows;i++){
for(int j=0; j<columns;j++){
sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("Result:");
for(int i=0;i<rows;i++){
for(int j=0; j<columns;j++){
System.out.print(sumMatrix[i][j]+"");
System.out.println();
}
scanner.close();
}
}
}
