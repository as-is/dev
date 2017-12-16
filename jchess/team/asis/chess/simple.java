package team.asis.chess;

import java.util.ArrayList;

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
			System.out.println( p.getPlaces() );
			ArrayList<String> s = p.getPlaces();
			System.out.println( "p " + p.getPlaces() );
			System.out.println( "s " + s );
			s.add( "123" );
			System.out.println( "p " + p.getPlaces() );
			System.out.println( "s " + s );
			s.clear();
			System.out.println( "p " + p.getPlaces() );
			System.out.println( "s " + s );
		}
		catch( Throwable ex )
		{
			System.out.println( Utils.getErrorDescription( ex ) );
		}
		System.out.println("OK");
	}
}
