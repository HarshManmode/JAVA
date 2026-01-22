class Student
{
    int roll;
    String name;
    int marks;
}

class Demo
{
    public static void main(String[] args) {
        
        Student s1 = new Student();  //we created student object
        s1.roll=1;
        s1.name="Harsh";
        s1.marks=100;

        Student s2 = new Student();
        s2.roll=2;
        s2.name="Vidhi";
        s2.marks=10;

        Student s3 = new Student();
        s3.roll=3;
        s3.name="Siddhesh";
        s3.marks=1000;

        Student students[] = new Student[3]; //we created array for students
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        //using normal for loop
        for(int i=0; i<students.length ;i++)
        {
            System.out.println(students[i].name + " :" + students[i].marks);
        }

        //using advance for loop
        for(Student stud : students)
        {
            System.out.println(stud.name + " :" + stud.marks);
        }

    }
}