package com.cxytiandi.sharding.algorithm;

import com.cxytiandi.sharding.config.ShardingRangeConfig;
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
public class CustomPreciseShardingAlgorithm implements StandardShardingAlgorithm<Long> {

	private static List<ShardingRangeConfig> configs = new ArrayList<>();

	static {
		ShardingRangeConfig config = new ShardingRangeConfig();
		config.setStart(0);
		config.setEnd(10);
		config.setDatasourceList(Arrays.asList("ds0", "ds1"));
		configs.add(config);

		config = new ShardingRangeConfig();
		config.setStart(11);
		config.setEnd(20);
		config.setDatasourceList(Arrays.asList("dss0", "dss1"));
		configs.add(config);
	}


	@Override
	public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Long> rangeShardingValue) {
		return null;
	}


	@Override
	public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
		Optional<ShardingRangeConfig> configOptional = configs.stream().filter(
				c -> preciseShardingValue.getValue() >= c.getStart() && preciseShardingValue.getValue() <= c.getEnd()).findFirst();
		if (configOptional.isPresent()) {
			ShardingRangeConfig rangeConfig = configOptional.get();
			for (String ds : rangeConfig.getDatasourceList()) {
				if (ds.endsWith(preciseShardingValue.getValue() % 2 + "")) {
					System.err.println(ds);
					return ds;
				}
			}
		}
		System.err.println("发生异常");
		throw new IllegalArgumentException();
	}

	@Override
	public Properties getProps() {
		return null;
	}

	@Override
	public void init(Properties properties) {

	}
}
