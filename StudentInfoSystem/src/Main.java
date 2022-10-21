import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        //Scanner input2 = new Scanner(System.in);
        //Scanner input3 = new Scanner(System.in);
        //=========================================================
        Teacher t1 = new Teacher("james","TRH","555");
        Teacher t2 = new Teacher("paul","FZK","465");
        Teacher t3 = new Teacher("Jane","BIO","151");
        //=========================================================
        Course tarih=new Course("tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("biyoloji","102","BIO");
        biyoloji.addTeacher(t3);
        //=========================================================

        Student s1 = new Student("katie","789","1",tarih,fizik,biyoloji);
        Scanner input3 = new Scanner(System.in);
        System.out.print("Tarih dersi sözlü notunu giriniz : ");
        double sozlu1 = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.print("fizik dersi sözlü notunu giriniz : ");
        double sozlu2 = input4.nextInt();
        Scanner input5 = new Scanner(System.in);
        System.out.print("biyoloji dersi sözlü notunu giriniz : ");
        double sozlu3 = input5.nextInt();
        s1.addsozlu(sozlu1,sozlu2,sozlu3);

        System.out.print("Tarih dersi sınav notunu giriniz : ");
        int s1note1 = input1.nextInt();
        System.out.print("fizik dersi sınav notunu giriniz : ");
        int s2note1 = input1.nextInt();
        System.out.print("biyoloji dersi sınav notunu giriniz : ");
        int s3note1 = input1.nextInt();
        s1.addBulkExamNote(s1note1,s2note1,s3note1);
        s1.issPass();
        s1.printNote();

        Student s2 = new Student("smith","145","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(40,60,90);
        s2.issPass();
        s2.printNote();

        Student s3 = new Student("brown","354","3",tarih,fizik,biyoloji);
        s3.addBulkExamNote(20,10,90);
        s3.issPass();
        s3.printNote();






    }
}
