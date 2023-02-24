/*
 * Copyright (c) 2002-2010 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit.util;

import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.gargoylesoftware.htmlunit.BrowserRunner;
import com.gargoylesoftware.htmlunit.WebDriverTestCase;
import com.gargoylesoftware.htmlunit.BrowserRunner.Alerts;
import com.gargoylesoftware.htmlunit.BrowserRunner.NotYetImplemented;

/**
 * Tests for {@link UrlUtils}.
 *
 * @version $Revision: 5880 $
 * @author Ahmed Ashour
 */
@RunWith(BrowserRunner.class)
public class UrlUtils2Test extends WebDriverTestCase {

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts("#<a>foobar</a>")
    @NotYetImplemented
    public void hash() throws Exception {
        final String html = "<html><body onload='test()'>\n"
            + "<script>\n"
            + "function test() {\n"
            + "  alert(document.location.hash);\n"
            + "}\n"
            + "</script>\n"
            + "</body></html>";

        getMockWebConnection().setDefaultResponse(html);
        loadPageWithAlerts2(html, new URL(getDefaultUrl().toExternalForm() + "?#<a>foobar</a>"));
    }
}
