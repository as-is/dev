package team.asis.chess;

public class Utils
{
	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Сгенерировать RuntimeException(String message)
	 * @param message - описание ошибки
	 */
	public static void THROW( String message )
	{
		throw new RuntimeException( message );
	}

	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Сгенерировать RuntimeException(String message) при невыполнении условия
	 * @param expression - условие
	 * @param message - описание ошибки
	 */
	public static void MUST( boolean expression, String message )
	{
		if( !expression )
		{
			THROW( message );
		}
	}

	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Получить описание ошибки со стеком, исключая MUST() и THROW()
	 * @param ex - исключение
	 */
	public static String getErrorDescription( Throwable ex )
	{
		String endl = System.getProperty( "line.separator" );
		StringBuilder str = new StringBuilder( 1000 );
		str.append( ex.toString() );
		str.append( endl );
		str.append( "Stack:" );

		for( StackTraceElement trace : ex.getStackTrace() )
		{
			boolean isMUST = trace.getMethodName().equals( "MUST" );
			boolean isTHROW = trace.getMethodName().equals( "THROW" );
			if( isMUST || isTHROW )
				continue;

			str.append( endl );
			str.append( "    " );
			str.append( trace.toString() );
		}
		return str.toString();
	}
}
