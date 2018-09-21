/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.viratec.internal.exceptions;

/**
 * {@link LinkButtonException} Exception, wenn der Button am ViraCube nicht gedrückt worden ist
 *
 *
 *
 */

public class LinkButtonException extends ApiException {

    public LinkButtonException() {
    }

    public LinkButtonException(String message) {
        super(message);
    }

}