package org.apache.maven.plugin.ear;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Thrown if an unknown artifact type is encountered.
 * 
 * @author <a href="snicoll@apache.org">Stephane Nicoll</a>
 * @version $Id$
 */
public class UnknownArtifactTypeException
    extends EarPluginException
{

    /**
     * 
     */
    private static final long serialVersionUID = 2738931967722457793L;

    /**
     * Create an instance.
     */
    public UnknownArtifactTypeException()
    {
    }

    /**
     * @param message The message of the problem.
     */
    public UnknownArtifactTypeException( String message )
    {
        super( message );
    }
}
