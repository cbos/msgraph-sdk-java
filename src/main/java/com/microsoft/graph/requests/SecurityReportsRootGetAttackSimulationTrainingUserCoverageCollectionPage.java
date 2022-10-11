// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationTrainingUserCoverage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Reports Root Get Attack Simulation Training User Coverage Collection Page.
 */
public class SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionPage extends BaseCollectionPage<AttackSimulationTrainingUserCoverage, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder> {

    /**
     * A collection page for AttackSimulationTrainingUserCoverage.
     *
     * @param response The serialized SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionPage(@Nonnull final SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionResponse response, @Nonnull final SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SecurityReportsRootGetAttackSimulationTrainingUserCoverage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionPage(@Nonnull final java.util.List<AttackSimulationTrainingUserCoverage> pageContents, @Nullable final SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
