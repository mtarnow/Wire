package Wire;

import graphInterface.WindowError;

public class ObjElectrTail implements BoardObject {
	
	private int h, w;
	
	public ObjElectrTail( int h, int w ) {
		this.h = h;
		this.w = w;
	}

	@Override
	public void addToBoard( Board b, int ifBack ) {
		try {
			b.getCell( h, w ).setValue( 3 );
		} catch( ArrayIndexOutOfBoundsException e ) {
			if( ifBack == 0 )
				new WindowError( "<html>Object is out of bounds.<br>" + getClass().getName() + ", " + h + ", " + w + "</html>" );
		}
	}
}
