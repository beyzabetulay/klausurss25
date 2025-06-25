package exercises;

public class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
class prüfen{
    public void pruefezahl(int zahl) throws MyException{
        if(zahl<0){
            throw new MyException("zahl kann nicht negatif sein");
        }
    }
}