package ru.stqa.pft.addressbook;

public class MainData {
  private final String firstname;
  private final String lastname;
  private final String email;
  private final String address2;
  private final String mobile;

  public MainData(String firstname, String lastname, String email, String address2, String mobile) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.address2 = address2;
    this.mobile = mobile;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress2() {
    return address2;
  }

  public String getMobile() {
    return mobile;
  }
}
