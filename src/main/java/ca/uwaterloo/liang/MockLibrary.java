package ca.uwaterloo.liang;
/* MockAnalysis
 * Copyright (C) 2021 Qian Liang <q8liang@uwaterloo.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

public enum MockLibrary {
    EASYMOCK ("org.easymock.EasyMock", "createMock", "java.lang.Object createMock(java.lang.Class)"),
    MOCKITO ("org.mockito.Mockito", "mock", "java.lang.Object mock(java.lang.Class)"),
    POWERMOCK ("org.powermock.api.mockito.PowerMockito", "mock", "java.lang.Object mock(java.lang.Class)");
    
    private final String library;
    private final String method;
    private final String subSignature;
    
    MockLibrary(String library, String method, String subSignature) {
        this.library = library;
        this.method = method;
        this.subSignature = subSignature;
    }
    
    public String library() {
        return library;
    }
    public String method() {
        return method;
    }
    public String subSignature() {
        return subSignature;
    }
    
}
