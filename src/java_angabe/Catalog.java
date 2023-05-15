package java_angabe;
import java.util.*;

public class Catalog {

    private Map<String, Media> media;

    public Catalog(){
        this.media = new TreeMap<>();
    }

    public void add(Media m){
        if(m == null){
            throw new IllegalArgumentException("Invalid");
        }
        media.put(m.getID(), m);
    }

    public Media getByID(String id){
        if(id == null || media.get(id) == null){ // media.keySet().contains(id);
            throw new IllegalArgumentException("Invalid");
        }
        return media.get(id);
    }


    public String[] getIDs() {

        String[] arr = new String[media.size()];
        int i = 0;
        for(Map.Entry<String, Media> entry : this.media.entrySet()){
            arr[i] = entry.getKey();
            i++;
        }
        return arr;
    }

    public int count(){
        return media.size();
    }

    public String toString(){
        String text = "";
        for(Map.Entry<String, Media> variable : this.media.entrySet()){
            text += variable.getValue() + " ";
        }
        return text;
    }

}
