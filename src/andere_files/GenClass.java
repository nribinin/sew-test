package andere_files;

public class GenClass <T>{
    private T objekt;
    private T objekt2;

    public GenClass(T objekt, T objekt2) {
        this.objekt = objekt;
        this.objekt2 = objekt2;
    }

    public T getObjekt() {
        return objekt;
    }

    public void setObjekt(T objekt) {
        this.objekt = objekt;
    }
    public T getObjekt2() {
        return objekt2;
    }

    public void setObjekt2(T objekt2) {
        this.objekt2 = objekt2;
    }
}
