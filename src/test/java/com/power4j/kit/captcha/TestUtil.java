package com.power4j.kit.captcha;

/**
 * @author CJ (power4j@outlook.com)
 * @date 2021/1/15
 * @since 1.0
 */
public class TestUtil {

	public static final String PROP_TEST_OUTPUT = "testOutputDir";

	public static String getOutputDirectory() {
		String dir = System.getProperty(PROP_TEST_OUTPUT);
		if (dir == null || dir.isEmpty()) {
			dir = System.getProperty("java.io.tmpdir");
		}
		return dir;
	}

}
