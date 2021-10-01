public class Student {
     private PersonelData pd;
     private String name;
     private double GPA;
     private long id;

    public Student(String name, long id, double GPA, PersonelData pd) {
        this.GPA  = GPA;
        this.id   = id;
        this.name = name;
        this.pd   = pd;
    }

    public String getName(){
        return name;
    }

    public long getID(){

        return id;
    }

    public double getGPA(){

        return GPA;
    }

    public PersonelData getPersonelData() {

        return pd;
    }

    public String toString(){

        return "Student name :"+this.name+"\nStudent id :"+this.id+"\nStudent GPA :"+this.GPA;
    }


}

