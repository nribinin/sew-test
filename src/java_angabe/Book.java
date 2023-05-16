package java_angabe;

import java.util.Objects;

public class Book extends Media implements Identifiable, Comparable<Identifiable>{

    private String author;

    public Book(String idNo, int year, String title, String author){
        super(IDType.ISBN, idNo, year, title);
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String getID(){
        return getIDType().name() + " " + getIDNumber();
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getID().equals(book.getID());
    }

    @Override
    public int hashCode() {
            return 31 + getID().hashCode();
    }
    //@Override
    //public int hashCode() {
    //    final int prime = 31;
    //    int result = 1; result = prime * result + ((autor == null) ? 0 : autor.hashCode());
    //    result = prime * result + erscheinungsJahr;
    //    result = prime * result + ((titel == null) ? 0 : titel.hashCode());
    //    return result;
    //}
    @Override
    public int compareTo(Identifiable o){
       if(o == null) {
			return -1;
       }
       if(this.equals(o)){
           return 0;
       }
       int ret = getID().compareTo(o.getID());

       if(ret != 0) {
           return ret;
       }
       return 0;
    }
}
