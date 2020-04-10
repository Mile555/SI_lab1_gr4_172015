
public class Canvas {
	List<Points> lista;
	int broj;
	
	public Canvas(List<Points> lista)
	{
		this.broj=broj;
		for(int i=0,i<this.broj;i++)
		{
			this.lista[i]=lista[i];
		}
	}
	public add(Points t)
	{
		this.lista[broj+1]=t;
	}
	public remove(Points t)
	{
		for(int i=0,i<this.broj;i++)
		{
			if(this.lista[i]==t)
			{
				//remove
			}
		}
	}
}
