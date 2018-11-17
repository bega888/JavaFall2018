package j017_WhileLoop;

public class LoopWithIf {
public static void main(String[] args) {
	//write a program that prints even numbers between 0 and 100
	int num=0;
	while(num<=100) {if(num%2==0) {System.out.print(num+", ");}num++;}
	
	System.out.println("");
	
	num=0;
	while(num<=100) {if(num%2==1) {System.out.print(num+", ");}num++;}

	int n=1;
	String stars="";
	while(n<=10) {
		stars = stars + "*";
		System.out.println(stars);
		n++;}



}}