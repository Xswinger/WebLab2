package dto;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class HeadersManager {
    private static HeadersManager instance = null;

    public static HeadersManager getInstance() {
        if (instance == null) {
            instance = new HeadersManager();
        }
        return instance;
    }

    private final Map<String, Long> headersMap;

    public HeadersManager() {
        this.headersMap = new HashMap<>();
    }

    public Map<String, Long> getHeadersMap() {
        return headersMap;
    }

    public void addHeadersOfNewRequest(Enumeration<String> headers) {
        while (headers.hasMoreElements()) {
            String key = headers.nextElement();
            headersMap.merge(key, 1L, Long::sum);
        }
    }
}
