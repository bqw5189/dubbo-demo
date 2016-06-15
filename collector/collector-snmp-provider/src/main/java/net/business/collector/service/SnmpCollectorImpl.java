package net.business.collector.service;

import net.business.collector.entity.datatype.NameValue;
import net.business.collector.exception.CollectorException;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Random;

/**
 * 采集器时下
 *
 * @baiwe
 */
public class SnmpCollectorImpl implements Collector {


    @Override
    public NameValue[] request(String name, HashMap<String, Object> param) throws CollectorException {
        return new NameValue[0];
    }

    @Override
    public Object execute(String cmd, HashMap args, long resourceId) {
        return null;
    }

    @Override
    public String getCharacter(String collectorType, HashMap<String, Object> hash) throws CollectorException {
        return null;
    }

    @Override
    public String getDefaultModelName(String collectorType, HashMap<String, Object> hash) throws CollectorException {
        return null;
    }

    @Override
    public void close() {

    }
}
