import java.util.ArrayList;

public class Academic extends Person {
    private ArrayList<String> qualifications;
    
    public Academic(String name, int age, String[] quals){
        super(name,age); // calls Person cons
        qualifications = new ArrayList<>();
        for (String s : quals)
            qualifications.add(s);
    }
    
    public ArrayList<String> getQualifications(){
        return qualifications;
    }
    
    public void setQualification(ArrayList<String> quals){
        qualifications = quals;
    }
    
    // equals
    
    @Override
    public String toString(){
        return super.toString() + " Qualifications: " + getQualifications();
    }
}