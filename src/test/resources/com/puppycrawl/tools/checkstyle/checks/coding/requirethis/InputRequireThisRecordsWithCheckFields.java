/*
RequireThis
checkFields = true
checkMethods = (default)true
validateOnlyOverlapping = (default)true


*/

// Java17
package com.puppycrawl.tools.checkstyle.checks.coding.requirethis;

public record InputRequireThisRecordsWithCheckFields(String a) {
    void method() {
        String a = "BUG";
        a = a.substring(0, 1); // ok, field 'a' is final and cannot be changed
    }

    void method2() {
        String x = a; // ok, not overlapping
        String y = this.a; // ok, uses 'this'
        String a = this.a; // ok, local variable assigned from field
        a += a; // ok, local variable
    }
}
class InputRequireThisRecordsWithCheckFieldsClassOne {
    public final String a;

    public InputRequireThisRecordsWithCheckFieldsClassOne(String a) {
        this.a = a;
    }

    void method() {
        String a = "BUG";
        a = a.substring(0, 1); // ok, field 'a' is final and cannot be changed
    }

    void method2() {
        String x = a; // ok, not overlapping
        String y = this.a; // ok, uses 'this'
        String a = this.a; // ok, local variable assigned from field
        a += a; // ok, local variable
    }

    public String a() {
        return a;
    }
}
