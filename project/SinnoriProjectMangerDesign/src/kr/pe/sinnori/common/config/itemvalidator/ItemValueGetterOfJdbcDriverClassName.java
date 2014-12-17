package kr.pe.sinnori.common.config.itemvalidator;

import kr.pe.sinnori.common.config.AbstractItemValueGetter;
import kr.pe.sinnori.common.exception.ConfigValueInvalidException;

/**
 * jdbc connection url 항목 유효성 검사기  
 * @author "Won Jonghoon"
 *
 */
public class ItemValueGetterOfJdbcDriverClassName extends AbstractItemValueGetter {

	@Override
	public Object getItemValueWithValidation(String value) throws ConfigValueInvalidException {
		if (null == value) {
			String errorMessage = "parameter value is null";
			throw new ConfigValueInvalidException(errorMessage);
		}
		
		if (value.equals("")) {
			String errorMessage = "parameter value is empty";
			throw new ConfigValueInvalidException(errorMessage);
		}

		return value;
	}

	@Override
	public String toDescription() {
		return null;
	}
}