package ru.stqa.pft.addressbook;

public class ContactTelephonesData {
    private final String homeTel;
    private final String mobile;
    private final String workTel;
    private final String fax;

    public ContactTelephonesData(String homeTel, String mobile, String workTel, String fax) {
        this.homeTel = homeTel;
        this.mobile = mobile;
        this.workTel = workTel;
        this.fax = fax;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWorkTel() {
        return workTel;
    }

    public String getFax() {
        return fax;
    }
}
