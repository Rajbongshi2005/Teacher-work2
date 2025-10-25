import java.util.Scanner;
class Teacher
{
    String teacher_name;
    private int salary;

    public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
    public void display()
    {
        System.out.println(" Teacher Name: "+this.teacher_name);
        System.out.println("Teacher salary: "+this.getSalary());
        System.out.println("...............................");
    }
}

class Main
{ 
     static Scanner in=new Scanner(System.in);
    static Teacher[] teacher = new Teacher[50];
    public static void main(String[] args) 
    {
        int total_number_teacher;
        System.out.println("Enter Total Number of School Teacher: ");
        total_number_teacher=in.nextInt();

        for(int i=0;i<total_number_teacher;i++)
        {
            teacher[i]=new Teacher();
            System.out.print("Enter Teacher Name: ");
            teacher[i].teacher_name=in.nextLine();
            System.out.print("Enter Teacher salary: ");
            int salary=in.nextInt();
            teacher[i].setSalary(salary);
        }
        System.out.println("Display Teacher infromation:  ");
        for(int i=0;i<total_number_teacher;i++)
        {
            teacher[i].display();
        }
    }


}