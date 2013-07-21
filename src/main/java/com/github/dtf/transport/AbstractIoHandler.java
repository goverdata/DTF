/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.dtf.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A convenient {@link IoHandler} implementation to be sub-classed for easier {@link IoHandler} implementation.
 * 
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public abstract class AbstractIoHandler implements IoHandler {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractIoHandler.class);

    /**
     * {@inheritDoc}
     */
    public void sessionOpened(final IoSession session) {
    }

    /**
     * {@inheritDoc}
     */
    public void sessionClosed(final IoSession session) {
    }

    /**
     * {@inheritDoc}
     */
    public void sessionIdle(final IoSession session, final IdleStatus status) {
    }

    /**
     * {@inheritDoc}
     */
    
    public void messageReceived(final IoSession session, final Object message) {
    }

    /**
     * {@inheritDoc}
     */
    public void messageSent(final IoSession session, final Object message) {
    }

    /**
     * {@inheritDoc}
     */
    
    public void serviceActivated(final IoService service) {
    }

    /**
     * {@inheritDoc}
     */
    
    public void serviceInactivated(final IoService service) {
    }

    /**
     * {@inheritDoc}
     */
    
    public void exceptionCaught(final IoSession session, final Exception cause) {
        LOG.error("Unexpected exception, we close the session : ", cause);
        session.close(true);
    }
}
