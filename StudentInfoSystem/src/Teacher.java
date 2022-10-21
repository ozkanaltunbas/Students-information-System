public class Teacher {
    /*
    özellikleri
     */
    String name;
    String mpno;
    String branch;

    /*
    methodu (özellik ekledim ki diğer classlarda burayı çekeyim.)
     */
    Teacher(String name,String branch,String mpno){   //constractor methodu (kurucu method.)
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;

    }
    void print(){
        System.out.println("name : "+this.name);
        System.out.println("Mobile phone : "+this.mpno);
        System.out.println("branch : "+this.branch);

    }

}
