package com.probridge.vbox.zk.converter.copy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.zkoss.bind.BindContext;
import org.zkoss.bind.Converter;
import org.zkoss.zk.ui.Component;

public class VboxVhdLinkModeConverter implements Converter<Object, Object, Component> {

	private static HashMap<String, String> mapping = new HashMap<String, String>(5);
	static {
		mapping.put("0", "差异链接");
		mapping.put("1", "克隆");
		mapping.put("2", "直挂模式");
	}

	@Override
	public Object coerceToUi(Object val, Component comp, BindContext ctx) {
		if (!(val instanceof String))
			return IGNORED_VALUE;
		String ret = mapping.get((String) val);
		return (ret == null ? IGNORED_VALUE : ret);
	}

	@Override
	public Object coerceToBean(Object val, Component comp, BindContext ctx) {
		if (!(val instanceof String))
			return IGNORED_VALUE;
		Iterator<Entry<String, String>> it = mapping.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> cur = it.next();
			if (cur.getValue().equals(val))
				return cur.getKey();
		}
		return IGNORED_VALUE;
	}
}