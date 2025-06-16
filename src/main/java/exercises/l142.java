package exercises;

public class l142 {
    int x;
    int y;
    public void verschiebePunkt(int zielX, int zielY) {
        x = zielX;
        y = zielY;
        if (x<0 || y<0 || x>1920 || y>1080){
            throw new RuntimeException("deger aralikari dogru deil");
        }
    }
}
