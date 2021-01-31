package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id = Integer.MAX_VALUE;
    private String firstname;
    private String middlername;
    private String lastname;
    private String nickname;
    private String title;
    private String company;
    private String address;
    private String homeTel;
    private String mobileTel;
    private String work;
    private String fax;
    private String email;
    private String email2;
    private String email3;
    private String homepage;
    private String bday;
    private String bmonth;
    private String byear;
    private String aday;
    private String amonth;
    private String ayear;
    private String group;
    private String address2;
    private String phone2;
    private String notes;
    private String allPhones;

    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public ContactData withMiddlername(String middlername) {
        this.middlername = middlername;
        return this;
    }

    public String getMiddlername() {
        return middlername;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public ContactData withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public ContactData withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ContactData withCompany(String company) {
        this.company = company;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ContactData withHomeTel(String homeTel) {
        this.homeTel = homeTel;
        return this;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public ContactData withMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
        return this;
    }

    public String getMobileTel() {
        return mobileTel;
    }

    public ContactData withWork(String work) {
        this.work = work;
        return this;
    }

    public String getWork() {
        return work;
    }

    public ContactData withFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactData withEmail2(String email2) {
        this.email2 = email2;
        return this;
    }

    public String getEmail2() {
        return email2;
    }

    public ContactData withEmail3(String email3) {
        this.email3 = email3;
        return this;
    }

    public String getEmail3() {
        return email3;
    }

    public ContactData withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public ContactData withBday(String bday) {
        this.bday = bday;
        return this;
    }

    public String getBday() {
        return bday;
    }

    public ContactData withBmonth(String bmonth) {
        this.bmonth = bmonth;
        return this;
    }

    public String getBmonth() {
        return bmonth;
    }

    public ContactData withByear(String byear) {
        this.byear = byear;
        return this;
    }

    public String getByear() {
        return byear;
    }

    public ContactData withAday(String aday) {
        this.aday = aday;
        return this;
    }

    public String getAday() {
        return aday;
    }

    public ContactData withAmonth(String amonth) {
        this.amonth = amonth;
        return this;
    }
    public String getAmonth() {
        return amonth;
    }

    public ContactData withAyear(String ayear) {
        this.ayear = ayear;
        return this;
    }
    public String getAyear() {
        return ayear;
    }

    public ContactData withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public ContactData withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    public String getPhone2() {
        return phone2;
    }

    public ContactData withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public String getAllPhones() {
        return allPhones;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
