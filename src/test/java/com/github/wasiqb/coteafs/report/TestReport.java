/*
 * Copyright (c) 2019, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.report;

import static com.github.wasiqb.coteafs.report.ReportPortalLoggy.log;

import java.io.File;

import org.testng.annotations.Test;

/**
 * @author Wasiq Bhamla
 * @since 26-Oct-2019
 */
public class TestReport extends BaseReportPortalTest {
    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testAttachment () {
        log (LogLevel.INFO, new File ("./vid.avi"), "Test Attachment Video");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testDebug () {
        log (LogLevel.DEBUG, "Test Debug message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testError () {
        log (LogLevel.ERROR, "Test Error message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testFatal () {
        log (LogLevel.FATAL, "Test Fatal message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testInfo () {
        log (LogLevel.INFO, "Test Info message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testTrace () {
        log (LogLevel.TRACE, "Test Trace message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testUnknown () {
        log (LogLevel.UNKNOWN, "Test Unknown message");
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     */
    @Test
    public void testWarn () {
        log (LogLevel.WARN, "Test Warn message");
    }
}