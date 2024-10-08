/*
FinalClass


*/

package com.puppycrawl.tools.checkstyle.checks.design.finalclass;

import java.util.ArrayList;

public class InputFinalClass // violation 'Class InputFinalClass should be declared as final'
{
    private InputFinalClass() {}
}

final class test2 {}
class test3
{
   class test4 // violation 'Class test4 should be declared as final'
   {
       private test4() {}
   }
}

class test5
{
    private test5() {}
    test5(int i) {}
}

class test6
{
    public test6() {}
}

final class test7 {
    private test7() {}
}

// Typesafe enum with operation
// abstract classes cannot be final, see bug #837012
abstract class Operation
{
    abstract double eval(double a, double b);

    public static final Operation PLUS =
new Operation("+")
{
    double eval(double a, double b)
    {
return a + b;
    }
};

    public static final Operation MINUS =
new Operation("-")
{
    double eval(double a, double b)
    {
return a - b;
    }
};

    private String _name;
    private Operation(String name)
    {
this._name = name;
    }
}

// Typesafe enum with operation
// abstract classes cannot be final, see bug #837012
interface Evaluable
{
    double eval(double a, double b);
}

// abstract class without its own abstract method decl
abstract class Operation2 implements Evaluable
{

    public static final Operation2 PLUS =
new Operation2("+")
{
    public double eval(double a, double b)
    {
return a + b;
    }
};

    public static final Operation2 MINUS =
new Operation2("-")
{
    public double eval(double a, double b)
    {
return a - b;
    }
};

    private String _name;
    private Operation2(String name)
    {
this._name = name;
    }
}

enum testenum1
{
    A, B;
    testenum1() {}
}

enum testenum2
{
    A, B;
    // violation below 'Class someinnerClass should be declared as final'
    public static class someinnerClass
    {
        private someinnerClass() {}
    }
}

interface TestInterface {
    class SomeClass { // violation 'Class SomeClass should be declared as final'
        private SomeClass() {}
    }
}

@interface SomeAnnotation {
    class SomeClass { // violation 'Class SomeClass should be declared as final'
        private SomeClass() {}
    }
}

class TestAnonymousInnerClasses {
    public static final TestAnonymousInnerClasses ONE = new TestAnonymousInnerClasses() {
        @Override
        public int value() {
            return 1;
        }
    };

    private TestAnonymousInnerClasses() {
    }

    public int value() {
        return 0;
    }
}

class TestNewKeyword { // violation 'Class TestNewKeyword should be declared as final'

    private TestNewKeyword(String s) {
        String a = "hello" + s;
    }

    public int count() {
        return 1;
    }
    public static final TestNewKeyword ONE = new TestNewKeyword("world");
    public static final test6 TWO = new test6() {
    };

    public static void main(String[] args) {
        ArrayList<String> foo = new ArrayList<>();
        foo.add("world");
        foo.forEach(TestNewKeyword::new);
    }
}

interface TestNewKeywordInsideInterface {
    ArrayList<String> foo = new ArrayList<>();
}

// abstract classes cannot be final
abstract class TestPrivateCtorInAbstractClasses {
    private TestPrivateCtorInAbstractClasses() {
    }
}

class TestAnonymousInnerClassInsideNestedClass {
    private TestAnonymousInnerClassInsideNestedClass() { }

    static class NestedClass { // violation 'Class NestedClass should be declared as final'

        public final static TestAnonymousInnerClassInsideNestedClass ONE
                = new TestAnonymousInnerClassInsideNestedClass() {
        };

        private NestedClass() {}
    }
    static class NestedClass2 {

        private NestedClass2() {}

        public static final test6  ONE = new test6() {

            public final NestedClass2 ONE = new NestedClass2() {

            };
        };
    }
}

