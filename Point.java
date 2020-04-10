class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	public Point(String id,double x, double y, String color)
	{
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
	}

	//TODO setters and getters
	public String getID()
	{
		return id;
	}
	public void setID(String id)
	{
		this.id=id;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public String getColor()
	{
		return color;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	


	public void move (char xDirection, char yDirection) {
		//TODO
		int temp1=Character.getNumericValue(xDirection);
		int temp2=Character.getNumericValue(yDirection);
		this.setX(temp1);
		this.setY(temp2);

		if(xDirection>0)
		{
			//move right
		}
		if(xDirection<0)
		{
			//move left
		}
		if(yDirection>0)
		{
			//move up
		}
		if(yDirection<0)
		{
			//move down
		}
		
	}

	public void draw () {
		//TODO
		System.out.println("Tochkata se naogja na koordinati x= "+x+" y="+y);
	}



}
