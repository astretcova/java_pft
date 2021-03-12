package ru.stqa.pft.addressbook;

public class SecondData {
  private final String address;
  private final String email2;
  private final String byear;

  public SecondData(String address, String email2, String byear) {
    this.address = address;
    this.email2 = email2;
    this.byear = byear;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail2() {
    return email2;
  }

  public String getByear() {
    return byear;
  }
}
