package uni;

public class Student extends Person {
    String fach;
    public Student(String fach) {
        this.fach = fach;
    }
    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Student besucht "+ fach);

    }

    public static void main(String args[]){
        Person teilnehmer[] = new Person[100];

        for(int i = 0; i<100;i++){
            if(i%2 == 0){
                teilnehmer[i] = new Student("Programmieren");
            }else{
                teilnehmer[i] = new Proffesoren("Programmieren");
            }
        }


        for(int i= 0; i< teilnehmer.length; i++){
            System.out.print(i+1 +" ");
            teilnehmer[i].gibTaetigkeitAus();
        }




    }


}
