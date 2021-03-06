/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class JsonDataFormatPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public JsonDataFormatPropertyPlaceholderProvider(Object obj) {
        JsonDataFormat definition = (JsonDataFormat) obj;

        readPlaceholders.put("objectMapper", definition::getObjectMapper);
        writePlaceholders.put("objectMapper", definition::setObjectMapper);
        readPlaceholders.put("unmarshalTypeName", definition::getUnmarshalTypeName);
        writePlaceholders.put("unmarshalTypeName", definition::setUnmarshalTypeName);
        readPlaceholders.put("include", definition::getInclude);
        writePlaceholders.put("include", definition::setInclude);
        readPlaceholders.put("collectionTypeName", definition::getCollectionTypeName);
        writePlaceholders.put("collectionTypeName", definition::setCollectionTypeName);
        readPlaceholders.put("moduleClassNames", definition::getModuleClassNames);
        writePlaceholders.put("moduleClassNames", definition::setModuleClassNames);
        readPlaceholders.put("moduleRefs", definition::getModuleRefs);
        writePlaceholders.put("moduleRefs", definition::setModuleRefs);
        readPlaceholders.put("enableFeatures", definition::getEnableFeatures);
        writePlaceholders.put("enableFeatures", definition::setEnableFeatures);
        readPlaceholders.put("disableFeatures", definition::getDisableFeatures);
        writePlaceholders.put("disableFeatures", definition::setDisableFeatures);
        readPlaceholders.put("permissions", definition::getPermissions);
        writePlaceholders.put("permissions", definition::setPermissions);
        readPlaceholders.put("timezone", definition::getTimezone);
        writePlaceholders.put("timezone", definition::setTimezone);
        readPlaceholders.put("id", definition::getId);
        writePlaceholders.put("id", definition::setId);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }

}

