package bangunruang;

public class Bola extends BangunRuang{
    private float r;
    private float phi;
    
    public Bola(float r){
        this.r = r;
        this.phi = 3.14f;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = 4 * phi * r * r;
    }
    
    @Override
    public void hitungVolume(){
        this.volume = 4/3 * phi * r * r * r;
    }
    
    
    
    
}
