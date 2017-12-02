package team.asis.chess;

public class Utils
{
	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * ������������� RuntimeException(String message)
	 * @param message - �������� ������
	 */
	public static void THROW( String message )
	{
		throw new RuntimeException( message );
	}

	// -----------------------------------------------------------------------------------------------------------------
	/**
	 * ������������� RuntimeException(String message) ��� ������������ �������
	 * @param expression - �������
	 * @param message - �������� ������
	 */
	public static void MUST( boolean expression, String message )
	{
		if( !expression )
		{
			THROW( message );
		}
	}
}
