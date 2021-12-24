/*
 * Copyright (c) 2019 Fujitsu Limited and/or its affiliates. All rights
 * reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.tools.xjc;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
public class Utils {
    public static String getSwarefSchemaSystemId(){
        URL systemId = Utils.class.getClassLoader().getResource(Constants.SCHEMASOURCE_SWAREF);
        return systemId.toString();
    }
}