package models;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person \n     " + name + ", " + age ;
    }
    @Override
    public int compareTo(Person o) {


                int comNom=this.name.compareToIgnoreCase(o.getName());
                if (comNom==0) {
                    return Integer.compare(this.age, o.getAge());
                }else{
                    return comNom;
                }
                // int com=0;
                // com=Integer.compare(per1.getAge(), per2.getAge());
                // return com;
    }
    
}
