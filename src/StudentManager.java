import java.util.Arrays;

public class StudentManager {
     private String name;

     private int ageOfExperience;

     private Student [] students;

     public StudentManager(String name, int ageOfExperience, Student[] students) {
          this.name = name;
          this.ageOfExperience = ageOfExperience;
          this.students = students;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAgeOfExperience() {
          return ageOfExperience;
     }

     public void setAgeOfExperience(int ageOfExperience) {
          this.ageOfExperience = ageOfExperience;
     }

     public Student[] getStudents() {
          return students;
     }

     public void setStudents(Student[] students) {
          this.students = students;
     }

     public String addNewStudents(Student student){
          for(Student b: students){
               if(b.getName().equals(student.getName())){

                    //return "No need";
               }
          }
          Student[] arr=new Student[students.length+1];
          for(int i=0; i<students.length; i++){
               arr[i]=students[i];
          }

          arr[students.length]=student;
          students= Arrays.copyOf(arr, arr.length);
          System.out.println(arr);
          return "Added";
     }

     public String updateStudents(String bookName, int newAge ){
          for(Student ss:students){
               if(ss.getName().equals(bookName)){
                    ss.setAge(newAge);
               }
          }
          return "Updated";
     }

     public String searchByName(String name){
          for(Student stu:students){
               if(stu.getName().equals(name)){
                    System.out.println(stu);
               }
          }


          return "Successfully founded by Elina";
     }
     public String getMeAllStudentsByNameFarida(String name){
          for(Student arr:students){
               if(arr.getName().equals(name)){
                    System.out.println(arr);
               }
          }
          return "Founded students by name Farida";
     }


     public void getAllStudents(){
          for(int i=0; i<students.length; i++){
               System.out.println(students[i]+" ");
          }


     }

     @Override
     public String toString() {
          return "StudentManager{" +
                  "name='" + name + '\'' +
                  ", ageOfExperience=" + ageOfExperience +
                  ", students=" + Arrays.toString(students) +
                  '}';
     }
}
