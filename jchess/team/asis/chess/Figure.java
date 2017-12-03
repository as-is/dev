package team.asis.chess;

public class Figure
{
	private String color = "White"; // "White" "Black"
	private String name = "Pawn"; // "King" "Queen" "Tower" "Officer" "Horse" "Pawn"
	private String place = "e2"; // 'a'..'h' + '1'..'8'

	// -----------------------------------------------------------------------------------------------------------------
	public Figure( String color, String name, String place )
	{
		Utils.MUST( checkColor( color ), "Color '" + color + "' is wrong" );
		this.color = color;

		Utils.MUST( checkName( name ), "Name '" + name + "' is wrong" );
		this.name = name;

		Utils.MUST( checkPlace( place ), "Place '" + place + "' is wrong" );
		this.place = place;
	}

	// -----------------------------------------------------------------------------------------------------------------
	public String getColor() { return color; }

	// -----------------------------------------------------------------------------------------------------------------
	public String getName() { return name; }

	// -----------------------------------------------------------------------------------------------------------------
	public String getPlace() { return place; }

	// -----------------------------------------------------------------------------------------------------------------
	public boolean isAlly( Figure figure )
	{
		Utils.MUST( figure != null, "Figure '" + figure + "' is wrong" );
		return figure.getColor().equals( color );
	}

	// -----------------------------------------------------------------------------------------------------------------
	private boolean checkColor( String color )
	{
		if( color == null )
			return false;

		if( !color.equals( "White" ) && !color.equals( "Black" ) )
			return false;

		return true;
	}

	// -----------------------------------------------------------------------------------------------------------------
	private boolean checkName( String name )
	{
		if( name == null )
			return false;

		switch( name )
		{
			case "King"   : return true;
			case "Queen"  : return true;
			case "Tower"  : return true;
			case "Officer": return true;
			case "Horse"  : return true;
			case "Pawn"   : return true;
			default       : return false;
		}
	}

	// -----------------------------------------------------------------------------------------------------------------
	private boolean checkPlace( String place )
	{
		if( place == null )
			return false;

		if( place.length() != 2 )
			return false;

		char vertical = place.charAt( 0 );
		if( (vertical < 'a') || (vertical > 'h') )
			return false;

		char horizontal = place.charAt( 1 );
		if( (horizontal < '1') || (horizontal > '8') )
			return false;

		return true;
	}
}
