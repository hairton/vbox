package com.probridge.vbox.zk.converter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

public class UserRoleConverter implements TypeConverter {

	private static HashMap<String, String> mapping = new HashMap<String, String>(5);
	static {
		mapping.put("ROLE_USER", "用户");
		mapping.put("ROLE_ADMIN", "系统管理员");
	}

	@Override
	public Object coerceToUi(Object val, Component comp) {
		if (!(val instanceof String))
			return IGNORE;
		String ret = mapping.get(val);
		return (ret == null ? IGNORE : ret);
	}

	@Override
	public Object coerceToBean(Object val, Component comp) {
		if (!(val instanceof String))
			return IGNORE;
		Iterator<Entry<String, String>> it = mapping.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> cur = it.next();
			if (cur.getValue().equals(val))
				return cur.getKey();
		}
		return IGNORE;
	}
}
