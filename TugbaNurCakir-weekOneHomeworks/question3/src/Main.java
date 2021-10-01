public class Main {
    public static void main(String[] args) {
        //5 students are created. Let one of them has the ID 5005.
        Student student1 = new Student("tugba", 5005,3.35, new PersonelData(2000, 6, 30, 110));
        Student student2 = new Student("eray",  5006,3.00, new PersonelData(1997, 4, 27, 111));
        Student student3 = new Student("nur", 5007,2.95, new PersonelData(2005, 8, 10, 112));
        Student student4 = new Student("alp", 5008,3.03, new PersonelData(1998, 1, 20, 113));
        Student student5 = new Student("cakir", 5009,2.03, new PersonelData(1999, 12, 20, 114));

        //A course (let us call it K129) with a capacity of 3 is created
        Course course1 = new Course("K129", 3);

        //Any 4 of the students is added to K129.
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        //All students of K129 are printed on the screen.
        course1.list();

        //The capacity of K129 is increased.
        course1.increaseCapacity();

        //Remaining 2 students are added to K129.
        course1.addStudent(student4);
        course1.addStudent(student5);

        //All students of K129 are printed on the screen.
        course1.list();

        //Student with ID 5005 is dropped from K129.
        course1.dropStudent(student1);

        //All students of K129 are printed on the screen.
        course1.list();

        //Number of students enrolled to K129 is printed.
        System.out.println(course1.getNumberOfStudent());

        //Birth year of best student of K129 is printed on the screen. (You should use - getYear() method of java.util.Date class.)
        System.out.println(course1.getBestStudent().getPersonelData().getBirthDate().getYear());

        //A new course (let us call it K130) is created.
        Course course2 = new Course("K130", 5);

        //All students currently enrolled in K129 are added to K130. (You should use - getStudents() method).
        Student[] students = course1.getStudents();
        for(int i=0; i < course1.getNumberOfStudent(); i++)
            course2.addStudent(students[i]);

        //All students of K129 are removed from the course.
        course1.clear();

        //Student with ID 5005 is dropped from K129 and result of the operation is printed - on the screen.
        System.out.println("\nStudent with ID 5005 is dropped from " + course1.getCourseName() + " is " + course1.dropStudent(student1));

        //All students of K130 are printed on the screen.
        course2.list();

        //Best student of K130 is dropped from K130.
        System.out.println("The best student is "+course2.getBestStudent()+" in K130");

        //All students of K130 are printed on the screen.
        course2.list();

        //GPA of youngest student of K130 is printed on the screen.
        System.out.println("The GPA of youngest student is "+course2.getYoungestStudent().getGPA()+" in K130");

        //Courses K129 and K130 are printed on the screen.
        System.out.println("\nAll students of " + course1.getCourseName() + ": ");
        course1.list();
        System.out.println("\nAll students of " + course2.getCourseName() + ": ");
        course2.list();
    }


}
