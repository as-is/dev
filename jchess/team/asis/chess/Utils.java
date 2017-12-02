package team.asis.chess;

public class Utils
{
	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Сгенерировать RuntimeException(String message)
	 * @param message - Описание ошибки
	 */
	public static void THROW( String message )
	{
		throw new RuntimeException( message );
	}

	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * Сгенерировать RuntimeException(String message) при невыполнении условия
	 * @param expression - Условие
	 * @param message - Описание ошибки
	 */
	public static void MUST( boolean expression, String message )
	{
		if( !expression )
		{
			THROW( message );
		}
	}
}
