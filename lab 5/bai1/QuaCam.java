/**
* class QuaCam extends to class HoaQua and have one more private is soMui
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/
class QuaCam extends HoaQua
{
  private String soMui;
  private String huongVi;
  /**
  * constructor QuaCam to set privates of QuaCam
  * @param none
  */
  public QuaCam()
  {
    this.SetMauSac("cam");
  }
  /**
  * getSoMui() get soMui of QuaCam
  * @param none
  * @return String soMui
  */
  public String getSoMui()
  {
    return this.soMui;
  }
  public void setHuongVi(String huongVi)
  {
    this.huongVi = huongVi;
  }
  /**
  * setSoMui() set soMui of QuaCam
  * @param String s
  * @return none
  */
  public void setSoMui(String s)
  {
    this.soMui = s;
  }
  public String getHuongVi()
  {
    return this.huongVi;
  }
}