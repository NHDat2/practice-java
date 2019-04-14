package packageLab2;
/**
* StudentManager la 1 ung dung cho phep nguoi dung khoi tao, xoa va in ra danh sach cac sinh vien
* @author Nguyen Huu Dat
* @version 1.0
* @since 2018-09-011
*/
public class StudentManagement
{
	/* initization static private array Student. The number of element max is 100 */
	static private Student[] students = new Student[5];
	/**
	* sameGroup's a app. alowing user check String s1 have equals s2 or haven't
	* @param Student s1 is the first parameter. showing the first Student
	* @param Student s2 is the second parameter. Showing the second Student
	* @return true or false
	*/
	public static boolean sameGroup(Student s1, Student s2)
	{

		if (s1.getGroup().equals(s2.getGroup()))
		{
			return true;
		}
		return false;
	}
	/**
	* classifiedStudentsByGroup classified students by group and print students in screen
	* @param none
	* @return don't return
	*/
	public static void classifiedStudentsByGroup()
	{
		int count = 0;
		for (int i = 0; i < students.length; i++)
		{
			students[i] = new Student(count + "");
			count++;
			if (count == 3)
			{
				count = 0;
			}
		}
		for (int i = 0; i < students.length - 1; i++)
		{
			for (int j = i + 1; j < students.length ; j++)
			{
				if (students[i].getGroup().compareTo(students[j].getGroup()) > 0)
				{
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		for (int i = 0; i < students.length ; i++)
		{
			System.out.println(students[i].getInfo());
		}
	}
	/**
	* sameGroup's a app. alowing user check String s1 have equals s2 or haven't
	* @param Sring id is the only parameter
	* @return true or false
	*/
	public static void removeStudent(String id)
	{
		for (int i = 0; i < students.length; i++)
		{
			if (students[i].getId().equals(id))
			{
				for (int j = i; j < students.length - 1; j++)
				{
					students[j] = students[j + 1];
				}
				break;
			}
			
		}
		for (int i = 0; i < students.length - 1; i++)
		{
			System.out.println(students[i].getInfo());
		}
	}
	/**
	* below is the main function
	* @param args don't use
	* @return main function don't return anything
	*/
	public static void main(String[] args)
	{
		/*for (int i = 0; i < students.length; i++)
		{
			students[i] = new Student("dat", "id" + i, "clas");
		}
		removeStudent("id2");*/
		classifiedStudentsByGroup();
	}

}
/**
* class Student is use to store properties and handle function
*/
class Student
{
	private String name = "";
	private String id = "";
	private String group = "";
	private String email = "";
	private boolean mark = false;

	/**
	* Student is performed overloading to set name, id, group and email for student
	*/
	public Student()
	{
		setName("Student");
		setId("000");
		setGroup("k59CB");
		setEmail("uet@vun.edu.vn");
	}
	public Student(String a)
	{
		setName("Student");
		setId("000");
		setGroup(a);
		setEmail("uet@vun.edu.vn");
	}
	/**
	* Student is performed overloading to set name, id, group and email for student
	* @param Stirng name is the first parameter. Showing the name of student
	* @param String id is the secound parameter. Showing the id of student
	* @param String email is the third parameter. Showing the email of student
	*/
	public Student(String name, String id, String email)
	{
		setName(name);
		setId(id);
		setEmail(email);
		setGroup("K59CB");
	}
	/**
	* Student is performed overloading to set name, id, group and email for student by another student
	* @param Student s is the only parameter. using take data and using that data to set name, id, email and group for student
	*/
	public Student(Student s)
	{
		setName(s.name);
		setId(s.id);
		setEmail(s.email);
		setGroup(s.group);
	}
	public void setMark(boolean mark)
	{
		this.mark = mark;
	}
	public boolean getMark()
	{
		return this.mark;
	}
	/**
	* below setName function is use to set name for student
	* @param name is the only parameter is name of student need to set
	* @return void method don't return anything
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* below setId function is use to set ID for student
	* @param id is the only parameter is id of student need to set
	* @return void method don't return anything
	*/
	public void setId(String id)
	{
		this.id = id;
	}
	/**
	* below setGroup function is use to set group for student
	* @param group is the only parameter is group of student need to set
	* @return void method don't return anything
	*/
	public void setGroup(String group)
	{
		this.group = group;
	}
	/**
	* below setEmail function is use to set email for student
	* @param email is the only parameter is email of student need to set
	* @return void method don't return anything
	*/
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	* below getName function is use to get name for student
	* @param none
	* @return string method return result is that name of student need to get
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* below getId function is use to get id for student
	* @param none
	* @return string method return result is that id of student need to get
	*/
	public String getId()
	{
		return this.id;
	}
	/**
	* below getGroup function is use to get group for student
	* @param none
	* @return string method return result is that group of student need to get
	*/
	public String getGroup()
	{
		return this.group;
	}
	/**
	* below getEmail function is use to get email for student
	* @param none
	* @return string method return result is that email of student need to get
	*/
	public String getEmail()
	{
		return this.email;
	}
	/**
	* below getInfo function is use to get info of student
	* @param none
	* @return String
	*/
	public String getInfo()
	{
		String info = "\n\nName\t:" + this.name + "\n" + "ID\t:" + this.id + "\n" + "class\t:" + this.group + "\n" + "email\t:" + this.email;
		return info;
	}
}