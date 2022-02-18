package ca.uwaterloo.liang;
/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 Clark Verbrugge
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//This is reference to the methods implemented in soot.coffi.ClassFile
public class ClassFile {
	  private static final Logger logger = LoggerFactory.getLogger(ClassFile.class);
	  /** Descriptor code string. */
	  public static final String DESC_BYTE = "B";
	  /** Descriptor code string. */
	  public static final String DESC_CHAR = "C";
	  /** Descriptor code string. */
	  public static final String DESC_DOUBLE = "D";
	  /** Descriptor code string. */
	  public static final String DESC_FLOAT = "F";
	  /** Descriptor code string. */
	  public  static final String DESC_INT = "I";
	  /** Descriptor code string. */
	  public static final String DESC_LONG = "J";
	  /** Descriptor code string. */
	  public static final String DESC_OBJECT = "L";
	  /** Descriptor code string. */
	  public static final String DESC_SHORT = "S";
	  /** Descriptor code string. */
	  public static final String DESC_BOOLEAN = "Z";
	  /** Descriptor code string. */
	  public static final String DESC_VOID = "V";
	  /** Descriptor code string. */
	  public static final String DESC_ARRAY = "[";
	  
	  /**
	   * Static utility method to parse the given method descriptor string.
	   *
	   * @param s
	   *          descriptor string.
	   * @return return type of method.
	   * @see ClassFile#parseDesc
	   * @see ClassFile#parseMethodDesc_params
	   */
	  public static String parseMethodDesc_return(String s) {
	    int j;
	    j = s.lastIndexOf(')');
	    if (j >= 0) {
	      return parseDesc(s.substring(j + 1), ",");
	    }
	    return parseDesc(s, ",");
	  }

	  /**
	   * Static utility method to parse the given method descriptor string.
	   *
	   * @param s
	   *          descriptor string.
	   * @return comma-separated ordered list of parameter types
	   * @see ClassFile#parseDesc
	   * @see ClassFile#parseMethodDesc_return
	   */
	  public static String parseMethodDesc_params(String s) {
	    int i, j;
	    i = s.indexOf('(');
	    if (i >= 0) {
	      j = s.indexOf(')', i + 1);
	      if (j >= 0) {
	        return parseDesc(s.substring(i + 1, j), ",");
	      }
	    }
	    return "<parse error>";
	  }

	  /**
	   * Static utility method to parse the given method descriptor string.
	   *
	   * @param desc
	   *          descriptor string.
	   * @param sep
	   *          String to use as a separator between types.
	   * @return String of types parsed.
	   * @see ClassFile#parseDesc
	   * @see ClassFile#parseMethodDesc_return
	   */
	  public static String parseDesc(String desc, String sep) {
	    String params = "", param;
	    char c;
	    int i, len, arraylevel = 0;
	    boolean didone = false;

	    len = desc.length();
	    for (i = 0; i < len; i++) {
	      c = desc.charAt(i);
	      if (c == DESC_BYTE.charAt(0)) {
	        param = "byte";
	      } else if (c == DESC_CHAR.charAt(0)) {
	        param = "char";
	      } else if (c == DESC_DOUBLE.charAt(0)) {
	        param = "double";
	      } else if (c == DESC_FLOAT.charAt(0)) {
	        param = "float";
	      } else if (c == DESC_INT.charAt(0)) {
	        param = "int";
	      } else if (c == DESC_LONG.charAt(0)) {
	        param = "long";
	      } else if (c == DESC_SHORT.charAt(0)) {
	        param = "short";
	      } else if (c == DESC_BOOLEAN.charAt(0)) {
	        param = "boolean";
	      } else if (c == DESC_VOID.charAt(0)) {
	        param = "void";
	      } else if (c == DESC_ARRAY.charAt(0)) {
	        arraylevel++;
	        continue;
	      } else if (c == DESC_OBJECT.charAt(0)) {
	        int j;
	        j = desc.indexOf(';', i + 1);
	        if (j < 0) {
	          logger.warn("Parse error -- can't find a ; in " + desc.substring(i + 1));
	          param = "<error>";
	        } else {
	          if (j - i > 10 && desc.substring(i + 1, i + 11).compareTo("java/lang/") == 0) {
	            i = i + 10;
	          }
	          param = desc.substring(i + 1, j);
	          // replace '/'s with '.'s
	          param = param.replace('/', '.');
	          i = j;
	        }
	      } else {
	        param = "???";
	      }
	      if (didone) {
	        params = params + sep;
	      }
	      params = params + param;
	      while (arraylevel > 0) {
	        params = params + "[]";
	        arraylevel--;
	      }
	      didone = true;
	    }
	    return params;
	  }
}
