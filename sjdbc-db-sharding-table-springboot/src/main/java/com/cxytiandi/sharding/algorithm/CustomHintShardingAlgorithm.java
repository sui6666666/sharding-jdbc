package com.cxytiandi.sharding.algorithm;

import com.cxytiandi.sharding.config.ShardingRangeConfig;
import org.apache.shardingsphere.sharding.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.hint.HintShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.*;

/**
 * 自定义分片算法
 * 
 * @author suilang
 *
 */
public class CustomHintShardingAlgorithm implements HintShardingAlgorithm<String> {


	@Override
	public Collection<String> doSharding(Collection<String> collection, HintShardingValue<String> hintShardingValue) {
		Collection<String> values = hintShardingValue.getValues();
		String dbName = values.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("发生异常"));
		return values;
	}


	@Override
	public void init(Properties properties) {

	}
}
