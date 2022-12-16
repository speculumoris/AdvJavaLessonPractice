package Enums;

public class SchoolManagement {
    //TASK:okul yönetimi için öğrenci ve teacher silme programı yazınız.
//User için role tanımlayın(ADMIN,TEACHER,STUDENT) ve role göre silme yetkisi veriniz.
//öğrenci silme yetkisi: ADMIN-TEACHER
//teacher silme yetkisi: ADMIN
    public static void main(String[] args) {

        Student student =new Student("Tolstoy");
        Teacher teacher=new Teacher("Balzac");

        User user1=new User("Jules Verne",Role.ROLE_ADMIN);
        User user2=new User("C.Dickens",Role.ROLE_TEACHER);
        User user3=new User("J. Steinbeck",Role.ROLE_STUDENT);
    }
    public static void deleteStudent(Student std,User user){
        if(user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is deleted succesfully by "+ user.getRole().name);
        }else {
            System.out.println("");
        }
    }
}
