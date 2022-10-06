/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.identity.noop;

import org.opensearch.identity.AccessTokenManager;
import org.opensearch.identity.AuthenticationManager;
import org.opensearch.identity.Subject;

/**
 * Implementation of authentication manager that does not enforce authentication
 *
 * This class and related classes in this package will not return nulls or fail permissions checks
 *
 * @opensearch.internal
 */
public class NoopAuthenticationManager implements AuthenticationManager {

    @Override
    public Subject getSubject() {
        return new NoopSubject();
    }

    @Override
    public AccessTokenManager getAccessTokenManager() {
        return null;
    }
}