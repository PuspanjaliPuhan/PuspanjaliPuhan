class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
rollno=rollno;
name=name;
fee=fee;
}
void display(){
System.out.println(rollno+""+name+""+fee);
}}
class TestThisStudent1{
public static void main(String args[]){
Student s1=new Student(111,"A",5000f);
Student s2=new Student(222,"B",6000f);
s1.display();
s2.display();
}
}