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

import static com.epam.reportportal.service.ReportPortal.emitLog;
import static java.text.MessageFormat.format;

import java.io.File;
import java.util.Date;

/**
 * @author Wasiq Bhamla
 * @since 26-Oct-2019
 */
public final class ReportPortalLoggy {
    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     * @param level
     * @param file
     * @param message
     * @param args
     */
    public static void log (final LogLevel level, final File file, final String message, final Object... args) {
        emitLog (format (message, args), level.name ()
            .toLowerCase (), new Date (), file);
    }

    /**
     * @author Wasiq Bhamla
     * @since 26-Oct-2019
     * @param level
     * @param message
     * @param args
     */
    public static void log (final LogLevel level, final String message, final Object... args) {
        emitLog (format (message, args), level.name ()
            .toLowerCase (), new Date ());
    }

    private ReportPortalLoggy () {
        // Utility class.
    }
}