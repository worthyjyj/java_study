package New;

public class ddd {
    public static void main(String[] args) {
        int a=8;
        int b=9;
        String [] student= {"김소민","선새롬","오윤균","이보름","이태영","이효미","정수영","박지은","정준석","이영진"};
        String [] time= {a+":50", a+":55", b+":01", b+":05", b+":06", b+":14" , a+":45", a+":47", b+":56", b+":37"};


        for (int i=0; i<student.length; i++) {
            System.out.println(student[i]); }

        for (int i=0; i<student.length; i++) {
            System.out.printf("%s %s\n",student[i],time[i]); }


        for (int i=0; i<2; i++) {
            System.out.printf("%s 완료\n", student[i]);
        }
        for (int i=0; i>2 && i<9; i++) {
            System.out.printf("%s 완료\n", student[i]);
        }
    }
}
