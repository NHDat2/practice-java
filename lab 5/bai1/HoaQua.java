/**
* class HoaQua describes privates of fruits. Such as name, maHang, ngayNhap, mausac, giaBan
* @author : Nguyen Huu Dat
* @version : 1.0
* @since : 1/10/2018
*/

class HoaQua
{
  private String name;
  private String maHang;
  private String ngayNhap;
  private String mauSac;
  private String giaBan;
  private String xuatsu;

  /**
  * getName() get name of the fruit
  * @param none
  * @return String name
  */
  public String getName()
  {
    return this.name;
  }
  /**
  * setName() set name of the fruit
  * @param String s
  * @return none
  */
  public void setName(String s)
  {
    this.name = s;
  }
  /**
  * getMaHang() get maHang of the fruit
  * @param none
  * @return String maHang
  */
  public String getMaHang()
  {
    return this.maHang;
  }
  /**
  * setMaHang() set maHang of the fruit
  * @param String s
  * @return none
  */
  public void setMaHang(String s)
  {
    this.maHang = s;
  }
  public void setXuatSu(String xuatsu)
  {
    this.xuatsu = xuatsu;
  }
  /**
  * getNgayNhap() get ngayNhap of the fruit
  * @param none
  * @return String ngaynhap
  */
  public String getngayNhap()
  {
    return this.ngayNhap;
  }
  /**
  * setNgayNhap() get ngayNhap of the fruit
  * @param String s
  * @return none
  */
  public void setNgayNhap(String s)
  {
    this.ngayNhap = s;
  }
  public String getXuatsu()
  {
    return this.xuatsu;
  }
  /**
  * getMauSac() get MauSac of the fruit
  * @param none
  * @return String mausac
  */
  public String getMauSac()
  {
    return this.mauSac;
  }
  /**
  * setMauSac() set MauSac of the fruit
  * @param String s
  * @return none
  */
  public void SetMauSac(String s)
  {
    this.mauSac = s;
  }
  /**
  * getgiaBan() get giaBan of the fruit
  * @param none
  * @return String giaban
  */
  public String getGiaBan()
  {
    return this.giaBan;
  }
  /**
  * setgiaBan() set giaBan of the fruit
  * @param String s
  * @return none
  */
  public void setGiaBan(String s)
  {
    this.giaBan = s;
  }
  /**
  * getInfo() get info of fruits
  * @param none
  * @return none
  */
  public void getInfo()
  {
    System.out.println(this.getName() + "\nMa Hang: " + this.getMaHang() + "\nGia Hang: " + this.getGiaBan() + "\nMau Sac: " + this.getMauSac());
  }
}