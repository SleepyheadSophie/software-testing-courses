package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.Objects;

@XStreamAlias("contact")
@Entity
@Table(name = "addressbook")
public class ContactData {
    @XStreamOmitField
    @Id
    @Column(name = "id")
    private int id = Integer.MAX_VALUE;

    @Expose
    @Column(name = "firstname")
    private String firstname;

    @Expose
    @Column(name = "middlename")
    private String middlename;

    @Expose
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "address")
    @Type(type = "text")
    private String address;

    @Column(name = "home")
    @Type(type = "text")
    private String homeTel;

    @Column(name = "mobile")
    @Type(type = "text")
    private String mobileTel;

    @Column(name = "work")
    @Type(type = "text")
    private String work;

    @Column(name = "fax")
    @Type(type = "text")
    private String fax;

    @Column(name = "email")
    @Type(type = "text")
    private String email;

    @Column(name = "email2")
    @Type(type = "text")
    private String email2;

    @Column(name = "email3")
    @Type(type = "text")
    private String email3;

    @Column(name = "homepage")
    @Type(type = "text")
    private String homepage;

    @Expose
    @Column(name = "bday", columnDefinition = "TINYINT")
    private int bday;

    @Expose
    @Column(name = "bmonth")
    private String bmonth;

    @Expose
    @Column(name = "byear")
    private String byear;

    @Expose
    @Column(name = "aday", columnDefinition = "TINYINT")
    private int aday;

    @Expose
    @Column(name = "amonth")
    private String amonth;

    @Expose
    @Column(name = "ayear")
    private String ayear;

    @Expose
    @Transient
    private String group;

    @Column(name = "address2")
    @Type(type = "text")
    private String address2;

    @Column(name = "phone2")
    @Type(type = "text")
    private String phone2;

    @Column(name = "notes")
    @Type(type = "text")
    private String notes;

    @Transient
    private String allPhones;
    @Transient
    private String allEmails;

    @Column(name = "photo")
    @Type(type = "text")
    private String photo;

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
        this.middlename = middlername;
        return this;
    }

    public String getMiddlename() {
        return middlename;
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
        this.bday = Integer.parseInt(bday);
        return this;
    }

    public String getBday() {
        return String.valueOf(bday);
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
        this.aday = Integer.parseInt(aday);
        return this;
    }

    public String getAday() {
        return String.valueOf(aday);
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

    public ContactData withAllEmails(String allEmails) {
        this.allEmails = allEmails;
        return this;
    }


    public String getAllEmails() {
        return allEmails;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    public File getPhoto() {
        return new File(photo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                bday == that.bday &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(middlename, that.middlename) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(bmonth, that.bmonth) &&
                Objects.equals(byear, that.byear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, middlename, lastname, bday, bmonth, byear);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

}
