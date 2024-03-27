class Student{
int id;
String name;
double percentage;


public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.id=101;
s1.name="a";
s1.percentage=70;
s2.id=102;
s2.name="b";
s2.percentage=80; 
s3.id=103;
s3.name="c";
s3.percentage=90;
System.out.println("student1"+" "+s1.id+" "+s1.name+" "+s1.percentage);
System.out.println("student2"+" "+s2.id+" "+s2.name+" "+s2.percentage);
System.out.println("student3"+" "+s3.id+" "+s3.name+" "+s3.percentage);
}
}
