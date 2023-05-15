public class Laptop implements Connectable {

    /* BEGINN nicht zu ändernder Code */
    private final String type = "Laptop";
    private long serialNumber;
    private String manufacturer;

    public Laptop(long serialNumber, String manufacturer) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return this.type;
    }

    public long getSerialNumber() {
        return this.serialNumber;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
    /* ENDE nicht zu ändernder Code */

    @Override
    public String toString() {
        return "Laptop{" +
                "type='" + type + '\'' +
                ", serialNumber=" + serialNumber +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    // TODO relevante Methoden überschreiben
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return serialNumber == laptop.serialNumber &&
                Objects.equals(manufacturer, laptop.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, manufacturer);
    }

    // TODO relevante Interfaces implementieren
}