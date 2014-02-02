package com.probridge.vbox.zk.converter;

import org.zkoss.zk.ui.Component;
import org.zkoss.zkplus.databind.TypeConverter;

public class VboxCoresConverter implements TypeConverter {

	@Override
	public Object coerceToUi(Object val, Component comp) {
		if (val == null)
			return IGNORE;
		return val + "核 / ";
	}

	@Override
	public Object coerceToBean(Object val, Component comp) {
		return IGNORE;
	}
}
