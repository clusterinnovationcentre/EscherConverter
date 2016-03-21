/*
 * $Id$
 * $URL$
 * ---------------------------------------------------------------------
 * This file is part of the program BioNetView.
 *
 * Copyright (C) 2013-2016 by the University of California, San Diego.
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation. A copy of the license
 * agreement is provided in the file named "LICENSE.txt" included with
 * this software distribution and also available online as
 * <http://www.gnu.org/licenses/lgpl-3.0-standalone.html>.
 * ---------------------------------------------------------------------
 */
package edu.ucsd.sbrg.escher;

/**
 * @author Andreas Dr&auml;ger
 *
 */
public interface Position extends EscherBase {

	/**
	 * @return the x
	 */
	public Double getX();

	/**
	 * @return the y
	 */
	public Double getY();

	/**
	 * 
	 * @return {@code true} if the requested property is not {@code null}.
	 */
	public boolean isSetX();

	/**
	 * 
	 * @return {@code true} if the requested property is not {@code null}.
	 */
	public boolean isSetY();

	/**
	 * @param x the x to set
	 */
	public void setX(Double x);

	/**
	 * @param y the y to set
	 */
	public void setY(Double y);

}
