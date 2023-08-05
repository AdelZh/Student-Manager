// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Student student=new Student("Adel", 23);
        Student student1=new Student("Farida", 78);
        Student student2=new Student("Alina", 67);
        Student student3=new Student("Elina", 6);
        Student student4=new Student("Eliza", 8);
        Student student5=new Student("Farida", 88);


        Student [] students= {student, student1,student2, student3,student5};

        StudentManager studentManager=new StudentManager("Beka", 2,students);
        System.out.println(studentManager);
        System.out.println("--------------------------------------");


        System.out.println(studentManager.addNewStudents(student4));
        studentManager.getAllStudents();
        System.out.println("---------------------------------------");

        System.out.println(studentManager.updateStudents("Adel", 18));
       studentManager.getAllStudents();
        System.out.println("----------------------------------------");

        System.out.println(studentManager.searchByName("Elina"));
        System.out.println("-----------------------------------------");

        System.out.println(studentManager.getMeAllStudentsByNameFarida("Farida"));
        System.out.println("------------------------------------------");



    }
}