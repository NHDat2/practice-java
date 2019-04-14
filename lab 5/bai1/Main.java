/**
* class Main is use to run class HoaQua, QuaCam, QuaTao, CamCaoPhong and CamSanh.java
* @author Nguyen Huu Dat
* @version 1.0
* @since 1/10/2018
*/
public class Main
{
	/**
	* method main is use to run other mothod
	* @param String[] args is not use
	* @return none
	*/
  public static void main(String[] args)
  {
    QuaCam f1 = new CamCaoPhong();
    CamSanh f2 = new CamSanh();
    f1.getInfo();
    f2.getInfo();
  }
}
