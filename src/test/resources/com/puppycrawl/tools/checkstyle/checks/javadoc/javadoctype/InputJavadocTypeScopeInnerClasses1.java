////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadoctype;

/* Config:
 *
 * scope = public
 */

/**
   Checks javadoc scoping for inner classes.

   Once the Javadoc Check Scope has been left,
   all inner elements should not be reported as violation,
   even if they belong to the checkscope if isolated.

   @author lkuehne
 */
public class InputJavadocTypeScopeInnerClasses1 // ok
{
    public class InnerPublic
    {
        protected class InnerProtected
        {
            class InnerPackage
            {
                private class InnerPrivate
                {

                    class PrivateHiddenPackage
                    {
                    }

                    protected class PrivateHiddenProtected
                    {
                    }

                    public class PrivateHiddenPublic
                    {
                    }
                }
            }
        }
    }
    /** */
    protected class InnerPublic2<T> // ok
    {
    }
}
