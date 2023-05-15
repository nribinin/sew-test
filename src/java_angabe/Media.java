package java_angabe;

public abstract class Media implements Identifiable{
    private String idNo;
    private String title;
    private int year;
    private IDType idType;

    public Media(IDType idType, String idNo, int year, String title){
        this.idType = idType;
        setIDNumber(idNo);
        this.year = year;
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String getIDNumber(){
        return this.idNo;
    }
    public void setIDNumber(String idNumber){
        if (idNumber == null) throw new IllegalArgumentException("Wert darf nicht leer sein!");
        this.idNo = idNumber;
    }

    public IDType getIDType(){
        return this.idType;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return this.idNo  +  " " + this.idNo + " " + this.year + " " + this.title;
    }
}
