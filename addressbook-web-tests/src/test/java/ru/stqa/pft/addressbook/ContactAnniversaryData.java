package ru.stqa.pft.addressbook;

public class ContactAnniversaryData {
    private final String aday;
    private final String amonth;
    private final String ayear;

    public ContactAnniversaryData(String aday, String amonth, String ayear) {
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
    }

    public String getAday() {
        return aday;
    }

    public String getAmonth() {
        return amonth;
    }

    public String getAyear() {
        return ayear;
    }
}
