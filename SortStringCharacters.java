import java.util.Arrays;
import java.util.Scanner;
public class SortStringCharacters
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
 System.out.print("enter a string:");
 String inputString=scanner.nextLine();
  char[] charArray=inputString.toCharArray();
  Arrays.sort(charArray);
  String newname="";
  newname=newname.valueOf(charArray);
  System.out.println("Original String:" + inputString);
  System.out.println("Sorted String:" + newname);
 
 }
    }

