package Wire;

import graphInterface.WindowError;

/**
 * Klasa reprezentuje obiekt - głowę elektronu.
 * 
 * @author Maciej Tarnowski, Marcin Krasuski
 */
public class ObjElectrHead implements BoardObject {
	
	private int h, w;
	
	/**
	 * Konstruktor ustala parametry głowy elektronu.
	 * 
	 * @param h współrzędna y
	 * @param w współrzędna x
	 */
	public ObjElectrHead( int h, int w ) {
		this.h = h;
		this.w = w;
	}

	/**
	 * Metoda umieszcza głowę elektronu na planszy.
	 * Jeżeli obiekt wychodzi poza planszę, wyświetlany jest komunikat o błędzie.
	 */
	@Override
	public void addToBoard( Board b, int ifBack ) {
		try {
			b.getCell( h, w ).setValue( 2 );
		} catch( ArrayIndexOutOfBoundsException e ) {
			if( ifBack == 0 )
				new WindowError( "<html>Object is out of bounds.<br>" + getClass().getName() + ", " + h + ", " + w + "</html>" );
		}
	}
}
