/*
 *$LastChangedDate$
 *$LastChangedRevision$
 * Ligia Tatiana Gonzalez Leyva <calvinahobbes@gmail.com>
 */

import java.io.*;

public class Peon extends Pieza {

	// Constructor
	public Peon (int color, int x, int y) {
		
		super(color, x, y);
		System.out.println("Peon.Peon(): \t\tCreado con color <" + color + "> y posicion (" + x + ", " + y + ")");
	}
}
