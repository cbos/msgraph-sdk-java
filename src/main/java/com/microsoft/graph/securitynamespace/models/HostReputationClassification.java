// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Host Reputation Classification.
*/
public enum HostReputationClassification
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * neutral
    */
    NEUTRAL,
    /**
    * suspicious
    */
    SUSPICIOUS,
    /**
    * malicious
    */
    MALICIOUS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For HostReputationClassification values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
