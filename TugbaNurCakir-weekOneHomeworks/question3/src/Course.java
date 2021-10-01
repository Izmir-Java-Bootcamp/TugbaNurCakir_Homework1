public class Course {
    private String name;
    //private Student[] students;
    private int capacity=40;
    private Student[] students= new Student[capacity];
    private int numberOfStudent; //holds the number of students currently enrolled to the course.

    public Course(String name, int capacity){
        this.name     = name;
        this.capacity   = capacity;
    }
    public Course(String name){
        this.name= name;
    }
    public int getNumberOfStudent(){
        return this.numberOfStudent;
    }
    public String getCourseName(){
        return "";
    }
    public Student[] getStudents() {
        return students;
    }

    public boolean addStudent(Student student){
            if(numberOfStudent < capacity){
                for(int i = 0; i < numberOfStudent; i++){
                    if(student.equals(students[i]))
                        return false;
                }
                students[numberOfStudent] = student;
                numberOfStudent++;
                return true;
            }
            return false;
        }
    public boolean dropStudent(Student student){
        for(int i = 0; i < numberOfStudent; i++){
            if(student.equals(students[i])){
                students[i] = null;
                while(i < numberOfStudent){
                    students[i] = students[i+1];
                    i++;
                }
                numberOfStudent--;
                return true;
            }
        }
        return false;
    }
    public void increaseCapacity(){
        this.capacity = capacity+5;
    }
    public Student getBestStudent(){
        Student bestStudent = students[0];
        for(int i=0; i < numberOfStudent-1; i++){
            if(students[i].getGPA() > students[i+1].getGPA())
                bestStudent = students[i];
        }
        return bestStudent;
    }
    public Student getYoungestStudent(){
        Student youngestStudent = students[0];
        for(int i = 0; i < numberOfStudent - 1; i++){
            if((students[i].getPersonelData().getBirthDate()).compareTo(students[i+1].getPersonelData().getBirthDate()) < 0)
                youngestStudent = students[i];
            else if(students[i].getPersonelData().getBirthDate().compareTo(students[i+1].getPersonelData().getBirthDate()) > 0)
                youngestStudent = students[i + 1];
        }
        return youngestStudent;
    }
    public void clear(){ //method removes all students from the course.
        for(int i=0; i<numberOfStudent; i++){
            students[i] = null;
        }

    }
    public void list(){ //method prints all students enrolled to the course to the screen.
        String result = "";
        for(int i = 0; i < numberOfStudent; i++){
            result += students[i] + "\n";
        }
        System.out.println(result);
    }
    public String toString(){
        return "";
    }
}

