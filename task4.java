import java.util.*;
class calculator {
public  static void main(String[] args) {
Scanner obj=new Scanner(System.in);
double matriculation,intermediate,result;
double a,b,c,cpn;
System.out.println("Enter your Matriculation marks ");
matriculation=obj.nextDouble();
matriculation=matriculation/850*100;
System.out.println("Enter your Intermediate marks ");
intermediate=obj.nextDouble();
intermediate=intermediate/1100*100;
System.out.println("Enter your Test result marks ");
result=obj.nextDouble();
result=result/100*100;
cpn=(matriculation/100)*10+(intermediate/100)*30+(result/100)*60; 
System.out.println(cpn);
}
}