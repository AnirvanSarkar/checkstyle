///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2025 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.sizes;

import static com.puppycrawl.tools.checkstyle.checks.sizes.MethodLengthCheck.MSG_KEY;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractExamplesModuleTestSupport;

public class MethodLengthCheckExamplesTest extends AbstractExamplesModuleTestSupport {
    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/sizes/methodlength";
    }

    @Test
    public void testExample1() throws Exception {

        final int max = 4;

        final String[] expected = {
            "18:3: " + getCheckMessage(MSG_KEY, 5, max, "Example1"),
            "31:3: " + getCheckMessage(MSG_KEY, 6, max, "firstMethod"),
            "44:3: " + getCheckMessage(MSG_KEY, 5, max, "thirdMethod"),
            "52:5: " + getCheckMessage(MSG_KEY, 5, max, "MyBadRecord"),
        };
        verifyWithInlineConfigParser(getPath("Example1.java"), expected);
    }

    @Test
    public void testExample2() throws Exception {

        final int max = 4;

        final String[] expected = {
            "32:3: " + getCheckMessage(MSG_KEY, 6, max, "firstMethod"),
            "45:3: " + getCheckMessage(MSG_KEY, 5, max, "thirdMethod"),
        };
        verifyWithInlineConfigParser(getPath("Example2.java"), expected);
    }

    @Test
    public void testExample3() throws Exception {
        final String[] expected = {
            "33:3: " + getCheckMessage(MSG_KEY, 6, 4, "firstMethod"),
        };
        verifyWithInlineConfigParser(getPath("Example3.java"), expected);
    }
}
