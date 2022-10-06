/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.identity.noop;

import org.opensearch.test.OpenSearchTestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;

public class NoopAuthenticationManagerTests extends OpenSearchTestCase {

    public void testGetSubject() {
        assertThat(new NoopAuthenticationManager().getSubject(), not(nullValue()));
    }

    public void testConsistentSubjects() {
        NoopAuthenticationManager authManager = new NoopAuthenticationManager();
        assertThat(authManager.getSubject(), equalTo(authManager.getSubject()));
    }

}