Enumeration<String> parameterNames = req.getParameterNames();
	while (parameterNames.hasMoreElements())
	{
		String paramName = parameterNames.nextElement();

		String[] paramValues = req.getParameterValues(paramName);
		for (int i = 0; i < paramValues.length; i++)
		{
			String paramValue = paramValues[i];
			log.warning("\n"+paramName+"\t" + paramValue);
		}
	}