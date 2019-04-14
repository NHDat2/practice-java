/**
* class QuaTao extend to Class HoaQua and have one more privates is CanNang
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/
class QuaTao extends HoaQua
{
  private String canNang;
  /**
  * contructor of QuaTao use to set privates of QuaTao
  * @param none
  */
  public QuaTao()
  {
    this.SetMauSac("do");
    this.setXuatSu("USA");
  }
  /**
  * getCanNang() use to get CanNang of QuaTao()
  * @param none
  * @return String canNang
  */
  public String getCanNang()
  {
    return this.canNang;
  }
  /**
  * setCanNang() use to set canNang of QuaTao
  * @param String s
  * @return none
  */
  public void setCanNang(String s)
  {
    this.canNang = s;
  }
}