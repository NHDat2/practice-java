/**
* Lab3_3 is a app. Showing 10 object
* @author Nguyen Huu Dat
* @version 1.0
* @since 18/09/2018
*/
public class DescribeObjectAround
{
	/**
	* below is the main function --------
	* @param args don't use
	* @return main function don't return anything
	*/
	public static void main(String[] args)
	{
		
	}
}
/**
* belowing is class teachers. Showing private of teachers
*/
class Teachers
{
	String sex = "";
	int age;
	String subject = "";
	public Teachers(String sex, String subject, int age)
	{
		this.sex = sex;
		this.age = age;
		this.subject = subject;
	}
	/**
	* belowing is method setSex. Setting sex of teacher
	* @param String sex
	* @return don't return anything
	*/
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* belowing is method setAge. Setting age of teacher
	* @param String age
	* @return don't return anything
	*/
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	* belowing is method setSubject. Setting subject of teacher
	* @param String subject
	* @return don't return anything
	*/
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	/**
	* belowing is method getSex. getting sex of teacher
	* @param none
	* @return sex
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* belowing is method setSubject. getting subject of teacher
	* @param none
	* @return subject
	*/
	public String getSubject()
	{
		return this.subject;
	}
	/**
	* belowing is method getAge. Getting Age of teacher
	* @param none
	* @return age
	*/
	public int getAge()
	{
		return this.age;
	}
}
/**
* belowing is class TrafficPolice. Showing private of trafficPolice
*/
class TrafficPolice
{
	String sex = "";
	String workUnit = "";
	String uniform = "";
	public TrafficPolice(String sex, String workUnit, String uniformn)
	{
		this.sex = sex;
		this.workUnit = workUnit;
		this.uniform = uniform;
	}
	/**
	* belowing is method setSex. Setting sex of TrafficPolice
	* @param String sex
	* @return don't return anything
	*/
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* belowing is method setWorkUnit. Setting WorkUnit of TrafficPolice
	* @param String WorkUnit
	* @return don't return anything
	*/
	public void setWorkUnit(String workUnit)
	{
		this.workUnit = workUnit;
	}
	/**
	* belowing is method setUniform. Setting Uniform of TrafficPolice
	* @param String Uniform
	* @return don't return anything
	*/
	public void setUniform(String uniform)
	{
		this.uniform = uniform;
	}
	/**
	* belowing is method getSex. getting sex of TrafficPolice
	* @param none
	* @return sex
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* belowing is method getWorkUniut. getting sex of TrafficPolice
	* @param none
	* @return WorkUniut
	*/
	public String getWorkUniut()
	{
		return this.workUnit;
	}
	/**
	* belowing is method getUniform. getting sex of TrafficPolice
	* @param none
	* @return Uniform
	*/
	public String getUniform()
	{
		return this.uniform;
	}
}
/**
* belowing is class Friends. Showing private of Friends
*/
class Friends
{
	String sex = "";
	String name = "";
	double height;
	public Friends(String sex, String name, double height)
	{
		this.sex = sex;
		this.name = name;
		this.height = height;
	}
	/**
	* belowing is method setSex. Setting sex of Friends
	* @param String sex
	* @return don't return anything
	*/
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* belowing is method setName. Setting name of Friends
	* @param String name
	* @return don't return anything
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* belowing is method setHeight. Setting height of Friends
	* @param String height
	* @return don't return anything
	*/
	public void setHeight(double height)
	{
		this.height = height;
	}
	/**
	* belowing is method getSex. getting sex of Friends
	* @param none
	* @return sex
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* belowing is method getName. getting name of Friends
	* @param none
	* @return name
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* belowing is method getHeight. getting height of Friends
	* @param none
	* @return height
	*/
	public double getHeight()
	{
		return this.height;
	}
	
}
/**
* belowing is class Cat. Showing private of Cat
*/
class Cat
{
	String sex;
	String tiengKeu;
	String eat;
	public Cat(String sex, String tiengKeu, String eat)
	{
		this.sex = sex;
		this.tiengKeu = tiengKeu;
		this.eat = eat;
	}
	/**
	* belowing is method setSex. Setting sex of cat
	* @param String sex
	* @return don't return anything
	*/
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	/**
	* belowing is method setTiengKeu. Setting TiengKeu of cat
	* @param String TiengKeu
	* @return don't return anything
	*/
	public void setTiengKeu(String tiengKeu)
	{
		this.tiengKeu = tiengKeu;
	}
	/**
	* belowing is method setEat. Setting Eat of cat
	* @param String Eat
	* @return don't return anything
	*/
	public void setEat(String eat)
	{
		this.eat = eat;
	}
	/**
	* belowing is method getSex. getting sex of cat
	* @param none
	* @return sex
	*/
	public String getSex()
	{
		return this.sex;
	}
	/**
	* belowing is method getTiengKeu. getting TiengKeu of cat
	* @param none
	* @return TiengKeu
	*/
	public String getTiengKeu()
	{
		return this.tiengKeu;
	}
	/**
	* belowing is method getEat. getting Eat of cat
	* @param none
	* @return Eat
	*/
	public String getEat()
	{
		return this.eat;
	}
}
/**
* belowing is class Cat. Showing private of Cat
*/
class Dog
{
	String eat;
	String tiengKeu;
	public Dog(String eat, String tiengKeu)
	{
		this.eat = eat;
		this.tiengKeu = tiengKeu;
	}
	/**
	* belowing is method setTiengKeu. Setting TiengKeu of Dog
	* @param String TiengKeu
	* @return don't return anything
	*/
	public void setTiengKeu(String tiengKeu)
	{
		this.tiengKeu = tiengKeu;
	}
	/**
	* belowing is method setEat. Setting Eat of Dog
	* @param String Eat
	* @return don't return anything
	*/
	public void setEat(String eat)
	{
		this.eat = eat;
	}
	/**
	* belowing is method getTiengKeu. getting TiengKeu of Dog
	* @param none
	* @return TiengKeu
	*/
	public String getTiengKeu()
	{
		return this.tiengKeu;
	}
	/**
	* belowing is method getEat. getting Eat of Dog
	* @param none
	* @return Eat
	*/
	public String getEat()
	{
		return this.eat;
	}

}
/**
* belowing is class Pen. Showing private of pen
*/
class Pen
{
	String loai;
	String mauMuc;
	public Pen(String loai, String mauMuc)
	{
		this.loai = loai;
		this.mauMuc = mauMuc;
	}
	/**
	* belowing is method setLoai. Setting Loai of Pen
	* @param String Loai
	* @return don't return anything
	*/
	public void setLoai(String loai)
	{
		this.loai = loai;
	}
	/**
	* belowing is method setMauMuc. Setting MauMuc of Pen
	* @param String MauMuc
	* @return don't return anything
	*/
	public void setMauMuc(String mauMuc)
	{
		this.mauMuc = mauMuc;
	}
	/**
	* belowing is method getLoai. getting Loai of Pen
	* @param none
	* @return Loai
	*/
	public String getLoai()
	{
		return this.loai;
	}
	/**
	* belowing is method getMauMuc. getting MauMuc of Pen
	* @param none
	* @return MauMuc
	*/
	public String getMauMuc()
	{
		return this.mauMuc;
	}
}
/**
* belowing is class Building. Showing private of building
*/
class Building
{
	int floor;
	String name;
	public Building(String name, int floor)
	{
		this.name = name;
		this.floor = floor;
	}
	/**
	* belowing is method setName. Setting name of building
	* @param String name
	* @return don't return anything
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* belowing is method setFloor. Setting Floor of building
	* @param String Floor
	* @return don't return anything
	*/
	public void setFloor(int floor)
	{
		this.floor = floor;
	}
	/**
	* belowing is method getName. getting Name of building
	* @param none
	* @return Name
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* belowing is method getFloor. getting Floor of building
	* @param none
	* @return Floor
	*/
	public int getFloor()
	{
		return this.floor;
	}
}
/**
* belowing is class Building. Showing private of building
*/
class Computer
{
	String name;
	String cpu;
	String hang;
	public Computer(String name, String cpu, String hang)
	{
		this.name = name;
		this.cpu = cpu;
		this.hang = hang;
	}
	/**
	* belowing is method setName. Setting name of Computer
	* @return don't return anything
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	* belowing is method setCpu. Setting Cpu of Computer
	* @return don't return anything
	*/
	public void setCpu(String cpu)
	{
		this.cpu = cpu;
	}
	/**
	* belowing is method setHang. Setting Hang of Computer
	* @return don't return anything
	*/
	public void setHang(String hang)
	{
		this.hang = hang;
	}
}
/**
* belowing is class Umbrella. Showing private of umbrella
*/
class Umbrella
{
	String color;
	public Umbrella(String color)
	{
		this.color = color;
	}
	/**
	* belowing is method setColor. Setting Color of umbrella
	* @param String color
	* @return don't return anything
	*/
	public void setColor(String color)
	{
		this.color = color;
	}
	/**
	* belowing is method getColor. Setting color of umbrella
	* @param none
	* @return color
	*/
	public String getColor()
	{
		return this.color;
	}
}
/**
* belowing is class LightBulb. Showing private of LightBulb
*/
class LightBulb
{
	String status;
	public LightBulb(String status)
	{
		this.status = status;
	}
	/**
	* belowing is method setStatus. Setting status of LightBulb
	* @param String color
	* @return don't return anything
	*/
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	* belowing is method getStatus. Setting Status of LightBulb
	* @param none
	* @return Status
	*/
	public String getStatus()
	{
		return this.status;
	}
}
