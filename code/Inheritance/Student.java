public class Student extends Person {
    private String id;
    
    public Student(String id, String name, int age){
        // super() -> cons Person()
        //this.id = id;
        super(name,age);
        setId(id);
        //setName(name);
        //setAge(age);
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Id = " + getId() + " " + super.toString();
    }
    
    @Override
    public boolean equals(Object o){
    // two student objects are equal if they have the same id and are the same person
        if (o != null && o instanceof Student){
            Student s = (Student)o;
            return super.equals(s) && this.getId() == s.getId();
        }
        return false;
    }

}