package com.ListADT;

/**
 * 
 * @author Jay Agullano
 * @since January 19, 2020
 * @version 1.0
 * 
 * This is a testing iterator interface for a 
 * position in a positional list ADT.
 *
 */

public interface Position<E> {
	
	E getElement() throws IllegalStateException;
	
}
