/*
LeftCurly
option = NL
ignoreEnums = (default)true
tokens = (default)ANNOTATION_DEF, CLASS_DEF, CTOR_DEF, ENUM_CONSTANT_DEF, \
         ENUM_DEF, INTERFACE_DEF, LAMBDA, LITERAL_CASE, LITERAL_CATCH, \
         LITERAL_DEFAULT, LITERAL_DO, LITERAL_ELSE, LITERAL_FINALLY, LITERAL_FOR, \
         LITERAL_IF, LITERAL_SWITCH, LITERAL_SYNCHRONIZED, LITERAL_TRY, LITERAL_WHILE, \
         METHOD_DEF, OBJBLOCK, STATIC_INIT, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.blocks.leftcurly;

class InputLeftCurlyMethodTestNewLine2
{
    void InputLeftCurlyMethod() {}
    void InputLeftCurlyMethod(String aOne) { // violation ''{' at column 44 should be on a new line'
    }
    void InputLeftCurlyMethod(int aOne)
    {
    }

    void method1() {}
    void method2() { // violation ''{' at column 20 should be on a new line'
    }
    void method3()
    {
    }
    void                                                               method4()
    {
    }
    void method5(String aOne,
                 String aTwo)
    {
    }
    void method6(String aOne,
                 String aTwo) { // violation ''{' at column 31 should be on a new line'
    }
}

enum InputLeftCurlyMethodEnumTestNewLine2
{
    CONSTANT1()
    {
        void method1() {}
        void method2() { // violation ''{' at column 24 should be on a new line'
        }
        void method3()
        {
        }
        void                                                               method4()
        {
        }
        void method5(String aOne,
                     String aTwo)
        {
        }
        void method6(String aOne,
                     String aTwo) { // violation ''{' at column 35 should be on a new line'
        }
    },

    CONSTANT2() { // violation ''{' at column 17 should be on a new line'

    },

    CONSTANT3()
    {
    };

    private void InputLeftCurlyMethodEnum(String value)
    {

    }

    void method1() {}
    void method2() { // violation ''{' at column 20 should be on a new line'
    }
    void method3()
    {
    }
    void                                                               method4()
    {
    }
    void method5(String aOne,
                 String aTwo)
    {
    }
    void method6(String aOne,
                 String aTwo) { // violation ''{' at column 31 should be on a new line'
    }
}
