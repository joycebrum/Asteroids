
public class Asteroide 
{
	double x;
	double y;
	int tamanho;
	double vrotacao;
	double vx;
	double vy;
	double dir=0.0;
	
	public Asteroide (double a, double b, int tam, double vr, double velx, double vely)
	{
		this.x = a;
		this.y = b;
		this.tamanho = tam;
		this.vrotacao = vr;
		this.vx = velx;
		this.vy = vely;
		
	}
	
	public void animar(double dt)
	{
		x+=vx*dt;
		y+=vy*dt;
		dir += vrotacao*dt;
		dir = dir%(2*Math.PI);
		if(x>Jogo.getLargura())
		{
			x=0;
		}
		else if(x<0)
		{
			x=Jogo.getLargura();
		}
		if(y>Jogo.getAltura())
		{
			y=0;
			
		}
		else if(y<0)
		{
			y=Jogo.getAltura();
		}
	}
	
	public void Desenha(Tela t)
	{
		if(tamanho==4)
		{
			t.imagem("asteroids.png", 65, 192, 112-65, 240-192, dir, x, y);
		}
		else if (tamanho==3)
		{
			t.imagem("asteroids.png", 32, 192, 64-32, 224-192, dir, x, y);
		}
		else if(tamanho==2)
		{
			t.imagem("asteroids.png", 16, 192, 32-16, 208-192, dir, x, y);
		}
		else
		{
			t.imagem("asteroids.png", 4, 196, 12-4, 204-196, dir, x, y);
		}
	}
}
