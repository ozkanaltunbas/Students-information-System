public class Course {
    Teacher teacher; //başka sınıftan aldım. --> bu teacher nesnesi tüm özelliklere sahip.
    String name;
    String code;
    String prefix;
    double note;
    double sozlu;

    double total;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note = 0;
        int sozlu=0;
        double total=0;
    }
    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
           // System.out.println("Ekleme başarı ile tamamlandı.");
        }else{
            System.out.println("Öğretmen branşı ile ders uyuşmuyor!");
        }

    }
    void printTeacher(){
        this.teacher.print();

    }



}
