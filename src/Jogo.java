import java.util.Set;


public class Jogo 
{

	static Asteroide[] vetor = new Asteroide[6];
	public Jogo()
	{
		int i;
		for(i=0;i<6;i++)
		{
			vetor[i] = new Asteroide(Math.random()*getLargura(), Math.random()*getAltura(),((int)Math.round(Math.random()*3))+1, Math.random()*2*Math.PI, Math.random()*300, Math.random()*300);
			
		}
	}
	
	public String getTitulo()
	{
		return "Jogo dos asteroides boladao";
	}
	public static int getLargura()
	{
		return 800;
	}
	public static int getAltura()
	{
		return 600;
	}
	public void tecla(String c)
	{
		if(c.equals(" "))
		{
			Motor.tocar("shoot.wav");
		}
	}
	public void tique(Set<String> keys, double dt)
	{
		int i;
        if(keys.contains("left"))
        {
        	
        }
        if(keys.contains("right"))
        {
        	
        }
        for(i=0;i<6;i++)
		{
			vetor[i].animar(dt);
		}
        
        
	}
	 
	public void desenhar(Tela t)
	{
		int i;
		for(i=0;i<6;i++)
		{
			vetor[i].Desenha(t);
		}
	}
	
	public static void main(String[] args)
	{
		new Motor(new Jogo());
	}
	 
}
