package com.java.assignment4;

//Java Program to count the number of vowels, consonants, digits and special characters in a string 
import java.util.*;

public class CountTotalConsonantsVowelsShpecialCharactersInString {

public static void main(String[] args) {
String line;
Scanner sc = new Scanner(System.in);
System.out.print( "Enter the string : " );
line = sc.nextLine();
int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

line = line.toLowerCase();
for(int i = 0; i < line.length(); i++)
{
char ch = line.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i'
|| ch == 'o' || ch == 'u') {
++vowels;
}
else if((ch >= 'a' && ch <= 'z')) {
++consonants;
}
else if( ch >= '0' && ch <= '9')
{
++digits;
}
else if (ch ==' ')
{
++spaces;
}
else
++symbols;
}

System.out.println("Vowels:  " + vowels);
System.out.println("Consonants: " + consonants);
System.out.println("Digits: " + digits);
System.out.println("White spaces: " + spaces);
System.out.println("Symbols : " + symbols);
}
}