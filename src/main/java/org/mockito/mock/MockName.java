/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.mock;

/**
 * Represents the name of the mock as shown in the verification failure reports, etc.
 */
public interface MockName {

    /**
     * the name
     */
    String toString();

    /**
     * default name means generated by Mockito. non-default means the user has named the mock at creation.
     */
    boolean isDefault();
}
