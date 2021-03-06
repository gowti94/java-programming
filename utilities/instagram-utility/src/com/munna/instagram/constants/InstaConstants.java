package com.munna.instagram.constants;

import java.util.concurrent.TimeUnit;

import com.munna.common.properties.PropertiesProvider;


/**
 * @author Mohammed Fathauddin
 * @since 2018
 */
public class InstaConstants {
	
	public static final int THREAD_COUNT = 10;

	public static final boolean THREAD_SLEEP_ENABLED = true;

	public static final long THREAD_SLEEP_DELAY = TimeUnit.MINUTES.toMillis(1);

	public static final int RETRY_COUNT = 5;	

	public static final String USER_DIRECTORY = System.getProperty("user.dir").concat(java.io.File.separator);

	public static final String CONF_FOLDER = USER_DIRECTORY.concat("conf").concat(java.io.File.separator);

	public static final String OUTPUT_FOLDER = USER_DIRECTORY.concat("output").concat(java.io.File.separator);

	public static final String CONFIGURATION_FILE = CONF_FOLDER.concat("config.properties");

	public static final String DEFAULT_IG_CONNECTION = "DEFAULT";
	
	public final static class AuthenticationConstant {
		
		public static final String USERNAME = "USERNAME";
		
		public static final String EMAIL = "EMAIL";
		
		public static final String PASSWORD = "PASSWORD";
		
		public static final String STOP_PROCESS = "STOP_PROCESS";
		
		public static final String HASHTAG = "FEED_TAGS";

		public static final String FIXEDCOUNT = "FOLLOWEING_COUNTS";
		
		public static final String IG_USERNAME = PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(USERNAME);
		
		public static final String HASH_TAGS = PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(HASHTAG);
		
		public static final String FIXED_COUNT = PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(FIXEDCOUNT);
		
		public static final String IG_EMAIL = PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(EMAIL);
		
		public static final String IG_PASSWORD = PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(PASSWORD);
		
		public static final Boolean IG_STOP_PROCESS = Boolean.parseBoolean(PropertiesProvider.getInstance().getProperties(InstaConstants.CONFIGURATION_FILE).getProperty(STOP_PROCESS));
		
	}

}
