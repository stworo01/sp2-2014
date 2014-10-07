public abstract class Person {
    private int age;
    private String name;
    
    public Person(String name, int age){
        // super() -> cons Object()
        setName(name);
        setAge(age);
    }
    
    //public Person(){
    //    super() -> cons Object()
    //}
     
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }    
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return "Age = " + getAge() + " Name = " + getName();
    }
    
    @Override
    public boolean equals(Object o){
    // two person objects are equal if they have the same name and same age
        if (o != null && o instanceof Person){
            Person p = (Person)o;
            return this.getName().equals(p.getName()) && this.getAge() == p.getAge();
        }
        return false;
    }
}