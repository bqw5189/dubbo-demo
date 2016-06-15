/*
 * Copyright 1999-2011 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.business.collector.consumer;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import net.business.collector.service.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;


/**
 * @author baiqw
 */
public class DemoAction {
    private CollectorSelector collectorSelector;

    public CollectorSelector getCollectorSelector() {
        return collectorSelector;
    }

    public void setCollectorSelector(CollectorSelector collectorSelector) {
        this.collectorSelector = collectorSelector;
    }

    public void start() throws Exception {
        Collector collector = collectorSelector.select("snmp");

        System.out.println("SUCESS: snmp: " + collector.request("snmp", null));

//        collector = CollectorSelector.select("telnet");
//
//        System.out.println("SUCESS: telnet: " + collector.request("telnet", null));
    }

}
