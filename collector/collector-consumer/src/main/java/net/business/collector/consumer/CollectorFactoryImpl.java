package net.business.collector.consumer;

import net.business.collector.entity.datatype.CollectorInfo;
import net.business.collector.entity.datatype.Parameter;
import net.business.collector.service.Collector;
import net.business.collector.service.CollectorFactory;

import java.util.ArrayList;

public class CollectorFactoryImpl implements CollectorFactory {
	@Override
	public Collector getConnection() {
		return null;
	}

	@Override
	public ArrayList<String> getIdentifyParameterNames(String prtcName) {
		return null;
	}

	@Override
	public CollectorInfo[] getAllCollectorInfos() {
		return new CollectorInfo[0];
	}

	@Override
	public String[] getAllCollectorNames() {
		return new String[0];
	}

	@Override
	public CollectorInfo getCollectorInfo(String prtcName) {
		return null;
	}

	@Override
	public Parameter[] getParameters(String prtcName) {
		return new Parameter[0];
	}

}
