package net.business.collector.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import net.business.collector.service.Collector;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tom on 16/6/15.
 */
public class CollectorSelector {
    private ReferenceConfig referenceConfig;
    private ReferenceConfigCache referenceConfigCache;

    public ReferenceConfig getReferenceConfig() {
        return referenceConfig;
    }

    public void setReferenceConfig(ReferenceConfig referenceConfig) {
        this.referenceConfig = referenceConfig;
    }

    public ReferenceConfigCache getReferenceConfigCache() {
        return referenceConfigCache;
    }

    public void setReferenceConfigCache(ReferenceConfigCache referenceConfigCache) {
        this.referenceConfigCache = referenceConfigCache;
    }

    public Collector select(String group){

        referenceConfig.setInterface(Collector.class);
        referenceConfig.setGroup(group);
        referenceConfig.setProtocol("dubbo");

        return (Collector)referenceConfigCache.get(referenceConfig);
    }

}
