package org.janusgraph.diskstorage.cql;

import org.janusgraph.diskstorage.BackendException;
import org.janusgraph.diskstorage.configuration.Configuration;
import org.janusgraph.diskstorage.cql.builder.CQLMutateManyFunctionBuilder;
import org.janusgraph.diskstorage.cql.builder.CQLProgrammaticConfigurationLoaderBuilder;
import org.janusgraph.diskstorage.cql.builder.CQLSessionBuilder;
import org.janusgraph.diskstorage.cql.builder.CQLStoreFeaturesBuilder;

public class CQLStoreManagerOneConsistency extends CQLStoreManager {
    protected static final CQLStoreFeaturesBuilder ONE_CONSISTENCY_STORE_FEATURES_BUILDER = new CQLStoreFeaturesBuilder(true);

    public CQLStoreManagerOneConsistency(Configuration configuration) throws BackendException {
        super(configuration, DEFAULT_MUTATE_MANY_FUNCTION_BUILDER, ONE_CONSISTENCY_STORE_FEATURES_BUILDER, DEFAULT_CQL_SESSION_BUILDER, DEFAULT_PROGRAMMATIC_CONFIGURATION_LOADER_BUILDER);
    }

    public CQLStoreManagerOneConsistency(Configuration configuration, CQLMutateManyFunctionBuilder mutateManyFunctionBuilder, CQLStoreFeaturesBuilder storeFeaturesBuilder, CQLSessionBuilder sessionBuilder, CQLProgrammaticConfigurationLoaderBuilder baseConfigurationLoaderBuilder) throws BackendException {
        super(configuration, mutateManyFunctionBuilder, storeFeaturesBuilder, sessionBuilder, baseConfigurationLoaderBuilder);
    }
}
