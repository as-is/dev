package team.asis.chess;

public class simple
{
	// -----------------------------------------------------------------------------------------------------------------
	public static void main( String[] args )
	{
		try
		{
			Figure p = new Figure( "White", "Pawn", "e2" );
			System.out.println( p.getColor() );
			System.out.println( p.getName() );
			System.out.println( p.getPlace() );
		}
		catch( Throwable ex )
		{
			System.out.println( Utils.getErrorDescription( ex ) );
		}
		System.out.println("OK");
	}
}
