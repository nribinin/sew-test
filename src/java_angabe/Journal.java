package java_angabe;

public class Journal extends Media implements Identifiable{
    private int issueNumber;

    public Journal(String idNo, int year, String title, int issueNumber) {
        super(IDType.ISBN,idNo, year, title);
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber() {
        return this.issueNumber;
    }
    @Override
    public String getID(){
        return super.getIDType().name() + " " + super.getIDNumber();
    }

    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                '}';
    }
}